package io.github.futurewl.architecture.adventure.chapter4.service;

import io.github.futurewl.architecture.adventure.chapter4.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.github.futurewl.architecture.adventure.smart.framework.annotation.Service;
import io.github.futurewl.architecture.adventure.smart.framework.annotation.Transaction;
import io.github.futurewl.architecture.adventure.smart.framework.helper.DatabaseHelper;

import java.util.List;
import java.util.Map;

/**
 * ==========================
 * 功能描述：提供客户数据服务
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
@Service
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);


    /**
     * 获取客户列表
     *
     * @return
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     *
     * @param id
     * @return
     */
    public Customer getCustomer(Long id) {
        String sql = "SELECT * FROM customer WHERE id=?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    /**
     * 创建客户
     *
     * @param fieldMap
     * @return
     */
    @Transaction
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     *
     * @param id
     * @param fieldMap
     * @return
     */
    @Transaction
    public boolean updateCustomer(Long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     *
     * @param id
     * @return
     */
    @Transaction
    public boolean deleteCustomer(Long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }

}
