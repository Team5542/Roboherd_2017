package org.usfirst.frc.team5542.robot.commands;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 */
public class KickGear extends CommandBase {

    public KickGear() {
        requires(servos);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	servos.setGatePos(.45);
    	new Timer().schedule(new TimerTask(){

			@Override
			public void run() {
		    	servos.setKickPos(.35);
			}
    		
    	}, 1000);
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
    }
}
