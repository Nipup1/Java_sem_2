package Practic_9;

import com.example.practicjava_2_next.Model.User;
import com.example.practicjava_2_next.Repositories.UserRepository;
import com.example.practicjava_2_next.Service.EmailService;
import com.example.practicjava_2_next.Service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
@Slf4j
public class UserController {

    private UserService userService;
    private EmailService emailService;

    @PostMapping("/add_user")
    public @ResponseBody String addUser(@RequestBody User user){
        emailService.sendEmail(user);
        return userService.addUser(user);
    }

    @GetMapping("/all_users")
    public @ResponseBody List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete_user")
    public @ResponseBody String deleteUserByName(@RequestParam String name){
        return userService.deleteUserByName(name);
    }

    @GetMapping("/sort")
    public @ResponseBody List<User> sortByName(){
        return userService.sortByName();
    }

    @GetMapping("/home")
    public String getHome(){
        return "<h3>Жариков Николай</h3>" +
                "<div>ИКБО-16-22</div>" +
                "<div>Вариант №6</div>";
    }
}
