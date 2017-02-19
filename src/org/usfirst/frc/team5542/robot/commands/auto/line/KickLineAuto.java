package org.usfirst.frc.team5542.robot.commands.auto.line;

import java.util.Timer;
import java.util.TimerTask;

import org.usfirst.frc.team5542.robot.commands.auto.AutoBase;

/**
 *
 */
public class KickLineAuto extends AutoBase {

    public KickLineAuto() {
        requires(servos);
    }
    boolean finished = false;
    // Called just before this Command runs the first time
    protected void initialize() {
    	servos.setGatePos(.45);
    	new Timer().schedule(new TimerTask(){

			@Override
			public void run() {
		    	servos.setKickPos(.35);
		    	new Timer().schedule(new TimerTask(){

					@Override
					public void run() {
				    	finished = true;
					}
		    		
		    	}, 1000L);
			}
    		
    	}, 1000);
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
    	executeNextCommand("line");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
