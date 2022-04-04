package waa.lab1.lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import waa.lab1.lab1.domain.Post;
import waa.lab1.lab1.domain.User;
import waa.lab1.lab1.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public void findAll(){
       userService.findAll();
    }
    @GetMapping("/{id}")

    public User findById(long id){
       return userService.findById(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public User save(User user){
       return userService.save(user);
    }

    @GetMapping("/{id}/posts")
    public List<Post> findPostsBYUserId(long id){
        return userService.findPostsBYUserId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUserById(id);
    }

    @GetMapping("/posts")
    public List<User> getUsersByNumberOfPosts(@RequestParam int n){
        return userService.findUsersByNumberOfPosts(n);
    }
}




