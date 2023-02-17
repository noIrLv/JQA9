import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void stationNumber() {
        Radio radio = new Radio(0, 9, 6, 2, 50, 100, 0);

    }

    @Test
    public void setRadioStation() {
        Radio radio = new Radio(0, 9, 6, 2, 50, 100, 0);
        radio.setStationNumber(5);
        Assertions.assertEquals(5, radio.getStationNumber());
    }

    @Test
    public void setMinStation() {
        Radio radio = new Radio(0, 9, 6, 2, 50, 100, 0);
        radio.setMinStation(0);
        Assertions.assertEquals(0, radio.getMinStation());

    }

    @Test
    public void setMaxStation() {
        Radio radio = new Radio(0, 9, 6, 2, 50, 100, 0);
        radio.setMaxStation(9);
        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio(0, 9, 6, 2, 50, 100, 0);
        radio.setCurrentStation(6);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentVolume() {
        Radio radio = new Radio(0, 9, 6, 2, 50, 100, 0);
        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio(0, 9, 6, 2, 50, 100, 0);
        radio.setMaxVolume(100);
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setMinVolume() {
        Radio radio = new Radio(0, 9, 6, 2, 50, 100, 0);
        radio.setMinVolume(0);
        Assertions.assertEquals(0, radio.getMinVolume());
    }


}


  /*  @Test
    public void numberOfStations() {
        Radio radio = new Radio()
        Assertions.assertEquals(10, radio.stationNumber);
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.getMaxStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.getMinStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseStation() {
        Radio radio = new Radio()
        radio.setCurrentStation(9);
        radio.setMaxStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setMinStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.getMaxVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.getMinVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }*/