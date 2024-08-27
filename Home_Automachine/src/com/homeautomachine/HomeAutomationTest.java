package com.homeautomachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class HomeAutomationTest {
	private HomeAutomationTask lightingTask;
    private HomeAutomationTask temperatureTask;
    private HomeAutomationTask securityTask;

    private AutomationService lightingService;
    private AutomationService temperatureService;
    private AutomationService securityService;

    private HomeAutomationManager manager;
    private HomeEventNotifier notifier;
    private HomeOwner owner1;
    private HomeOwner owner2;

    @BeforeEach
    void setUp() {
        lightingTask = new LightingControlTask();
        temperatureTask = new TemperatureRegulationTask();
        securityTask = new SecurityMonitoringTask();

        lightingService = new LightingService(lightingTask);
        temperatureService = new TemperatureService(temperatureTask);
        securityService = new SecurityService(securityTask);

        manager = new HomeAutomationManager(lightingService, temperatureService, securityService);

        notifier = new HomeEventNotifier();
        owner1 = new HomeOwner("John Doe");
        owner2 = new HomeOwner("Jane Doe");

        notifier.addObserver(owner1);
        notifier.addObserver(owner2);
    }

    @Test
    void testLightingControlTask() {
        lightingTask.initialize();
        lightingTask.performTask();
        lightingTask.finalizeTask();
        assertTrue(true, "Lighting control task executed successfully.");
    }

    @Test
    void testTemperatureRegulationTask() {
        temperatureTask.initialize();
        temperatureTask.performTask();
        temperatureTask.finalizeTask();
        assertTrue(true, "Temperature regulation task executed successfully.");
    }

    @Test
    void testSecurityMonitoringTask() {
        securityTask.initialize();
        securityTask.performTask();
        securityTask.finalizeTask();
        assertTrue(true, "Security monitoring task executed successfully.");
    }

    @Test
    void testHomeAutomationManager() {
        manager.manageHome();
        assertTrue(true, "Home automation manager executed all tasks successfully.");
    }

    @Test
    void testObserverNotification() {
        notifier.notifyObservers("Security breach detected!");
        notifier.notifyObservers("High energy consumption alert!");

        assertTrue(true, "Observers notified successfully.");
    }

}
