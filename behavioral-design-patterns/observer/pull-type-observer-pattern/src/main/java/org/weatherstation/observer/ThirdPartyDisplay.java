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
    public void update() {
        this.temperature = ((WeatherData) weatherData).getTemperature();
        this.humidity = ((WeatherData) weatherData).getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Third Party Display: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}








