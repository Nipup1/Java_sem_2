package Practic_9;

import com.example.practicjava_2_next.Model.User;
import com.example.practicjava_2_next.Repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {
    UserRepository userRepository;

    @Transactional
    public String addUser(User user){
        log.info("ADD NEW USER");
        userRepository.save(user);
        return "added";
    }

    @Transactional
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Transactional
    public String deleteUserByName(String name){
        log.info("DELETE USER {}", name);
        userRepository.deleteById(userRepository.findUserByName(name).getUserid());
        return "deleted";
    }

    @Transactional
    public List<User> sortByName(){
        log.info("SORT USERS");
        return userRepository.findAll().stream()
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());
    }

}
