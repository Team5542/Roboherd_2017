package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;
import org.usfirst.frc.team5542.robot.commands.lifter.MoveLifter;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Lifter extends Subsystem {
	
	private CANTalon lifterTop;
	
	public Lifter(){
		lifterTop = new CANTalon(RobotMap.liftMotorTop);
	}
	
	protected static Lifter instance;
	public static Lifter getInstance(){
		if(instance == null){
			instance = new Lifter();
		}
		return instance;
	}
	
	public static double encoder = 0.0;
	
	public void setArmPower(double power){
		lifterTop.set(power);
		encoder = lifterTop.getEncPosition();
		SmartDashboard.putNumber("encoder", lifterTop.getEncPosition());
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new MoveLifter());
    }
}

