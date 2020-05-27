package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldSetValidTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(21);
        assertEquals(21, conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldSetMinusTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(-10);
        assertEquals(0, conditioner.getCurrentTemperature());
    }


    @Test
    public void  shouldSetTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(31);
        assertEquals(0, conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldSetTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(14);
        assertEquals(0, conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldIncreaseTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldDecreaseTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
    }
}






