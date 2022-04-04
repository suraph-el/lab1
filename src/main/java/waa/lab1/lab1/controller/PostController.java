package waa.lab1.lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import waa.lab1.lab1.domain.Post;
import waa.lab1.lab1.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping
    public void save(@RequestBody Post post) {
        postService.save(post);
    }

    @GetMapping
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Post getPostId(@PathVariable("id") int id){
        return postService.searchId(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void addPosts(@RequestBody Post p) {
        postService.save(p);
    }

    @GetMapping("/title")
    public List<Post> getPostsByTitle(String title)
    {
        return postService.getPostsByTitle(title);
    }
}
