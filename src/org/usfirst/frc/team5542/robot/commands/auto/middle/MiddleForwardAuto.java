package org.usfirst.frc.team5542.robot.commands.auto.middle;

import org.usfirst.frc.team5542.robot.commands.auto.AutoBase;

/**
 *
 */
public class MiddleForwardAuto extends AutoBase {

    public MiddleForwardAuto() {
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
        return ((System.currentTimeMillis() - startTime) >= 2600);
    }

    // Called once after isFinished returns true
    protected void end() {
    	executeNextCommand("middle");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
