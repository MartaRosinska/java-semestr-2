// Marta Rosińska
package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String test = "This is some sample text. Some text is sampled\n" +
            "for this purpose, but this text is merely a\n" +
            "sample.";

        Map<String, Integer> count = wordCount(test);
        System.out.println(count);
    }

    public static Map<String,Integer> wordCount(String text)
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
            if(map.containsKey(word))
            {
                Integer value = map.get(word);
                map.put(word, value + 1);
            }
            else
            {
                map.put(word, 1);
            }
        }

        return map;
    }
}
