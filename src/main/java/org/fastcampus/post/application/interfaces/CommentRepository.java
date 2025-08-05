package org.fastcampus.post.application.interfaces;

import org.fastcampus.post.domain.comment.Comment;

import java.util.Optional;

public interface CommentRepository {
    Optional<Comment> findById(Long id);
    Comment save(Comment comment);
}
