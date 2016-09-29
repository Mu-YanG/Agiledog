package org.dennis.agiledog.service;

import org.dennis.agiledog.model.Email;

/**
 * 邮件服务
 *
 * @author deng.zhang
 * @since 1.0.0
 * Created on 2016-09-29 19:05
 */
public interface EmailService {
    /**
     * 发送邮件
     *
     * @param email 邮件
     * @return 发送成功, 返回true; 否则返回false
     */
    boolean send(Email email);
}
