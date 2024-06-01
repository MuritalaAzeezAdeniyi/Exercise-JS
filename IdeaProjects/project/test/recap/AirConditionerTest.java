package recap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    @Test
    void isOnAirConditioner() {
        // given that i have an Ac
        AirConditioner airConditioner = new AirConditioner();
        //s when i turn it on
        airConditioner.turnOn();
        // check that is on
        assertTrue(airConditioner.getSwitchState());
    }

    @Test
    void checkIfAirConditionIsOff() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOff();
        assertFalse(airConditioner.getSwitchState());
    }

    @Test
    public void testThatAcTemperatureCanIncrease() {
        // given that i have an Ac and my Ac is On
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        // when i increase the temperature by 3x
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        //check that temperature is 19

        assertEquals(19, airConditioner.getTemperature());

    }

    @Test
    public void testThatAcTemperatureCanNotIncreaseMoreThan30() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        for (int i = 0; i < 20; i++) {
            airConditioner.increaseTemperature();
        }
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void testThatAcTemperatureCanNotIncreaseMoreThan50() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        for (int i = 0; i < 40; i++) {
            airConditioner.increaseTemperature();
        }
        airConditioner.decreaseTemperature();
        assertEquals(29, airConditioner.getTemperature());
    }

    @Test
    public void testThatAcTemperatureCanDecreaseMorThan16() {
        AirConditioner airConditioner1 = new AirConditioner();
        airConditioner1.turnOn();
        airConditioner1.decreaseTemperature();
        airConditioner1.decreaseTemperature();
        airConditioner1.decreaseTemperature();
        assertEquals(27, airConditioner1.getTemperature());
        for (int count = 1; count <= 20; count++) {
            airConditioner1.decreaseTemperature();
        }
        
    }

}



