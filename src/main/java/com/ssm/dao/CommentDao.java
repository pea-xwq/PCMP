package com.ssm.dao;

import com.ssm.domain.Comment;

import java.util.List;

public interface CommentDao {
    public List<Comment> findAllComments();
    public void saveComment(Comment c);

}
