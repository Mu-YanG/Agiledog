package org.dennis.agiledog.service.impl;

import org.dennis.agiledog.model.Email;
import org.dennis.agiledog.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 网易邮箱服务
 *
 * @author deng.zhang
 * @since 1.0.0
 * Created on 2016-09-29 19:20
 */
@Service
@Profile("dev")
public class NeteaseEmailServiceImpl implements EmailService {
    /**
     * logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(NeteaseEmailServiceImpl.class);

    @Override
    public boolean send(Email email) {
        LOGGER.info("[Netease]发送邮件, 收件人: {}, 正文: {}", email.getTo(), email.getBody());
        return true;
    }
}
