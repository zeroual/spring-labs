package com.polytech.business;

import java.util.List;

public interface PublicationService {
    void post(Post post);

    List<Post> fetchAll();
}
