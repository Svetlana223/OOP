package org.example.sem6.ex1;

public class WordReplacer {
    public Text replaceWord(Text text, Word wordToReplace, Word newWord){
        String inputText = text.getText();
        if (inputText.contains(wordToReplace.getWord())) {
            inputText = inputText.replace(wordToReplace.getWord(), newWord.getWord());
        } return new Text(inputText);
    }
}
