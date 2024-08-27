package com.homeautomachine;

public class SecurityService implements AutomationService{
	private HomeAutomationTask task;

    public SecurityService(HomeAutomationTask task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.executeTask();
    }
}
