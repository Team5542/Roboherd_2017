package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Servos extends Subsystem {
	
	private Servo gate, kick;
	private Servos(){
		gate = new Servo(RobotMap.leftServo);
		kick = new Servo(RobotMap.rightServo);
	}
	
	public void setGatePos(double pos){
		gate.set(pos);
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

