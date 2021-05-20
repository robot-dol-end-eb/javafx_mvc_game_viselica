package org.example.core;

public class CurrentWord {

    private String currentWord;

    public CurrentWord(int length){
        currentWord = "*".repeat(length);
    }

    public String getCurrentWord() {
        return currentWord;
    }

    public void addLetter(String searchWord, Character letter) {
        for( int i = 0; i < searchWord.length(); i++) {
            if( searchWord.charAt(i) == letter)
                currentWord = currentWord.substring(0,i) + letter + currentWord.substring(i+1);
        }
    }
}
