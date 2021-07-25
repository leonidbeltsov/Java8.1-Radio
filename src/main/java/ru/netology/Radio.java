package ru.netology;

public class Radio {
    private final int minNumStation = 0;
    private final int maxNumStation = 9;
    private final int minVolume = 0;
    private final int maxVolume = 10;
    private int currentStation;
    private int currentVolume;

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
        if (numButtonStation < minNumStation) {
            return;
        }
        if (numButtonStation > maxNumStation) {
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