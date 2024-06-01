package recap;

public class Bike {
    private boolean isOn = false;
    private int increament =16;
    private int gear = 1;

public void turnOn(){
    isOn = true;
}

public void turnOff(){
    isOn = false;
}
public boolean onBike(){
    return  isOn ;
}
public void increaseAccelerator() {
    if (increament <=1 && increament < 40 && isOn == true) {
        increament+=1;
    }
}
   public int getAccelerator(){
       return increament;

    }


}

