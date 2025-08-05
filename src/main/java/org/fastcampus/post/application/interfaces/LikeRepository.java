package org.fastcampus.post.application.interfaces;

import org.fastcampus.post.domain.Post;
import org.fastcampus.post.domain.comment.Comment;
import org.fastcampus.user.domain.User;

public interface LikeRepository {
    boolean checkLike(Post post, User user);
    boolean checkLike(Comment post, User user);
    void like(Post post, User user);
    void like(Comment comment, User user);
    void unlike(Post post, User user);
    void unlike(Comment comment, User user);
}
