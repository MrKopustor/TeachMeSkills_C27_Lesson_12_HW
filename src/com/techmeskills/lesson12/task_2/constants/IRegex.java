package com.techmeskills.lesson12.task_2.constants;

public interface IRegex {

    static String REGEX_EMAIL = "\\b([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z]{2,3})\\b";
    static String REGEX_PHONE_NUMBER = "\\+\\(\\d{2}\\)\\d{7}\\b";
    static String REGEX_DOCUMENT_NUMBER = "\\b(\\d{4}-\\d{4}-\\d{2})\\b";
}
