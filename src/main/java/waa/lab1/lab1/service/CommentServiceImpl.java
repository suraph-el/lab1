package waa.lab1.lab1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.lab1.lab1.domain.Comments;
import waa.lab1.lab1.repository.CommentRepository;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Override
    public List<Comments> findAll() {
        return commentRepository.findAll();
    }
    @Override
    public void addComment(Comments c){
        commentRepository.save(c);
    }
}
