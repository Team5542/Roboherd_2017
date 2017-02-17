package org.usfirst.frc.team5542.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GyroValues extends Subsystem {
	
	private GyroValues(){
		
	}
	
	protected static GyroValues instance;
	public static GyroValues getInstance(){
		if(instance == null){
			instance = new GyroValues();
		}
		return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

