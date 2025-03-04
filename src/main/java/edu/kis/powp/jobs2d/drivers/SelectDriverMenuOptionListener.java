package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectDriverMenuOptionListener implements ActionListener {
    private final DriverManager driverManager;
    private Job2dDriver driver = null;

    public SelectDriverMenuOptionListener(Job2dDriver driver, DriverManager driverManager) {
        this.driverManager = driverManager;
        this.driver = driver;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        driverManager.setCurrentDriver(driver);
        DriverFeature.updateDriverInfo();
    }
}
