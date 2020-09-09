package edu.cqupt.d2.service;

import edu.cqupt.d2.domain.Reply2Comment;

import java.util.List;

public interface Reply2CommentService {
    public List<Reply2Comment>  getReplyByCommentNo(double no);

    public void setComment(Reply2Comment reply2Comment);

    /**
     * @param no 传入文章编号
     * @return 传回1 找到文章并已关入小黑屋 传回0 未找到文章
     */
    public int ban(double no);

    public int release(double no);
}