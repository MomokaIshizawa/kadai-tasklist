package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Message;

public class MessageValidator {
    public static List<String> validate(Message m) {
        List<String> errors = new ArrayList<String>();

        String content_error = validateContent(m.getContent());
        if (!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    private static String validateContent(String content) {
        if (content == null || content.equals("")) {
            return "課題を入力してください。";
        }

        return "";
    }
}