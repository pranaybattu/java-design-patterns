package org.weatherstation.observer;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
