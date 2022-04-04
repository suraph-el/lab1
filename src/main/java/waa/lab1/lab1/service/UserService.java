package waa.lab1.lab1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import waa.lab1.lab1.domain.Post;
import waa.lab1.lab1.domain.User;
import waa.lab1.lab1.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public void findAll(){
        userRepository.findAll();

    }



    public User save(User user){
      return  userRepository.save(user);
    }

    public  List<Post> findPostsBYUserId(long id){
        return userRepository.findById(id).get().getPosts();
    }

    public User findById(long id){
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    public List<User> findUsersByNumberOfPosts(int n){
      return  userRepository.findByPostsGreaterThan(n);
    }



}
