package com.techmeskills.lesson12.task_2.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class ServiceRegex
 * Create method matchSearch
 * Looks for matches to constants
 */
public class ServiceRegex {

    public static void matchSearch(String regex, String text) {

        Pattern email = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
