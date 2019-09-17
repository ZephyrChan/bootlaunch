package com.zephyrchan.bootlaunch.controller;


import com.zephyrchan.bootlaunch.model.AjaxResponse;
import com.zephyrchan.bootlaunch.model.Article;
import com.zephyrchan.bootlaunch.service.IArticleRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Slf4j
@RestController
@RequestMapping("/rest")
//@Api(tags = "00用户登录认证接口")
public class ArticleController {

    private IArticleRestService articleRestService;


//    @ApiOperation(value = "新增文章",tags = "Article")
    @RequestMapping(value = "/article", method = RequestMethod.POST, produces = "application/json")
    public AjaxResponse saveArticle(@RequestBody Article article) {

        log.info("saveArticle：{}",article);
        return AjaxResponse.success(article);
    }

    @RequestMapping(value = "/article/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public AjaxResponse deleteArticle(@PathVariable Long id) {

        log.info("deleteArticle：{}",id);
        return AjaxResponse.success(id);
    }

    @RequestMapping(value = "/article/{id}", method =RequestMethod.PUT, produces = "application/json")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody Article article) {
        article.setId(id);

        log.info("updateArticle：{}",article);
        return AjaxResponse.success(article);
    }

    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET, produces = "application/json")
    public AjaxResponse getArticle(@PathVariable Long id) {

        Article article1 = Article.builder().id(1L).author("zimug").content("spring boot 2.深入浅出").createTime(new Date()).title("t1").build();
        return AjaxResponse.success(article1);
    }
}
