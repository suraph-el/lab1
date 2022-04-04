package waa.lab1.lab1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.lab1.lab1.domain.Post;
import waa.lab1.lab1.repository.PostRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;
    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post searchId(int id) {
        return getAllPosts().stream()
                .filter(post -> post.getId()==id)
                .findFirst()
                .get();
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public Optional<Post> findById(long id){
        return postRepository.findById(id);
    }

    @Override
    public List<Post> getPostsByTitle(String title) {
        return postRepository.getPostsByTitle(title);
    }
}
