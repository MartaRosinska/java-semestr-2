// Marta Rosińska
package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String test = "This is some sample text. Some text is sampled\n" +
            "for this purpose, but this text is merely a\n" +
            "sample.";

        ArrayList<String> count = wordCount(test);
        System.out.println(count);
    }

    public static ArrayList<String> wordCount(String text)
    {
        //usunac znaki
        text = text.replace(".","");
        text = text.replace(",","");
        text = text.replace(":","");
        text = text.replace(";","");
        text = text.replace("(","");
        text = text.replace(")","");
        text = text.replace("\n"," ");

        //zmienic wielkosc liter
        text = text.toLowerCase();

        //oddzielic slowa
        String[] splitedText = text.split(" ");

        //policzyc ile slow
        Map<String,Integer> map= new HashMap<String, Integer>();
        for(String word: splitedText)
        {
            map.put(word, 1);
        }

        return new ArrayList<String>(map.keySet());
    }
}
