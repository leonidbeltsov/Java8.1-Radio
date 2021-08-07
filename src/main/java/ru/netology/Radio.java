package ru.netology;

public class Radio {
    private final int minNumStation = 0;
    private int maxNumStation = 10;
    private int currentStation;

    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int maxNumStation) {
        this.maxNumStation = maxNumStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    // Выбор станции с помощью цифровых клавиш
    public void setStationWithNumButton(int numButtonStation) {
        if (numButtonStation < minNumStation || numButtonStation > maxNumStation) {
            return;
        }
        currentStation = numButtonStation;
    }

    // Переключение на следующую станцию
    public void setNextStation() {
        if (currentStation != maxNumStation) {
            currentStation++;
        } else {
            currentStation = minNumStation;
        }
    }

    //  Переключение на предыдущую станцию
    public void setPrevStation() {
        if (currentStation != minNumStation) {
            currentStation--;
        } else {
            currentStation = maxNumStation;
        }
    }

    //  Увеличение громкости
    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    //  Уменьшение громкости
    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}