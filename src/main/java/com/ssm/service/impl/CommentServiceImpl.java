package com.ssm.service.impl;

import com.ssm.dao.CommentDao;
import com.ssm.dao.UserDao;
import com.ssm.domain.Comment;
import com.ssm.domain.Course;
import com.ssm.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;
    @Autowired
    private UserDao userDao;

    @Override
    public List<Comment> findAllComments() {
        List<Comment> comments = commentDao.findAllComments();
        return comments;
    }

    @Override
    public void saveComment(Integer id,String content) {
        Comment comment = new Comment();
        Date time = new Date();
        String name = userDao.findById(id).getUserName();
        comment.setContent(content);
        comment.setUid(id);
        comment.setTime(time);
        comment.setUname(name);
        commentDao.saveComment(comment);
    }

}
