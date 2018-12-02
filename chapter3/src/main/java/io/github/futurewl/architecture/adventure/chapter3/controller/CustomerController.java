package io.github.futurewl.architecture.adventure.chapter3.controller;

import io.github.futurewl.architecture.adventure.chapter3.model.Customer;
import io.github.futurewl.architecture.adventure.chapter3.service.CustomerService;
import io.github.futurewl.architecture.adventure.smart.framework.annotation.Action;
import io.github.futurewl.architecture.adventure.smart.framework.annotation.Controller;
import io.github.futurewl.architecture.adventure.smart.framework.annotation.Inject;
import io.github.futurewl.architecture.adventure.smart.framework.bean.Data;
import io.github.futurewl.architecture.adventure.smart.framework.bean.Param;
import io.github.futurewl.architecture.adventure.smart.framework.bean.View;

import java.util.List;
import java.util.Map;

/**
 * 功能描述：我们的目标是打造一个轻量级的 MVC 框架，而 Controller 是 MVC 的核心。
 * 其实我们想要的是这样的 Controller 代码
 *
 * @author weilai create by 2018-12-02:18:33
 * @version 1.0
 */
@Controller
public class CustomerController {

    @Inject
    private CustomerService customerService;

    /**
     * 进入 客户列表 页面
     *
     * @param param
     * @return
     */
    @Action("get:/customer")
    public View index(Param param) {
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList", customerList);
    }

    /**
     * 显示 客户基本信息
     *
     * @param param
     * @return
     */
    @Action("get:/customer_show")
    public View shoe(Param param) {
        long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new View("customer_show.jsp").addModel("customer", customer);
    }

    /**
     * 进入 创建客户 界面
     *
     * @param param 请求参数
     * @return
     */
    @Action("get:/customer_create")
    public View create(Param param) {
        return new View("customer_create.jsp");
    }

    /**
     * 处理 创建客户 请求
     *
     * @param param 请求参数
     * @return 请求结果
     */
    @Action("post:/customer_create")
    public Data createSubmit(Param param) {
        Map<String, Object> fieldMap = param.getFieldMap();
        boolean result = customerService.createCustomer(fieldMap);
        return new Data(result);
    }

    /**
     * 进入 编辑客户 界面
     *
     * @param param
     * @return
     */
    @Action("get:/customer_edit")
    public View edit(Param param) {
        long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new View("customer_edit.jsp").addModel("customer", customer);
    }

    /**
     * 处理 编辑客户 请求
     *
     * @param param
     * @return
     */
    @Action("put:/customer_edit")
    public Data editSubmit(Param param) {
        long id = param.getLong("id");
        Map<String, Object> fieldMap = param.getFieldMap();
        boolean result = customerService.updateCustomer(id, fieldMap);
        return new Data(result);
    }

    /**
     * 处理 删除客户 请求
     *
     * @param param 请求参数
     * @return 请求结果
     */
    @Action("delete:/customer_edit")
    public Data delete(Param param) {
        long id = param.getLong("id");
        boolean result = customerService.deleteCustomer(id);
        return new Data(result);
    }

}
