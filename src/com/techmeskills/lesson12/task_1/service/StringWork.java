package com.techmeskills.lesson12.task_1.service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.techmeskills.lesson12.task_1.conts.IRegex.REGEX;

/**
 * Create class StringWork
 * Create method abbreviationSearch
 * Implement a method to search for abbreviations
 */
public class StringWork {

    public static void abbreviationSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text to be checked: ");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher((text.replaceAll("(?m)^\\s*$[\r\n]+", "")));

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        if (!matcher.find()) {
            System.out.println("No abbreviations were found in the text ");
        }
    }
}
