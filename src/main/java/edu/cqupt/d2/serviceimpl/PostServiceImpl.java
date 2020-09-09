package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.PostMapper;
import edu.cqupt.d2.domain.Comment2Post;
import edu.cqupt.d2.domain.Post;
import edu.cqupt.d2.domain.Reply2Comment;
import edu.cqupt.d2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
        return (List<Post>) postMapper.selectLimitedPosts(start, end);
    }

    @Override
    public void setPost(Post post) {
        postMapper.newInsertPost(post);
    }

    @Override
    public void setPath(String path, double no) {
        postMapper.updatePath(path, no);
    }

    @Override
    public int ban(double no) {
        Post post = postMapper.selectAllByPost_No(no);

        if (post != null) {
            List<Comment2Post> c2ps = post.getComments();
            List<Reply2Comment> r2cs = new ArrayList<Reply2Comment>();
            List<Double> c2pnos = new ArrayList<Double>();
            List<Double> r2cnos = new ArrayList<Double>();
            if (c2ps != null) {
                for (Comment2Post c2p : c2ps) {
                    c2pnos.add(c2p.getC2P_No());
                    if (c2p.getComments() != null) {
                        for (int i = 0; i < c2p.getComments().size(); i++) {
                            r2cs.add(c2p.getComments().get(i));
                            r2cnos.add(c2p.getComments().get(i).getR2C_No());
                        }
                    }

//            postMapper.updatePost("null.temp",no);
//            postMapper.insertbanPost(post);

                }
            }
            postMapper.delete3(r2cnos);
            postMapper.delete2(c2pnos);
            postMapper.delete1(no);
            postMapper.insert1(post);
            postMapper.insert2(c2ps);
            postMapper.insert3(r2cs);
            return 1;
        }
        return 0;
    }

    @Override
    public int release(double no) {
//        Post post = postMapper.RselectByPrimaryKey(no);
//        if (post != null) {
//            postMapper.RupdatePost(post.getPost_Content(), no);
//            postMapper.RdeletebanPost(no);
//            return 1;
//        }
//        return 0;
        Post post = postMapper.RselectAllByPost_No(no);
        if (post != null) {
            List<Comment2Post> c2ps = post.getComments();
            List<Reply2Comment> r2cs = new ArrayList<Reply2Comment>();
            List<Double> c2pnos = new ArrayList<Double>();
            List<Double> r2cnos = new ArrayList<Double>();
            if (c2ps != null) {
                for (Comment2Post c2p : c2ps) {
                    c2pnos.add(c2p.getC2P_No());
                    if (c2p.getComments() != null) {
                        for (int i = 0; i < c2p.getComments().size(); i++) {
                            r2cs.add(c2p.getComments().get(i));
                            r2cnos.add(c2p.getComments().get(i).getR2C_No());
                        }
                    }
                }
            }
            postMapper.Rdelete3(r2cnos);
            postMapper.Rdelete2(c2pnos);
            postMapper.Rdelete1(no);
            postMapper.Rinsert1(post);
            postMapper.Rinsert2(c2ps);
            postMapper.Rinsert3(r2cs);
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