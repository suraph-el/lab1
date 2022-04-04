package waa.lab1.lab1.service;

import waa.lab1.lab1.domain.Comments;

import java.util.List;

public interface CommentService {
    List<Comments> findAll();
    void addComment(Comments c);
}
