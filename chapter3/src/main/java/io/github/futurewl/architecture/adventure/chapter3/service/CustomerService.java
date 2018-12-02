package io.github.futurewl.architecture.adventure.chapter3.service;

import io.github.futurewl.architecture.adventure.chapter3.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author weilai create by 2018-12-02:18:34
 * @version 1.0
 */
public interface CustomerService {

    /**
     * 获得 客户列表
     *
     * @return 客户列表
     */
    List<Customer> getCustomerList();

    /**
     * 获得 客户基本信息
     *
     * @param id 客户 ID
     * @return 基本信息
     */
    Customer getCustomer(long id);

    /**
     * 获得 创建客户处理结果
     *
     * @param fieldMap 客户参数
     * @return 处理结果
     */
    boolean createCustomer(Map<String, Object> fieldMap);

    /**
     * 更新 客户请求
     *
     * @param id       客户id
     * @param fieldMap 客户参数
     * @return 更新结果
     */
    boolean updateCustomer(long id, Map<String, Object> fieldMap);

    /**
     * 处理 删除客户请求
     *
     * @param id 客户id
     * @return 处理结果
     */
    boolean deleteCustomer(long id);

}
