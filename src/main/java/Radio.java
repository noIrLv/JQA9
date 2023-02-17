import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;

    public int stationNumber;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;





  /*  public Radio(int stationNumber) {
        this.stationNumber = maxStation + 1;
    }

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }*/

}
