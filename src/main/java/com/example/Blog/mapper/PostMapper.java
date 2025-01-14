package com.example.Blog.mapper;

import com.example.Blog.dto.PostDto;
import com.example.Blog.entity.Post;

public class PostMapper {
    public PostDto mapToPostDto(Post post) {
        PostDto postDto = PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .shortDescription(post.getShortDescription())
                .createdOn(post.getCreatedOn())
                .updatedOn(post.getUpdatedOn())
                .build();
        return postDto;
    }

    public Post mapToPost(PostDto postDto) {
        return Post.builder()
                .id(postDto.getId())  // Assuming PostDto has an 'id' field
                .title(postDto.getTitle())
                .content(postDto.getContent())
                .shortDescription(postDto.getShortDescription())
                .createdOn(postDto.getCreatedOn())  // Assuming the createdOn field is set from the DTO
                .updatedOn(postDto.getUpdatedOn())  // Assuming the updatedOn field is set from the DTO
                .build();
    }
}
