package com.ssm.dao;

import com.ssm.domain.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao {
    public List<Comment> findAllComments();
    public void saveComment(Comment c);
}
