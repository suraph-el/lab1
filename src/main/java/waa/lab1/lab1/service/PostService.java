package waa.lab1.lab1.service;

import waa.lab1.lab1.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> getAllPosts();
    Post searchId(int id);
    void save(Post post);
    Optional<Post> findById(long id);
    List<Post> getPostsByTitle(String title);


}
