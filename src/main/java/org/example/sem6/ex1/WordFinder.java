package org.example.sem6.ex1;

public class WordFinder {
    public Word wordFinder(Text text, Word word) {
        String[] textArr = text.getText().split("");
        for (String el : textArr) {
            if (el.equals(word)) return word;
        }
        return null;
    }
}
