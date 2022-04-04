package waa.lab1.lab1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.lab1.lab1.domain.Comments;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comments, Long> {
    List<Comments> findAll();
}
