package org.smart4j.plugin.security;

import java.util.Set;

/**
 * ==========================
 * 功能描述：Smart Security 接口
 * 可在应用中实现该接口，或者在 smart.properties 文件提供以下基于 SQL 的配置项
 * <p>
 * smart.security.jdbc.authc_query：根据用户名获取密码
 * smart.security.jdbc.roles_query：根据用户名获取角色名集合
 * smart.security.jdbc.permissions_query：根据角色名获取权限名集合
 * <p>
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public interface SmartSecurity {

    /**
     * 根据用户名获取密码
     *
     * @param username 用户名
     * @return 密码
     */
    String getPassword(String username);

    /**
     * 根据用户名获取角色名集合
     *
     * @param username 用户名
     * @return 角色名集合
     */
    Set<String> getRoleNameSet(String username);

    /**
     * 根据角色名获取权限集合
     *
     * @param roleName 角色名
     * @return 权限名集合
     */
    Set<String> getPermissionNameSet(String roleName);

}
