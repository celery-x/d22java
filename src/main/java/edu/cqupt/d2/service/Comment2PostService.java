package edu.cqupt.d2.service;

import edu.cqupt.d2.domain.Comment2Post;

import java.util.List;

public interface Comment2PostService {
    public List<Comment2Post> getCommentByPost_No(double no);

    public Comment2Post getAllComment(double no);

    public void removeCommentByC2P_No(double no);

    public void setComment(Comment2Post comment2Post);

    /**
     * @param no 传入文章编号
     * @return 传回1 找到文章并已关入小黑屋 传回0 未找到文章
     */
    public int ban(double no);

    public int release(double no);
}