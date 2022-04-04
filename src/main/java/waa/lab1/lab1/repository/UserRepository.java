package waa.lab1.lab1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.lab1.lab1.domain.Post;
import waa.lab1.lab1.domain.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();
    @Query("SELECT u FROM User u WHERE u.posts.size > :n")
    List<User> findByPostsGreaterThan(int n);
}
