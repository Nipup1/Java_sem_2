package Practic_9;

import com.example.practicjava_2_next.Model.Post;
import com.example.practicjava_2_next.Model.User;
import com.example.practicjava_2_next.Repositories.PostRepository;
import com.example.practicjava_2_next.Repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PostController {
    PostRepository postRepository;
    UserRepository userRepository;

    @PostMapping("/add_post")
    public String addPost(@RequestBody Post post, @RequestParam Long id){
        Optional<User> user = userRepository.findById(id);
        user.get().getMyPosts().add(post);
        post.setUser(user.get());
        postRepository.save(post);
        return "added";
    }

    @GetMapping("/all_posts")
    public List<Post> allPosts(){
        return postRepository.findAll();
    }
}
