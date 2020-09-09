package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.Comment2Post;
import edu.cqupt.d2.domain.Reply2Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Reply2CommentMapper {

    List<Reply2Comment>  selectByCommentNo(double postNo);

    void newInsertComment(Reply2Comment reply2Comment);

    //关入小黑屋
    Reply2Comment selectone(double no);

    void deleteComment(double no);

    void insertComment(Reply2Comment reply2Comment);

    //放出小黑屋
    Reply2Comment Rselectone(double no);

    void RdeleteComment(double no);

    void RinsertComment(Reply2Comment reply2Comment);



}