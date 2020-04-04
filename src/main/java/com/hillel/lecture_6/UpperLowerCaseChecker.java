package com.hillel.lecture_6;

import io.qameta.allure.Step;
import org.apache.commons.lang.WordUtils;
import org.codehaus.plexus.util.StringUtils;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";
        result = word.toUpperCase();

        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";
        result = word.toLowerCase();

        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result

        int position = 0;
        boolean capitalize = true;
        StringBuilder result = new StringBuilder(sentence);
        while (position < result.length()) {
            if (result.charAt(position) == '.') {
                capitalize = true;
            } else if (capitalize && !Character.isWhitespace(result.charAt(position))) {
                result.setCharAt(position, Character.toUpperCase(result.charAt(position)));
                capitalize = false;
            }
            position++;
        }

        return result.toString();
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";

        String[] sentences = sentence.split(" ");
        int size = sentences.length;

        for (int i = 0; i < size; i++) {
            sentences[i] = sentences[i].substring(0, 1).toUpperCase() + sentences[i].substring(1);
        }
        result = String.join(" ", sentences);
        return result;
    }
}
