package ru.netology;

public class Radio {

    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            this.currentStation = 9;
            return;
        }
        if (currentStation < 0) {
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation;
    }

    public void stationNext() {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
            return;
        }
        this.currentStation = 0;
    }

    public void stationPrev() {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
            return;
        }
        this.currentStation = 9;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            this.currentVolume = 10;
            return;
        }
        if (currentVolume < 0) {
            this.currentVolume = 0;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }
}
