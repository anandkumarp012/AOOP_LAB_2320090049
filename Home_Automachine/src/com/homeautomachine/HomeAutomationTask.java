package com.homeautomachine;

abstract class HomeAutomationTask {
	public final void executeTask() {
        initialize();
        performTask();
        finalizeTask();
    }

    protected abstract void initialize();
    protected abstract void performTask();
    protected abstract void finalizeTask();
}
