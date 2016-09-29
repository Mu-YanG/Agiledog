package org.dennis.agiledog.service.impl;

import org.dennis.agiledog.model.Email;
import org.dennis.agiledog.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Gmail邮箱服务
 *
 * @author deng.zhang
 * @since 1.0.0
 * Created on 2016-09-29 19:23
 */
@Service
@Profile("prod")
public class GmailEmailServiceImpl implements EmailService {
    /**
     * logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(GmailEmailServiceImpl.class);

    @Override
    public boolean send(Email email) {
        LOGGER.info("[Gmail]发送邮件, 收件人: {}, 正文: {}", email.getTo(), email.getBody());
        return false;
    }
}
