package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Dropper extends Subsystem {

    CANTalon dropperMotor;
    private Dropper(){
    	dropperMotor = new CANTalon(RobotMap.liftMotorBottom);
    }
    
	protected static Dropper instance;
	
	public static Dropper getInstance() {
		if(instance == null) {
			instance = new Dropper();
		}
		return instance;
	}
    
    public void setPower(double power){
    	dropperMotor.set(power);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

