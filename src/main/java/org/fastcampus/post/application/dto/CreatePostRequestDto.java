package org.fastcampus.post.application.dto;

import org.fastcampus.post.domain.PostPublicationState;

public record CreatePostRequestDto(Long userId, String content, PostPublicationState state) {
}
