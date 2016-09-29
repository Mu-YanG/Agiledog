package org.dennis.agiledog.model;

import java.util.List;

/**
 * 邮件
 *
 * @author deng.zhang
 * @since 1.0.0
 * Created on 2016-09-29 19:06
 */
public class Email {
    /**
     * 收件人
     */
    private String to;
    /**
     * 抄送人(Carbon Copy)
     */
    private List<String> cc;
    /**
     * 密送人(Blind Carbon Copy)
     */
    private List<String> bcc;
    /**
     * 主题
     */
    private String subject;
    /**
     * 正文
     */
    private String body;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<String> getCc() {
        return cc;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
