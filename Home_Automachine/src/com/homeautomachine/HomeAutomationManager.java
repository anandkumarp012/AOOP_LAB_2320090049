package com.homeautomachine;

public class HomeAutomationManager {
	private AutomationService lightingService;
    private AutomationService temperatureService;
    private AutomationService securityService;

    public HomeAutomationManager(AutomationService lightingService, AutomationService temperatureService, AutomationService securityService) {
        this.lightingService = lightingService;
        this.temperatureService = temperatureService;
        this.securityService = securityService;
    }

    public void manageHome() {
        lightingService.execute();
        temperatureService.execute();
        securityService.execute();
    }
}
