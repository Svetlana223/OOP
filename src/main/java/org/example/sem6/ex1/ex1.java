package org.example.sem6.ex1;

public class ex1 {
    public static void main(String[] args) {
        Text text = new Text("Мама мыла раму");
        Word word = new Word("руки");
        Word word1 = new Word("раму");

        WordReplacer wordReplacer = new WordReplacer();
        WordDeleter wordDeleter = new WordDeleter();
        TextAppender textAppender = new TextAppender();
        TextPrinter textPrinter = new TextPrinter();

        textPrinter.printText(text);
        Text text1 = new Text(wordReplacer.replaceWord(text,word1, word).getText());
        textPrinter.printText(text1);
        Text text2 = new Text(wordDeleter.deleteWord(text, word1).getText());
        textPrinter.printText(text2);
        Text text3 = new Text(textAppender.appendText(text2, new Text(word.getWord())).getText());

    }

}
