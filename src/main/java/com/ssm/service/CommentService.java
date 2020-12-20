package com.ssm.service;

import com.ssm.domain.Comment;

import java.util.List;

public interface CommentService {

    public List<Comment> findAllComments();
    public void saveComment(Integer id,String content);
}
