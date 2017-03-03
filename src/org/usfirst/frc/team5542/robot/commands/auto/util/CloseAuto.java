package org.usfirst.frc.team5542.robot.commands.auto.util;

import java.util.Timer;
import java.util.TimerTask;

import org.usfirst.frc.team5542.robot.commands.auto.AutoBase;

/**
 *
 */
public class CloseAuto extends AutoBase {

    public CloseAuto() {
        requires(servos);
    }
    
    static boolean finished = false;
    // Called just before this Command runs the first time
    protected void initialize() {
    	servos.setKickPos(0);
    	new Timer().schedule(new TimerTask(){

			@Override
			public void run() {
		    	servos.setGatePos(0);
		    	new Timer().schedule(new TimerTask(){

					@Override
					public void run() {
				    	finished = true;
					}
		    		
		    	}, 1000L);
			}
    		
    	}, 1000L);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
