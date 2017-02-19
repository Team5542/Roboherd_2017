package org.usfirst.frc.team5542.robot.commands.values;

import org.usfirst.frc.team5542.robot.commands.CommandBase;

/**
 *
 */
public class UpdatePDP extends CommandBase {

    public UpdatePDP() {
        requires(pdp);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Again, was getting errors here yesterday. Don't think these are needed anymore. 
    	pdp.update();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}