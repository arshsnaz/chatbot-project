package com.chatbot;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupTest {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://docs.zeotap.com/home/en-us/").get();
            System.out.println("Title: " + doc.title());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
