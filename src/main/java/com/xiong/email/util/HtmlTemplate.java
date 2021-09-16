package com.xiong.email.util;

public class HtmlTemplate {

    public static String addH1Style(String content){
        content="<h1>"+content+"</h1>";

        return content;
    }
    public static String addRedStyle(String content){
        content="<div style='color:red'>"+content+"</div>";
        return content;
    }
}
