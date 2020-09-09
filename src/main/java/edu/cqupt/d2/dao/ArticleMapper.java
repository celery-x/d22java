package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.Article;
import edu.cqupt.d2.domain.Comment2Article;
import edu.cqupt.d2.domain.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ArticleMapper {

    Article selectByPrimaryKey(double article_No);

    Article selectAllByArticle_No(double article_No);

    List<Article> selectLimitedArticle(int start, int end);

    int selectArticleCount();

    void insertArticle(Article article);

    void updatePath(String path,double no);

    double selectLastId();

    //关入小黑屋
    void deleteArticle(double no);

    void insert2BanArticle(Article article);

    void deleteComments(List<Double> no);

    void insert2BanC2A(List<Comment2Article> comments);


    //放出小黑屋
    Article RselectAllByArticle_No(double no);

    void RdeleteArticle(double no);

    void Rinsert2BanArticle(Article article);

    void RdeleteComments(List<Double> no);

    void Rinsert2BanC2A(List<Comment2Article> comments);
}