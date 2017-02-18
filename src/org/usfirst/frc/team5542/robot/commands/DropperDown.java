package org.usfirst.frc.team5542.robot.commands;

/**
 *
 */
public class DropperDown extends CommandBase {
	
	static boolean go;
    public DropperDown(boolean go) {
    	requires(dropper);
    	go = go ? false : true;
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
        return go;
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