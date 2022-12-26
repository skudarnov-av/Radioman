package ru.netology;


public class Radio {


    private int currentStation;

    private int counterStation;

    private int minStation = 0;

    private int maxStation = 10;

    //конструктор без параметров :
    public Radio() {
    }

    // конструктор с параметром 1 : кол-во станций у радио
    public Radio(int countStation) {
        this.counterStation = countStation;
        this.maxStation = maxStation - 1;
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

