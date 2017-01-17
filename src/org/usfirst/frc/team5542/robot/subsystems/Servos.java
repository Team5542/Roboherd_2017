package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;
import org.usfirst.frc.team5542.robot.commands.ServoControll;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Servos extends Subsystem {
	
	private Servo left;
	private Servos(){
		left = new Servo(RobotMap.leftServo);
	}
	
	public void setSevoPos(int pos){
		left.set(pos);
	}
	
	public static Servos instance;
	public static Servos getInstance(){
		if(instance == null){
			instance = new Servos();
		}
		return instance;
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new ServoControll());
    }
    
}

