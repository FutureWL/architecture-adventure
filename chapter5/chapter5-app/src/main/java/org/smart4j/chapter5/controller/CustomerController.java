package org.smart4j.chapter5.controller;

import org.smart4j.chapter5.model.Customer;
import org.smart4j.chapter5.service.CustomerService;
import io.github.futurewl.architecture.adventure.smart.framework.annotation.Action;
import io.github.futurewl.architecture.adventure.smart.framework.annotation.Controller;
import io.github.futurewl.architecture.adventure.smart.framework.annotation.Inject;
import io.github.futurewl.architecture.adventure.smart.framework.bean.Data;
import io.github.futurewl.architecture.adventure.smart.framework.bean.Param;
import io.github.futurewl.architecture.adventure.smart.framework.bean.View;

import java.util.List;
import java.util.Map;

/**
 * ==========================
 * 功能描述：客户控制器
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
@Controller
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @Action("get:/customer")
    public View index() {
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList", customerList);
    }

    public Data createSubmit(Param param) {
        Map<String, Object> fieldMap = param.getFieldMap();
        return null;
    }

}
