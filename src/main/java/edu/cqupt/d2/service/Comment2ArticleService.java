package edu.cqupt.d2.service;

import edu.cqupt.d2.domain.Comment2Article;

import java.util.List;

public interface Comment2ArticleService {
    public List<Comment2Article> getCommentByArticleNo(double no);

    public void removeCommentByC2A_No(double no);

    public void setComment(Comment2Article comment2Article);

    /**
     * @param no 传入文章编号
     * @return 传回1 找到文章并已关入小黑屋 传回0 未找到文章
     */
    public int ban(double no);

    public int release(double no);
}