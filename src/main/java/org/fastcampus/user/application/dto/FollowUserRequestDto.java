package org.fastcampus.user.application.dto;

public record FollowUserRequestDto(Long userId, Long targetUserId) {
}
