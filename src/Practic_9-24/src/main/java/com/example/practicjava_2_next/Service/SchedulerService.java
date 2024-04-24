package Practic_9;


import com.example.practicjava_2_next.Model.User;
import com.example.practicjava_2_next.Repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
@AllArgsConstructor
public class SchedulerService {

    private UserRepository userRepository;

    @Scheduled(cron = "*/30 * * * * *")
    public void doScheduledTask() {
        String directoryPath = "D:\\idea_Projects\\PracticJava_2_next\\User";

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
                file.delete();
            }
        }

        Path path = Paths.get(directoryPath, "users.txt");
        try {
            Files.createFile(path);
            try (FileWriter writer = new FileWriter(String.valueOf(path))) {
                List<User> users = userRepository.findAll();
                for (User user : users) {
                    writer.write("Id: " + user.getUserid()
                            + "\nName: " + user.getName()
                            + "\nLastName: " + user.getLastname() + "\n\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.err.println("Не удалось создать файл: " + path);
        }
    }
}
