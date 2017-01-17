package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;

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
	
	public void setSevoPos(double pos){
		left.setAngle(pos);
	}
	
	public static Servos instance;
	public static Servos getInstance(){
		if(instance == null){
			instance = new Servos();
		}
		return instance;
	}
	
    public void initDefaultCommand() {
        
    }
    
}

