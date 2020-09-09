package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.ArticleMapper;
import edu.cqupt.d2.domain.Article;
import edu.cqupt.d2.domain.Comment2Article;
import edu.cqupt.d2.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;



@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    public Article getArticleByNo(double no) {
        // TODO Auto-generated method stub
        return articleMapper.selectByPrimaryKey(no);
    }

    @Override
    public Article getAllByNo(double article_no) {
        return articleMapper.selectAllByArticle_No(article_no);
    }

    @Override
    public List<Article> getLimitArticle(int start, int end) {
        return articleMapper.selectLimitedArticle(start,end);
    }

    @Override
    public int getCount() {
        return articleMapper.selectArticleCount();
    }

    @Override
    public void setArticle(Article article) {
        articleMapper.insertArticle(article);
    }

    @Override
    public void setPath(String path,double no) {
        articleMapper.updatePath(path,no);
    }


    @Override
    public int banArticle(double no) {
        Article article=articleMapper.selectAllByArticle_No(no);
        if (article!=null) {
        List<Comment2Article> comments =article.getComments();
        List<Double> nos = new ArrayList<Double>();
        for (Comment2Article c:comments) {
            nos.add(c.getC2A_No());
            System.out.println(c);
            System.out.println(comments);
        }
        articleMapper.deleteComments(nos);
        articleMapper.deleteArticle(article.getArticle_No());
        if (comments.get(0).getC2A_No()!=0) {
            articleMapper.insert2BanC2A(comments);
        }

            articleMapper.insert2BanArticle(article);
        return 1;
        }
        return 0;
    }

    @Override
    public int releaseArticle(double no) {
        Article article=articleMapper.RselectAllByArticle_No(no);
        if (article!=null) {
            List<Comment2Article> comments =article.getComments();
            List<Double> nos = new ArrayList<Double>();
            for (Comment2Article c:comments) {
                nos.add(c.getC2A_No());
            }
            articleMapper.RdeleteComments(nos);
            articleMapper.RdeleteArticle(article.getArticle_No());
            articleMapper.Rinsert2BanArticle(article);
            if (comments.get(0).getC2A_No()!=0) {
                articleMapper.Rinsert2BanC2A(comments);
            }
            return 1;
        }
        return 0;
    }




    public ArticleMapper getArticleMapper() {
        return articleMapper;
    }

    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

}