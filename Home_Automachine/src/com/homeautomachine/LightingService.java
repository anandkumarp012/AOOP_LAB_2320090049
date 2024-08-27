package com.homeautomachine;

public class LightingService implements AutomationService{
	private HomeAutomationTask task;
	public LightingService(HomeAutomationTask task) {
        this.task = task;
    }

	@Override
	public void execute() {
		// TODO Auto-generated method stub
        task.executeTask();

	}

}
