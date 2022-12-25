package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class RadioTest {


    Radio station = new Radio(10);

    @Test
    public void stationEntered() {
        int maxStation = 9;
        int actual = station.getMaxStation();
        int expected = maxStation;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/stationNext.csv")

    public void numberNext(String name, int currentStation, int expected) {
        station.setCurrentStation(currentStation);
        station.stationNext();
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/stationPrev.csv")

    public void numberPrev(String name, int currentStation, int expected) {
        station.setCurrentStation(currentStation);
        station.stationPrev();
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }


}


