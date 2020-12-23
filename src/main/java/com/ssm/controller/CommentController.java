package com.ssm.controller;

import com.ssm.domain.Comment;
import com.ssm.domain.User;
import com.ssm.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping("/commentShow")
    public String comment(Model model){
        //调用service的方法
        List<Comment> comments =commentService.findAllComments();
        model.addAttribute("comments", comments);
        return "comment";

    }
    @RequestMapping("/commentCommit")
    public String commentCommit(@RequestParam("content") String content, Model model, HttpServletRequest request, HttpServletResponse response, @RequestHeader(value = "referer", required = false) final String referer) throws IOException {
        //调用service的方法
        HttpSession session=request.getSession();
        System.out.println(session);
        User user= (User) session.getAttribute("USER_SESSION");
        if(content.length()!=0){
            commentService.saveComment(user.getId(),content);
        }else {
            PrintWriter out = null;
            response.setContentType("text/html;charset=UTF-8");
            out = response.getWriter();
            out.println("<script>");
            out.println("alert('评论不能为空！')");
            out.println("history.back();");
            out.println("</script>");
            out.close();
        }
        return "redirect:"+referer;
    }
}
