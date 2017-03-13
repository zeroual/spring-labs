package com.polytech.business;

import com.polytech.repository.PostRepository;

import java.util.ArrayList;
import java.util.List;

public class PublicationService {

    private PostRepository postRepository;

    public PublicationService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void post(Post post) {
        postRepository.save(post);
    }

    public List<Post> fetchAll() {
        return postRepository.findAll();
    }
}
