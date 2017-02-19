package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Servos extends Subsystem {
	
	private Servo gateLeft, gateRight, kick;
	private Servos(){
		gateLeft = new Servo(RobotMap.gateLeftServo);
		gateRight = new Servo(RobotMap.gateRightServo);
		kick = new Servo(RobotMap.kickServo);
	}
	
	public void setGatePos(double pos){
		gateLeft.set(pos);
		gateRight.set(180 - pos);
	}
	
	public void setKickPos(double pos){
		kick.set(pos);
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

