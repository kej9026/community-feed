package org.fastcampus.post.application;

import org.fastcampus.post.application.dto.CreatePostRequestDto;
import org.fastcampus.post.application.dto.UpdatePostRequestDto;
import org.fastcampus.post.application.interfaces.LikeRepository;
import org.fastcampus.post.application.interfaces.PostRepository;
import org.fastcampus.post.domain.Post;
import org.fastcampus.user.application.UserService;
import org.fastcampus.user.domain.User;

public class PostService {
    private final UserService userService;
    private final PostRepository postRepository;
    private final LikeRepository likeRepository;

    public PostService(UserService userService, PostRepository postRepository, LikeRepository likeRepository){
        this.userService=userService;
        this.postRepository=postRepository;
        this.likeRepository=likeRepository;
    }

    public Post getPost(Long id){
        return postRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Post not found"));
    }

    public Post createPost(CreatePostRequestDto dto){
        User author=userService.getUser(dto.userId());
        Post post = new Post(null, author, dto.content());
        return postRepository.save(post);
    }

    public Post updatePost(UpdatePostRequestDto dto){
        Post post=getPost(dto.postId());
        User user = userService.getUser(dto.userId());

        post.updateContent(user, dto.content());
        post.updateState;
    }
}
