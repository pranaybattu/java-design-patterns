package org.weatherstation.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private final ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    // constructor
    public WeatherData() {
        observers = new ArrayList<>();
    }

    // implemet subject
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        // use streams
        observers.forEach(observer -> observer.update()); // changed this for pull type
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
