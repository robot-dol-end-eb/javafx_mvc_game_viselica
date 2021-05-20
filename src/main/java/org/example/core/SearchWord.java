package org.example.core;

import java.io.*;

public class SearchWord {
    //слово + метод поиска буквы в слове
    private String searchWord;


    public SearchWord() {
        this.searchWord = setRandomWord();
    }

    public int getLength(){
        return searchWord.length();
    }

    public String getWord(){
        return searchWord;
    }

    public boolean findLetter(Character letter){
        return (searchWord.indexOf(letter) != -1);
    }

    private String setRandomWord() {
        String rez = "err";
        try {
            File file = new File(".\\src\\main\\resources\\vocabulary.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String[] line = reader.readLine().split(" ");//в файле ВСЕ СЛОВА в одной сточке я так сказал
            rez = line[rnd(line.length - 1)];
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rez;
    }

    public static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }

}

