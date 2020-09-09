package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.Article;
import edu.cqupt.d2.domain.Comment2Post;
import edu.cqupt.d2.domain.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
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

}