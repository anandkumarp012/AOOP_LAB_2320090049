package com.homeautomachine;

public class SmartHomeAutomationSystem {
	public static void main(String[] args) {
        // Step 1: Create specific home automation tasks
        HomeAutomationTask lightingTask = new LightingControlTask();
        HomeAutomationTask temperatureTask = new TemperatureRegulationTask();
        HomeAutomationTask securityTask = new SecurityMonitoringTask();

        // Step 2: Create specific automation services with dependency injection
        AutomationService lightingService = new LightingService(lightingTask);
        AutomationService temperatureService = new TemperatureService(temperatureTask);
        AutomationService securityService = new SecurityService(securityTask);

        // Step 3: Manage home automation using the services
        HomeAutomationManager manager = new HomeAutomationManager(lightingService, temperatureService, securityService);
        manager.manageHome();

        // Step 4: Setup Observer pattern for event notifications
        HomeEventNotifier notifier = new HomeEventNotifier();
        HomeOwner owner1 = new HomeOwner("John Doe");
        HomeOwner owner2 = new HomeOwner("Jane Doe");

        notifier.addObserver(owner1);
        notifier.addObserver(owner2);

        // Trigger events
        notifier.notifyObservers("Security breach detected!");
        notifier.notifyObservers("High energy consumption alert!");
    }	
}
