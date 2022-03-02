package com.ipiecoles.java.mdd324.homepage;

import com.ipiecoles.java.mdd324.homepage.utils.Utils;
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {




        Genson genson = new GensonBuilder().useRuntimeType(true).create();
        String qod = Utils.getPageContents("https://gist.githubusercontent.com/pjvilloud/7c22281ce6a96a969bcb5b34e1383185/raw/1c6108961d6aae648f12f16b4a865c6e40918a4d/qod.json");
        Map<String, Object> map = genson.deserialize(qod, Map.class);
        String author = (String) map.get("baseurl");

        HashMap<String, Object> contents = (HashMap<String, Object>) map.get("contents");
        ArrayList quotes = (ArrayList) contents.get("quotes");
        HashMap<String, Object> quote = (HashMap<String, Object>) quotes.get(0);
        System.out.println(quote.get("quote"));
        System.out.println(quote.get("author"));

    }

}
