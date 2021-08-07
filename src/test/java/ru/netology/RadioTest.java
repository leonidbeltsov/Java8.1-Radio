package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    // Выбор станции с помощью цифровых клавиш
    @Test
    public void shouldSetStationWithNumButton() {
        Radio radio = new Radio(20);
        radio.setStationWithNumButton(17);

        assertEquals(17, radio.getCurrentStation());
    }

    // Сверх лимита
    @Test
    public void shouldNotSetStationWithNumButtonAboveLimit() {
        Radio radio = new Radio(20);
        radio.setStationWithNumButton(21);
        assertEquals(0, radio.getCurrentStation());
    }

    // Ниже лимита
    @Test
    public void shouldNotSetStationWithNumButtonBelowLimit() {
        radio.setStationWithNumButton(-1);

        assertEquals(0, radio.getCurrentStation());
    }

    // Переключение станции нажатием кнопки Next
    @Test
    void shouldSetNextStation() {
        radio.setCurrentStation(3);

        radio.setNextStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetFirstStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);

        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    // Переключение станции нажатием кнопки Prev
    @Test
    void shouldSetPrevStation() {
        radio.setCurrentStation(4);

        radio.setPrevStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldSetLastStation() {
        radio.setCurrentStation(0);

        radio.setPrevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    // Увеличение громкости
    @Test
    public void shouldVolumeUp() {
        radio.setCurrentVolume(77);

        radio.volumeUp();
        assertEquals(78, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotVolumeUp() {
        radio.setCurrentVolume(100);

        radio.volumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    // Уменьшение громкости
    @Test
    public void shouldVolumeDown() {
        radio.setCurrentVolume(5);

        radio.volumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotVolumeDown() {
        radio.setCurrentVolume(0);

        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

}