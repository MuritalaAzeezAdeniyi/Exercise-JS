package recap;

public class AirConditioner {
private boolean isOn;
int temperature = 16;
int decreaseTemperature = 30;
    public void turnOn(){
         isOn = true;
    }

 public void turnOff(){
       isOn = false;
 }

 public void increaseTemperature() {
     if (temperature >= 16 && temperature < 30 && isOn == true) {
         temperature += 1;
     }
 }

  public void decreaseTemperature() {
      if (decreaseTemperature <= 30 && isOn == true) {
          temperature -= 1;

      }
  }

  public int getTemperature() {
        return temperature;
  }

 public boolean getSwitchState(){
        return isOn;
 }

}



