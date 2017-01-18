package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;
import org.usfirst.frc.team5542.robot.commands.ServoControll;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Servos extends Subsystem {
	
	private Servo left, right;
	private Servos(){
		left = new Servo(RobotMap.leftServo);
		right = new Servo(RobotMap.rightServo);
	}
	
	public void setSevoPos(double pov){
		left.set(pov);
		pov = 1 - pov;
		right.set(pov);
	}
	
	public static Servos instance;
	public static Servos getInstance(){
		if(instance == null){
			instance = new Servos();
		}
		return instance;
	}
	
    public void initDefaultCommand() {
        //setDefaultCommand(new ServoControll());
    }
    
}

