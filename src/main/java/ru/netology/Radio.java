package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private final int minNumStation = 0;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentStation;
    private int amountStation = 10;
    private int maxNumStation = 9;
    private int currentVolume;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
        this.maxNumStation = this.amountStation - 1;
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