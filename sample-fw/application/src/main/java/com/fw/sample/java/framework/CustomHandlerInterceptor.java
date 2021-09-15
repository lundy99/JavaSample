package com.fw.sample.java.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
　Spring MVCのHandler（＝Controller）の呼び出し前後に実行する共通処理を定義
 */
public class CustomHandlerInterceptor implements HandlerInterceptor {

  private static final Logger logger = LoggerFactory.getLogger(CustomHandlerInterceptor.class);

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    logger.info("RequestStart : {} {} {}" , request, response, handler);
    // Handlerメソッドが呼び出される前に行う処理を実装する
    // (実装は省略)→Token確認など？

    // Handlerメソッドを呼び出す場合はtrueを返却する
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    logger.info("RequestEnd : {} {} {} {}" , request, response, handler, modelAndView);
    // Handlerメソッドが正常終了した後に行う処理を実装する(例外が発生した場合は、このメソッドは呼び出されない)
    // (実装は省略)
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    logger.info("RequestAfterCompletion : {} {} {} {}" , request, response, handler, ex);
    // Handlerメソッドの呼び出しが完了した後に行う処理を実装する(例外が発生しても、このメソッドは呼び出される)
    // (実装は省略)
  }

}
