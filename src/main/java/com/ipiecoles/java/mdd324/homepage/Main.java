package com.ipiecoles.java.mdd324.homepage;

import com.ipiecoles.java.mdd324.homepage.utils.Utils;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String news = Utils.getPageContents(" https://quotes.rest/qod.json");
        System.out.println(news);

        String author;
        String quote;
    }

}
