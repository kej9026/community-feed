package org.fastcampus.post.application.interfaces;

import org.fastcampus.post.domain.Post;

import java.util.Optional;

public interface PostRepository {
    Optional<Post> findById(Long id);
    Post save(Post post);
}
