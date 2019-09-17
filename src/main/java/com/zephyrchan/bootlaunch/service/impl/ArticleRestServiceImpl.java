package com.zephyrchan.bootlaunch.service.impl;

import com.zephyrchan.bootlaunch.model.Article;
import com.zephyrchan.bootlaunch.service.IArticleRestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleRestServiceImpl implements IArticleRestService {
    @Override
    public Article saveArticle(Article article) {
        return article;
    }

    @Override
    public void deleteArticle(Long id) {

    }

    @Override
    public Article updateArticle(Article article) {
        return null;
    }

    @Override
    public Article getArticle(Long id) {
        return null;
    }

    @Override
    public List<Article> getAll() {
        return null;
    }
}
