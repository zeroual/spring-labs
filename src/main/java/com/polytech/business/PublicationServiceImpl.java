package com.polytech.business;

import com.polytech.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationServiceImpl implements PublicationService {

    private PostRepository postRepository;

    @Autowired
    public PublicationServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void post(Post post) {
        postRepository.save(post);
    }

    public List<Post> fetchAll() {
        return postRepository.findAll();
    }
}
