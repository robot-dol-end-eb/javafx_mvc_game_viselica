package org.example;

import org.example.core.CurrentWord;
import org.example.core.Logic;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCore {

    //addLetter 1 CurrentWord
    @Test
    public void test1()  {
        CurrentWord word = new CurrentWord(3);//***
        word.addLetter("qwe",'q');
        assertTrue("q**".equals(word.getCurrentWord()));
    }

    //addLetter 2 CurrentWord
    @Test
    public void test2()  {
        CurrentWord word = new CurrentWord(4);//***
        word.addLetter("qweq",'q');
        assertTrue("q**q".equals(word.getCurrentWord()));
    }

    //win lose after one add Logic
    @Test
    public void test3()  {
        Logic obj = new Logic();
        obj.checkLetter('q');
        assertFalse(obj.lose());
        assertFalse(obj.win());
    }

    //win
    @Test
    public void test4()  {
        Logic obj = new Logic();
        obj.checkLetter('q');
        assertFalse(obj.lose());
        assertFalse(obj.win());
        obj.checkLetter('w');
        assertFalse(obj.lose());
        assertFalse(obj.win());
        obj.checkLetter('r');
        assertFalse(obj.lose());
        assertFalse(obj.win());
        obj.checkLetter('e');
        assertFalse(obj.lose());
        assertTrue(obj.win());
    }

    //lose
    @Test
    public void test5()  {
        Logic obj = new Logic();
        obj.checkLetter('a');
        assertFalse(obj.lose());
        assertFalse(obj.win());
        obj.checkLetter('s');
        assertFalse(obj.lose());
        assertFalse(obj.win());
        obj.checkLetter('d');
        assertFalse(obj.lose());
        assertFalse(obj.win());
        obj.checkLetter('f');
        assertFalse(obj.lose());
        assertFalse(obj.win());
        obj.checkLetter('g');
        assertTrue(obj.lose());
        assertFalse(obj.win());
    }
}

