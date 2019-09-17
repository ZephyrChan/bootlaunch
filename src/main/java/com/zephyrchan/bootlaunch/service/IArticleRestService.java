package com.zephyrchan.bootlaunch.service;

import com.zephyrchan.bootlaunch.model.Article;

import java.util.List;

public interface IArticleRestService {

     Article saveArticle(Article article);

     void deleteArticle(Long id);

     Article updateArticle(Article article);

     Article getArticle(Long id);

     List<Article> getAll();
}