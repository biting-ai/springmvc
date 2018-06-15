package com.jerryring.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jerryring
 * @version v1.0
 * @date 2018-06-15 14:32
 */
public class TestController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        // 获取 Controller 的名称，即地址
        System.out.println(httpServletRequest.getRequestURI());

        // 逻辑名
        return new ModelAndView("index");
    }
}
