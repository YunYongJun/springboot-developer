package me.yunyongjun.springbootdeveloper.config.error.exception;

import me.yunyongjun.springbootdeveloper.config.error.ErrorCode;

public class ArticleNotFoundException extends NotFoundException {

    public ArticleNotFoundException() {
        super(ErrorCode.ARTICLE_NOT_FOUND);
    }
}
