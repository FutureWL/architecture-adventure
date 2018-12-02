package org.smart4j.plugin.security.tag;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.tags.RoleTag;

/**
 * ==========================
 * 功能描述：判断当前用户是否拥有其中所有的角色（逗号分隔，表示“与”的关系）
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class HasAllRolesTag extends RoleTag {

    private static final String ROLE_NAMES_DELIMITER = ",";

    @Override
    protected boolean showTagBody(String roleNames) {
        boolean hasAllRole = false;
        Subject subject = getSubject();
        if (subject != null) {
            if (subject.isPermittedAll(roleNames.split(ROLE_NAMES_DELIMITER))) {
                hasAllRole = true;
            }
        }
        return hasAllRole;
    }

}
