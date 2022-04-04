package waa.lab1.lab1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.lab1.lab1.domain.Post;

import java.util.List;
@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findAll();

    @Query("SELECT p FROM Post p WHERE p.title = :title")
    List<Post> getPostsByTitle(String title);


}
