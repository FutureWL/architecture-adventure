package org.smart4j.chapter5.cxf;

import javax.jws.WebService;

/**
 * ==========================
 * 功能描述：
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
@WebService
public interface HelloService {

    String say(String name);

}
