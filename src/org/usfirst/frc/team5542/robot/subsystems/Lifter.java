package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;
import org.usfirst.frc.team5542.robot.commands.MoveLifter;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lifter extends Subsystem {
	
	private CANTalon armMotor;
	
	public Lifter(){
		armMotor = new CANTalon(RobotMap.liftMotor);
	}
	
	protected static Lifter instance;
	public static Lifter getInstance(){
		if(instance == null){
			instance = new Lifter();
		}
		return instance;
	}
	
	public void setArmPower(double power){
		armMotor.set(power);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new MoveLifter());
    }
}

