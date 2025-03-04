package edu.kis.powp.jobs2d.features;

import edu.kis.powp.jobs2d.command.manager.DriverCommandManager;
import edu.kis.powp.jobs2d.command.manager.LoggerCommandChangeObserver;

public class CommandsFeature implements Feature {

    private static DriverCommandManager commandManager;

    public void setup() {
        commandManager = new DriverCommandManager();

        LoggerCommandChangeObserver loggerObserver = new LoggerCommandChangeObserver();
        commandManager.getChangePublisher().addSubscriber(loggerObserver);
    }

    /**
     * Get manager of application driver command.
     *
     * @return plotterCommandManager.
     */
    public static DriverCommandManager getDriverCommandManager() {
        return commandManager;
    }
}
