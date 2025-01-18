package com.example.Blog.mapper;

import com.example.Blog.dto.CommentDto;
import com.example.Blog.entity.Comments;

public class CommentMapper {
    public static CommentDto mapToCommentDto(Comments comment) {
        CommentDto commentDto = CommentDto.builder()
                .id(comment.getId())
                .name(comment.getName())
                .updatedOn(comment.getUpdatedOn())
                .email(comment.getEmail())
                .content(comment.getContent())
                .createdOn(comment.getCreatedOn())
                .build();
        return commentDto ;

    }

    public static  Comments mapToComment(CommentDto commentDto){
        return Comments.builder()
                .id(commentDto.getId())
                .name(commentDto.getName())
                .updatedOn(commentDto.getUpdatedOn())
                .email(commentDto.getEmail())
                .content(commentDto.getContent())
                .createdOn(commentDto.getCreatedOn())
                .build();
    }
}
