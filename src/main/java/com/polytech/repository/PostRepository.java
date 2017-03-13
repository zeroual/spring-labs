package com.polytech.repository;

import com.polytech.business.Post;

import java.util.List;

public interface PostRepository {
    void save(Post post);

    List<Post> findAll();
}
