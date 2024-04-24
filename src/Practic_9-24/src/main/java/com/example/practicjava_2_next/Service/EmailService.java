package Practic_9;

import com.example.practicjava_2_next.Model.User;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Async
    public void sendEmail(User user){
    }
}
