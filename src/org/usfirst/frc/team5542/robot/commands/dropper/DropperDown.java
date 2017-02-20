package org.usfirst.frc.team5542.robot.commands.dropper;

import org.usfirst.frc.team5542.robot.commands.CommandBase;

/**
 *
 */
public class DropperDown extends CommandBase {
	
    public DropperDown() {
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	dropper.setPower(-.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }
    
    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	dropper.setPower(0);
    }
}
