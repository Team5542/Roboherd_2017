package org.usfirst.frc.team5542.robot.commands;

import org.usfirst.frc.team5542.robot.OI;

import edu.wpi.first.wpilibj.XboxController;

/**
 *
 */
public class MoveLifter extends CommandBase {

    public MoveLifter() {
        requires(arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	OI oi = new OI();
    	XboxController xbox = oi.getXBox();
    	double y = -xbox.getRawAxis(OI.lyAxis);
    	
    	if(y < 0.10 && y > -0.10){
    		y = 0;
    	}
    	
    	arm.setArmPower(y);
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
    	arm.setArmPower(0);
    }
}
