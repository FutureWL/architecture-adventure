package org.smart4j.plugin.security.realm;

import org.apache.shiro.realm.jdbc.JdbcRealm;
import io.github.futurewl.architecture.adventure.chapter3.helper.DatabaseHelper;
import org.smart4j.plugin.security.SecurityConfig;
import org.smart4j.plugin.security.password.Md5CredentialsMatcher;

/**
 * ==========================
 * 功能描述：基于 Smart 的 JDBC Realm（需要提供相关 smart.plugin.security.jdbc.* 配置项）
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class SmartJdbcRealm extends JdbcRealm {
    public SmartJdbcRealm() {
        super.setDataSource(DatabaseHelper.getDataSource());
        super.setAuthenticationQuery(SecurityConfig.getJdbcAuthcQuery());
        super.setUserRolesQuery(SecurityConfig.getJdbcRolesQuery());
        super.setPermissionsQuery(SecurityConfig.getJdbcPermissionsQuery());
        super.setPermissionsLookupEnabled(true);
        super.setCredentialsMatcher(new Md5CredentialsMatcher());
    }
}
