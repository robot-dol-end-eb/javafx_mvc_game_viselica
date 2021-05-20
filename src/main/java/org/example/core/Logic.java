package org.example.core;

public class Logic {
    //кол-во попыток, луз, вин

    private static final int max_live = 5;
    private static final int min_live = 0;
    private int lives;
    private SearchWord searchWord;
    private CurrentWord currentWord;

    public Logic() {
        this.searchWord = new SearchWord();
        this.lives = max_live;
        this.currentWord = new CurrentWord(searchWord.getLength());
    }

    public int getLives() {
        return lives;
    }

    public String getCurrentWord() {
        return currentWord.getCurrentWord();
    }

    public boolean lose(){
        return (lives == min_live);
    }

    public boolean win(){
        return  searchWord.getWord().equals(currentWord.getCurrentWord());
    }


    public void checkLetter( Character letter) {
        if (!searchWord.findLetter(letter)) lives--;
        else currentWord.addLetter(searchWord.getWord(),letter);
    }


}
