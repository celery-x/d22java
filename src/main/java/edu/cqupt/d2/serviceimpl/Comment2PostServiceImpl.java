package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.Comment2PostMapper;
import edu.cqupt.d2.domain.Article;
import edu.cqupt.d2.domain.Comment2Article;
import edu.cqupt.d2.domain.Comment2Post;
import edu.cqupt.d2.domain.Reply2Comment;
import edu.cqupt.d2.service.Comment2PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service("comment2PostService")
public class Comment2PostServiceImpl implements Comment2PostService {
    @Autowired
    private Comment2PostMapper comment2PostMapper;

    public List<Comment2Post> getCommentByPost_No(double no) {
        // TODO Auto-generated method stub
        return comment2PostMapper.selectByPost_No(no);
    }

    @Override
    public Comment2Post getAllComment(double no) {
        return comment2PostMapper.selectAllByComment_No(no);
    }

    @Override
    public void removeCommentByC2P_No(double no) {
        comment2PostMapper.deleteByC2P_No(no);
    }

    @Override
    public void setComment(Comment2Post comment2Post) {
        comment2PostMapper.insertComment(comment2Post);
    }

    @Override
    public int ban(double no) {
        Comment2Post c2p=comment2PostMapper.selectAllByComment_No(no);
        if (c2p!=null) {
            List<Reply2Comment> comments =c2p.getComments();
            List<Double> nos = new ArrayList<Double>();
            for (Reply2Comment c:comments) {

                nos.add(c.getR2C_No());

            }
            comment2PostMapper.delete2(nos);
            comment2PostMapper.delete1(c2p.getC2P_No());
            comment2PostMapper.insert1(c2p);
            if (comments.get(0).getR2C_No()!=0) {
                comment2PostMapper.insert2(comments);
            }
            return 1;
        }
        return 0;
    }

    @Override
    public int release(double no) {
        Comment2Post c2p=comment2PostMapper.RfindAll(no);
        if (c2p!=null) {
            List<Reply2Comment> comments =c2p.getComments();
            List<Double> nos = new ArrayList<Double>();
            for (Reply2Comment c:comments) {

                nos.add(c.getR2C_No());

            }
            comment2PostMapper.Rdelete2(nos);
            comment2PostMapper.Rdelete1(c2p.getC2P_No());
            comment2PostMapper.Rinsert1(c2p);
            if (comments.get(0).getR2C_No()!=0) {
                comment2PostMapper.Rinsert2(comments);
            }
            return 1;
        }
        return 0;
    }

    public Comment2PostMapper getUserMapper() {
        return comment2PostMapper;
    }

    public void setUserMapper(Comment2PostMapper comment2PostMapper) {
        this.comment2PostMapper = comment2PostMapper;
    }

}