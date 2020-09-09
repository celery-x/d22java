package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.Comment2Article;
import edu.cqupt.d2.domain.Reply2Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Comment2ArticleMapper {

    List<Comment2Article> selectByArticle_No(double no);

    void deleteByC2A_No(double no);

    void newInsertComment(Comment2Article comment2Article);

    //关入小黑屋
    Comment2Article selectone(double no);

    void deleteComment(double no);

    void insertComment(Comment2Article c2a);

    //放出小黑屋
    Comment2Article Rselectone(double no);

    void RdeleteComment(double no);

    void RinsertComment(Comment2Article c2a);
}