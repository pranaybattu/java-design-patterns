package org.weatherstation.observer;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final Subject weatherData;

    public ThirdPartyDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Third Party Display: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}








