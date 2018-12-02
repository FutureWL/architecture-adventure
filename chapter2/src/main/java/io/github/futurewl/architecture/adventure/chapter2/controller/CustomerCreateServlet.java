package io.github.futurewl.architecture.adventure.chapter2.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ==========================
 * 功能描述：创建客户
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
@WebServlet(name = "CustomerCreateServlet", urlPatterns = "/customer_create")
public class CustomerCreateServlet extends HttpServlet {

    /**
     * 进入 创建客户 页面
     *
     * @param req
     * @param resp
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        // TODO: 2018/7/17
    }

    /**
     * 处理 创建客户 请求
     *
     * @param req
     * @param resp
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        // TODO: 2018/7/17
    }
}
