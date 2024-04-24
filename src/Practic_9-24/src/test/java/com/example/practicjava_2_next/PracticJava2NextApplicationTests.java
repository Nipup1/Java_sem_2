package Practic_9;

import com.example.practicjava_2_next.Model.User;
import com.example.practicjava_2_next.Service.UserService;
import com.example.practicjava_2_next.Repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.doNothing;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class PracticJava2NextApplicationTests {
    @Mock
    private UserRepository userRepository;

    @Test
    void getUsers() {
        User user = new User();
        user.setName("Vasya");
        User user2 = new User();
        user2.setName("Dima");

        Mockito.when(userRepository.findAll()).thenReturn(List.of(user, user2));

        UserService userService = new UserService(userRepository);

        Assertions.assertEquals(2, userService.getAllUsers().size());
        Assertions.assertEquals("Vasya", userService.getAllUsers().get(0).getName());
    }

    @Test
    void addUser(){
        User user = new User();
        user.setName("Petya");

        Mockito.when(userRepository.findUserByName("Petya")).thenReturn(user);
        Mockito.when(userRepository.findAll()).thenReturn(List.of(user));

        UserService userService = new UserService(userRepository);

        Assertions.assertEquals("added", userService.addUser(user));
        Assertions.assertEquals(1, userService.getAllUsers().size());
        Assertions.assertEquals(user, userRepository.findUserByName(user.getName()));
    }
}
