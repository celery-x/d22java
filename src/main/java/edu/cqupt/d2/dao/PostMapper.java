package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.Article;
import edu.cqupt.d2.domain.Comment2Post;
import edu.cqupt.d2.domain.Post;
import edu.cqupt.d2.domain.Reply2Comment;

import java.util.List;

public interface PostMapper {

    Post selectByPrimaryKey(double no);

    Post selectAllByPost_No(double postNo);

    void updatePath(String path,double no);

    List<Post> selectLimitedPosts(int start,int end);

    void newInsertPost(Post post);
//改文件目录（代替删除）
    void updatePost(String content,double no);
//保存到小黑屋
    void insertbanPost(Post post);
//到小黑屋查
    Post RselectByPrimaryKey(double no);
//移回去
    void RupdatePost(String content,double no);
//删掉小黑屋
    void RdeletebanPost(double no);

    //关入小黑屋
    void delete3(List<Double> no);

    void delete2(List<Double> no);

    void delete1(double no);

    void insert1(Post post);

    void insert2(List<Comment2Post> comment2Posts);

    void insert3(List<Reply2Comment> reply2Comments);

    //放出小黑屋
    void Rdelete3(List<Double> no);

    void Rdelete2(List<Double> no);

    void Rdelete1(double no);

    void Rinsert1(Post post);

    void Rinsert2(List<Comment2Post> comment2Posts);

    void Rinsert3(List<Reply2Comment> reply2Comments);

    Post RselectAllByPost_No(double postNo);
}
