package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    // Выбор станции с помощью цифровых клавиш
    @Test
    public void shouldSetStationWithNumButton() {
        radio.setStationWithNumButton(7);

        assertEquals(7, radio.getCurrentStation());
    }

    // Сверх лимита
    @Test
    public void shouldNotSetStationWithNumButtonAboveLimit() {
        radio.setStationWithNumButton(10);

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
        radio.setCurrentStation(9);

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
        radio.setPrevStation();

//        radio.setCurrentStation(0);
        assertEquals(9, radio.getCurrentStation());
    }

    // Увеличение громкости
    @Test
    public void shouldVolumeUp(){
        radio.setCurrentVolume(5);

        radio.volumeUp();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotVolumeUp(){
        radio.setCurrentVolume(10);

        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    // Уменьшение громкости
    @Test
    public void shouldVolumeDown(){
        radio.setCurrentVolume(5);

        radio.volumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotVolumeDown(){
        radio.setCurrentVolume(0);

        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

}