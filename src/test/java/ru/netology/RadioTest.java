package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void stationEntered() {
        int enteredStation = 5;
        int expected = 5;
        Radio station = new Radio();
        station.setCurrentStation(enteredStation);
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/stationNext.csv")

    public void numberNext(String name, int currentStation, int expected) {
        Radio station = new Radio();
        station.setCurrentStation(currentStation);
        station.stationNext();
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/stationPrev.csv")

    public void numberPrev(String name, int currentStation, int expected) {
        Radio station = new Radio();
        station.setCurrentStation(currentStation);
        station.stationPrev();
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/increaseVolume.csv")
    public void increaseVolumeStation(String name, int currentVolume, int expected) {
        Radio station = new Radio();
        station.setCurrentVolume(currentVolume);
        station.increaseVolume();
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/decreaseVolume.csv")

    public void decreaseVolumeStation(String name, int currentVolume, int expected) {
        Radio station = new Radio();
        station.setCurrentVolume(currentVolume);
        station.decreaseVolume();
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
