package com.zc.design.pattern.creational.prototype;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("邮件模板");
        for (int i=1; i<=10; i++){
            Mail cloneMail = (Mail) mail.clone();
            cloneMail.setContent("您中奖了!金额为"+i+",");
            cloneMail.setEmailAddress(i+"@163.com");
            cloneMail.setName(i+"");
            MailUtil.sendMail(cloneMail);
        }

        MailUtil.saveOriginMailRecord(mail);
    }
}
