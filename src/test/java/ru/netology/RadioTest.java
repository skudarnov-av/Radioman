package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(15);

        int actual = radio.getCurrentStation();
        int expected = 15;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void test1() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(25);

        int actual = radio.getCurrentStation();
        int expected = 15;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void test2() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(25);

        int actual = radio.getCurrentStation();
        int expected = 15;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void test3() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(19);

        int actual = radio.getCurrentStation();
        int expected = 19;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void test4() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(2);

        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);


    }


}
   