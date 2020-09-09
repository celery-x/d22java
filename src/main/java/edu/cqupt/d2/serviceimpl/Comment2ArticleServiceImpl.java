package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.Comment2ArticleMapper;
import edu.cqupt.d2.domain.Comment2Article;
import edu.cqupt.d2.service.Comment2ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service("comment2ArticleService")
public class Comment2ArticleServiceImpl implements Comment2ArticleService {
    @Autowired
    private Comment2ArticleMapper comment2ArticleMapper;

    public List<Comment2Article> getCommentByArticleNo(double no) {
        // TODO Auto-generated method stub
        return (List<Comment2Article>) comment2ArticleMapper.selectByArticle_No(no);
    }

    @Override
    public void removeCommentByC2A_No(double no) {
        comment2ArticleMapper.deleteByC2A_No(no);
    }

    @Override
    public void setComment(Comment2Article comment2Article) {
        comment2ArticleMapper.newInsertComment(comment2Article);
    }

    @Override
    public int ban(double no) {
        Comment2Article c2a=comment2ArticleMapper.selectone(no);
        if (c2a!=null) {
            comment2ArticleMapper.deleteComment(no);
            comment2ArticleMapper.insertComment(c2a);
            return 1;
        }
        return 0;
    }

    @Override
    public int release(double no) {
        Comment2Article c2a=comment2ArticleMapper.Rselectone(no);
        if (c2a!=null) {
            comment2ArticleMapper.RdeleteComment(no);
            comment2ArticleMapper.RinsertComment(c2a);
            return 1;
        }
        return 0;
    }

    public Comment2ArticleMapper getComment2ArticleMapper() {
        return comment2ArticleMapper;
    }

    public void setComment2ArticleMapper(Comment2ArticleMapper comment2ArticleMapper) {
        this.comment2ArticleMapper = comment2ArticleMapper;
    }

}