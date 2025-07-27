package org.fastcampus.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/posts")
public class PostController {
    @GetMapping
    public List<Map<String, Object>> getPosts() {
        return List.of(
                Map.of(
                        "id", 1,
                        "content", Map.of(
                                "contentText", "첫 번째 게시글",
                                "datetimeInfo", Map.of("dateTime", "2025-07-27T13:00:00")
                        ),
                        "author", Map.of(
                                "info", Map.of("name", "홍길동")
                        ),
                        "likeCount", 5
                )
        );
    }
}
