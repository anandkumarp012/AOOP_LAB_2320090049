package com.homeautomachine;

public class HomeOwner implements HomeEventObserver{
	private String name;

    public HomeOwner(String name) {
        this.name = name;
    }

    @Override
    public void onEvent(String event) {
        System.out.println(name + " received notification: " + event);
    }
}
