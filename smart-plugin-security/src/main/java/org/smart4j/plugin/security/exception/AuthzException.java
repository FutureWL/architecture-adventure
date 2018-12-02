package org.smart4j.plugin.security.exception;

/**
 * ==========================
 * 功能描述：授权异常（当权限无效时抛出）
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class AuthzException extends RuntimeException {

    public AuthzException() {
    }

    public AuthzException(String message) {
        super(message);
    }

    public AuthzException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthzException(Throwable cause) {
        super(cause);
    }
}
