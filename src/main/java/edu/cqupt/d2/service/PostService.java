package edu.cqupt.d2.service;

import edu.cqupt.d2.domain.Article;
import edu.cqupt.d2.domain.Post;

import java.util.List;

public interface PostService {
    public Post getPostByNo(double id);
//传入帖子编号，传回此贴所有信息
    public Post getAllByNo(double postNo);
//传入起始帖子顺序号（时间倒叙） 传回对应范围内的帖子及其回复
    public List<Post> getLimitPosts(int start,int end);

    public void setPost(Post post);

    public void setPath(String path,double no);

    /**
     * @param no 传入文章编号
     * @return 传回1 找到文章并已关入小黑屋 传回0 未找到文章
     */
    public int ban(double no);

    public int release(double no);
}