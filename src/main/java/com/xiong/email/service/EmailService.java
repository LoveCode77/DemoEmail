package com.xiong.email.service;

/**
 * @description：封装发邮件的接口
 * @Author MRyan
 * @Date 2020/4/18 20:38
 * @Version 1.0
 */
public interface EmailService {

    /**
     * 发送文本邮件
     * @param  from 发件人
     * @param to      收件人
     * @param subject 主题
     * @param content 内容
     */
    void sendSimpleMail(String from, String to, String subject, String content);

    /**
     * 发送HTML邮件
     *
     * @param to      收件人
     * @param subject 主题
     * @param content 内容
     */
    public void sendHtmlMail(String from, String to, String subject, String content);


    /**
     * 发送带附件的邮件
     *
     * @param to       收件人
     * @param subject  主题
     * @param content  内容
     * @param filePath 附件
     */
    public void sendAttachmentsMail(String from, String to, String subject, String content, String filePath);
}