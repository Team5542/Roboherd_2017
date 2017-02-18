package org.usfirst.frc.team5542.robot.commands.auto.line;

import org.usfirst.frc.team5542.robot.commands.auto.AutoBase;

/**
 *
 */
public class BackwardLineAuto extends AutoBase {
	
    public BackwardLineAuto() {
        requires(driveTrain);
    }
    
    long startTime;

    // Called just before this Command runs the first time
    protected void initialize() {
    	startTime = System.currentTimeMillis();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveTrain.tankDrive(-.5, -.5, 1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return ((System.currentTimeMillis() - startTime) >= 1000);
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}