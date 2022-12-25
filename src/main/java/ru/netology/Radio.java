package ru.netology;

public class Radio {

    //конструктор без параметров :
    public Radio() {
    }


    // конструктор с 1 параметром : кол-во станций у радио
    public Radio(int currentStation, int currentVolume, int counterStation, int minStation, int maxStation, int minVolume, int maxVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.counterStation = counterStation;
        this.minStation = minStation;
        this.maxStation = maxStation;

    }

    private int currentStation;
    private int currentVolume;

    private int counterStation;

    private int minStation = 0;

    private int maxStation = 10;


    public Radio(int countStation) {
        this.counterStation = countStation;
        this.maxStation = countStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > maxStation) {
            return;
        }
        if (newStation < minStation) {
            return;
        }
        currentStation = newStation;
    }

    public void stationNext() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            currentStation = maxStation;
        }
    }


    public void stationPrev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = maxStation;
        }
    }

}

