package com.techmeskills.lesson12.task_1.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.techmeskills.lesson12.task_1.conts.IRegex.REGEX;

public class StringWork {

    public static void abbreviationSearch(String text){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(text.replaceAll("(?m)^\\s*$[\r\n]+", ""));

//        String newText = text.replaceAll("(?m)^\\s*$[\r\n]+", "");

        if (matcher.find()) {
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } else {
            System.out.println("No abbreviations were found in the text ");
        }
    }
}
