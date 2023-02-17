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

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public Radio(int stationNumber) {
        this.currentStation = this.minStation;
        this.maxVolume = 100;
        this.minVolume = 0;
        this.stationNumber = this.maxStation + 1;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= this.minStation) {
            if (newCurrentStation <= this.maxStation) {
                this.currentStation = newCurrentStation;
            }
        }
    }

    public void nextStation() {
        if (this.currentStation < this.maxStation) {
            ++this.currentStation;
        } else {
            this.currentStation = this.minStation;
        }

    }

    public void prevStation() {
        if (this.currentStation > this.minStation) {
            --this.currentStation;
        } else {
            this.currentStation = this.maxStation;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= this.minVolume) {
            if (newCurrentVolume <= this.maxVolume) {
                this.currentVolume = newCurrentVolume;
            }
        }
    }

    public void increaseVolume() {
        if (this.currentVolume < this.maxVolume) {
            ++this.currentVolume;
        }

    }

    public void decreaseVolume() {
        if (this.currentVolume > this.minVolume) {
            --this.currentVolume;
        }

    }

 /*   public int getCurrentVolume() {
        return currentVolume;
    }

    public Radio(int stationNumber) {
        this.stationNumber = maxStation + 1;
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