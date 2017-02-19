package org.usfirst.frc.team5542.robot.commands.auto.left;

import org.usfirst.frc.team5542.robot.commands.auto.AutoBase;

/**
 *
 */
public class FirstForwardLeftAuto extends AutoBase {

    public FirstForwardLeftAuto() {
        requires(driveTrain);
    }
    long startTime;
    // Called just before this Command runs the first time
    protected void initialize() {
    	startTime = System.currentTimeMillis();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return ((System.currentTimeMillis() - startTime) >= 2500);
    }

    // Called once after isFinished returns true
    protected void end() {
    	this.executeNextCommand("left");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
