package com.polytech.business;

import com.polytech.repository.PostRepository;

import java.util.List;

public class PublicationServiceImpl implements PublicationService {

    private PostRepository postRepository;

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
