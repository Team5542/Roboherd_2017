package org.usfirst.frc.team5542.robot.commands.auto.util;

import org.usfirst.frc.team5542.robot.commands.auto.AutoBase;

/**
 *
 */
public class FirstForwardAuto extends AutoBase {
	String autoName;
    public FirstForwardAuto(String autoName) {
        requires(driveTrain);
    }
    long startTime;
    // Called just before this Command runs the first time
    protected void initialize() {
    	startTime = System.currentTimeMillis();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveTrain.fprDrive(.5, 0, 1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return ((System.currentTimeMillis() - startTime) >= 2500);
    }

    // Called once after isFinished returns true
    protected void end() {
    	executeNextCommand(autoName);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
