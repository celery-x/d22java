package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.PostMapper;
import edu.cqupt.d2.domain.Post;
import edu.cqupt.d2.domain.Reply2Comment;
import edu.cqupt.d2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service("postService")
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;

    public Post getPostByNo(double no) {
        // TODO Auto-generated method stub
        return postMapper.selectByPrimaryKey(no);
    }

    @Override
    public Post getAllByNo(double postNo) {
        return postMapper.selectAllByPost_No(postNo);
    }

    @Override
    public List<Post> getLimitPosts(int start, int end) {
        return (List<Post>) postMapper.selectLimitedPosts(start,end);
    }

    @Override
    public void setPost(Post post) {
        postMapper.newInsertPost(post);
    }

    @Override
    public void setPath(String path, double no) {
        postMapper.updatePath(path,no);
    }

    @Override
    public int ban(double no) {
        Post post=postMapper.selectByPrimaryKey(no);
        if (post!=null) {
            postMapper.updatePost("null.temp",no);
            postMapper.insertbanPost(post);
            return 1;
        }
        return 0;
    }

    @Override
    public int release(double no) {
        Post post=postMapper.RselectByPrimaryKey(no);
        if (post!=null) {
            postMapper.RupdatePost(post.getPost_Content(),no);
            postMapper.RdeletebanPost(no);
            return 1;
        }
        return 0;
    }

    public PostMapper getPostMapper() {
        return postMapper;
    }

    public void setPostMapper(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

}