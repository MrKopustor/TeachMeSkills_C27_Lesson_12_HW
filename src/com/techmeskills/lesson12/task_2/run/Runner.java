package com.techmeskills.lesson12.task_2.run;

import java.util.Scanner;

import static com.techmeskills.lesson12.task_2.service.ServiceRegex.matchSearch;
import static com.techmeskills.lesson12.task_2.constants.IRegex.*;

/**
 * Create class Runner
 * Read the information from the console
 * Call methods matchSearch
 */
public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a test text: ");
        String text = scanner.nextLine();

        System.out.println("email:");
        matchSearch(REGEX_EMAIL, text);
        System.out.println("phone number:");
        matchSearch(REGEX_PHONE_NUMBER, text);
        System.out.println("document number:");
        matchSearch(REGEX_DOCUMENT_NUMBER, text);

        scanner.close();
    }
}
