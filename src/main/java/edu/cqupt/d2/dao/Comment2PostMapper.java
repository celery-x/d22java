package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.Article;
import edu.cqupt.d2.domain.Comment2Article;
import edu.cqupt.d2.domain.Comment2Post;
import edu.cqupt.d2.domain.Reply2Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Comment2PostMapper {

    List<Comment2Post> selectByPost_No(double Post_No);

    void deleteByC2P_No(double no);

    void insertComment(Comment2Post comment2Post);

    Comment2Post selectAllByComment_No(double Comment_No);

    //关入小黑屋
    void delete1(double no);

    void insert1(Comment2Post c2p);

    void delete2(List<Double> no);

    void insert2(List<Reply2Comment> c2p);

    //放出小黑屋
    Comment2Post RfindAll(double no);

    void Rdelete1(double no);

    void Rinsert1(Comment2Post comment2Post);

    void Rdelete2(List<Double> no);

    void Rinsert2(List<Reply2Comment> comments);
}