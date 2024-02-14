package com.techmeskills.lesson12.task_1.run;

import java.util.Scanner;

import static com.techmeskills.lesson12.task_1.service.StringWork.abbreviationSearch;

public class Runner {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the text to be checked: ");
//        String text = scanner.nextLine();

        String text = "DRY Programming Principle - don't repeat yourself\n" +
                "\n" +
                "What does this principle mean? What does it mean? In this case, it means repeating some entities in the code. To put it briefly, when you have written a code or some action once, you don't need to repeat it. This principle allows you to reduce the amount of code and make it more readable. How to implement it? Reuse can be realized by including references to code fragments or by using object-oriented programming. For example, you have found an action in the code that is repeated and the code fragment is duplicated. Revising the architecture and reorganizing the code will help with this issue. The principle refers to reusing, reusing code without rewriting it in multiple places in the program.\n" +
                "YAGNI (\"You aren't gonna need it\") is a software design process and principle that declares as its main goal and/or value the rejection of redundant functionality - that is, the refusal to add functionality that is not immediately needed.\n" +
                "Why were the YAGNI principles developed and defined?\n" +
                "\n" +
                "Translated with www.DeepL.com/Translator (free version)";

        abbreviationSearch(text);
    }
}
