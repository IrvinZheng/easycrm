package com.easy.support;

import com.easy.bean.Reply;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Irvin on 2017/06/14.
 * 统一异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public @ResponseBody Reply defaultErrorHandler(Exception e) throws Exception {
        e.printStackTrace();
        return Reply.error();
    }
}
