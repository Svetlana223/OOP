package org.example.sem6.ex1;

public class TextAppender {
    public Text appendText(Text currentText, Text newText) {
        return new Text(currentText.getText()+ newText);
    }
}
