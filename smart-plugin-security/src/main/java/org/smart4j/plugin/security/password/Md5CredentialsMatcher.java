package org.smart4j.plugin.security.password;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import io.github.futurewl.architecture.adventure.chapter3.util.CodecUtil;

/**
 * ==========================
 * 功能描述：MD5密码匹配器
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class Md5CredentialsMatcher implements CredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken authenticationToken, AuthenticationInfo authenticationInfo) {
        // 获取从表单提交过来的密码、明文，尚未通过 MD5 加密
        String submitted = String.valueOf(((UsernamePasswordToken) authenticationToken).getPassword());
        // 获取从数据库中存储的密码，已通过 MD5 加密
        String encrypted = String.valueOf(authenticationInfo.getCredentials());
        return CodecUtil.md5(submitted).equals(encrypted);
    }

}
