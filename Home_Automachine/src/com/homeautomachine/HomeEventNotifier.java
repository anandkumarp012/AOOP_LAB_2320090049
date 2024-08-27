package com.homeautomachine;

import java.util.ArrayList;
import java.util.List;
public class HomeEventNotifier {
	private List<HomeEventObserver> observers = new ArrayList<>();

    public void addObserver(HomeEventObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(HomeEventObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String event) {
        for (HomeEventObserver observer : observers) {
            observer.onEvent(event);
        }
    }
}
