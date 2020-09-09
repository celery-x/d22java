package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.Reply2CommentMapper;
import edu.cqupt.d2.domain.Reply2Comment;
import edu.cqupt.d2.service.Reply2CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service("reply2CommentService")
public class Reply2CommentServiceImpl implements Reply2CommentService {
    @Autowired
    private Reply2CommentMapper reply2CommentMapper;

    public List<Reply2Comment> getReplyByCommentNo(double id) {
        // TODO Auto-generated method stub
        return reply2CommentMapper.selectByCommentNo(id);
    }

    @Override
    public void setComment(Reply2Comment reply2Comment) {
        reply2CommentMapper.newInsertComment(reply2Comment);
    }

    @Override
    public int ban(double no) {
        Reply2Comment r2c=reply2CommentMapper.selectone(no);
        if (r2c!=null) {
            reply2CommentMapper.deleteComment(no);
            reply2CommentMapper.insertComment(r2c);
            return 1;
        }
        return 0;
    }

    @Override
    public int release(double no) {
        Reply2Comment r2c=reply2CommentMapper.Rselectone(no);
        if (r2c!=null) {
            reply2CommentMapper.RdeleteComment(no);
            reply2CommentMapper.RinsertComment(r2c);
            return 1;
        }
        return 0;
    }

    public Reply2CommentMapper getReply2CommentMapper() {
        return reply2CommentMapper;
    }

    public void setReply2CommentMapper(Reply2CommentMapper reply2CommentMapper) {
        this.reply2CommentMapper = reply2CommentMapper;
    }
}