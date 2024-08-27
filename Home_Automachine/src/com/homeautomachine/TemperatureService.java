package com.homeautomachine;

public class TemperatureService implements AutomationService{
    private HomeAutomationTask task;
    public TemperatureService(HomeAutomationTask task) {
        this.task = task;
    }
	@Override
	public void execute() {
		// TODO Auto-generated method stub
        task.executeTask();

	}

}
