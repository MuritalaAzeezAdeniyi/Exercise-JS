package recap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    @Test
    public void checkIfBikeIsOn(){
        Bike myBike = new Bike();
         myBike.turnOn();
         assertTrue(myBike.onBike());
    }

    @Test
    public void checkIfBikeIsOff(){
        Bike myBike = new Bike();
        myBike.turnOff();
        assertFalse(myBike.onBike());
    }

    @Test
    public void checkIfBikeIncreaseBy1(){
        Bike myBike = new Bike();
        myBike.increaseAccelerator();
        assertEquals(1,myBike.getAccelerator());
    }
    @Test
    public void checkIfBikeDecreaseBy2() {
        Bike myBike = new Bike();
        for (int count = 0; count <= 2; count = count + 2) {
            myBike.increaseAccelerator();
        }
            assertEquals(2, myBike.getAccelerator());

    }
}
