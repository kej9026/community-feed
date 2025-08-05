package org.fastcampus.post.application.dto;

public record CreateCommentRequestDto(
        Long postId,
        Long authorId,
        String content
) {
}
