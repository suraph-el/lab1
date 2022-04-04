package waa.lab1.lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import waa.lab1.lab1.domain.Comments;
import waa.lab1.lab1.service.CommentService;

import javax.xml.stream.events.Comment;
import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    @Autowired
    CommentService commentService;


    @GetMapping
    public List<Comments> getAllComments(){
        return commentService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void addComments(@RequestBody Comments comment ){
        commentService.addComment(comment);
    }

}
