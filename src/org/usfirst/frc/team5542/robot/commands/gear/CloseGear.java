package org.usfirst.frc.team5542.robot.commands.gear;

import java.util.Timer;
import java.util.TimerTask;

import org.usfirst.frc.team5542.robot.commands.CommandBase;

/**
 *
 */
public class CloseGear extends CommandBase {

    public CloseGear() {
        requires(servos);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	servos.setKickPos(0);
    	new Timer().schedule(new TimerTask(){

			@Override
			public void run() {
		    	servos.setGatePos(0);
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
