package edu.cqupt.d2.service;

import edu.cqupt.d2.domain.Article;
import edu.cqupt.d2.domain.Post;

import java.util.List;

public interface ArticleService {
    public Article getArticleByNo(double article_no);

    public Article getAllByNo(double articleNo);

    public List<Article> getLimitArticle(int start, int end);

    public int getCount();

    public void setArticle(Article article);

    public void setPath(String path,double no);

    /**
     * @param no 传入文章编号
     * @return 传回1 找到文章并已关入小黑屋 传回0 未找到文章
     */
    public int banArticle(double no);

    public int releaseArticle(double no);
}