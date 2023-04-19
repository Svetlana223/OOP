package org.example.sem6.ex1;

public class WordDeleter {
    public Text deleteWord(Text text, Word wordDelete){
        String inputText = text.getText();
        if (inputText.contains(wordDelete.getWord())) {
            inputText = inputText.replace(wordDelete.getWord(), "");
        } return text;
    }
}
