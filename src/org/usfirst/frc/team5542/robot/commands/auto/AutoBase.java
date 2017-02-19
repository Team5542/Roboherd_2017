package org.usfirst.frc.team5542.robot.commands.auto;

import java.util.HashMap;

import org.usfirst.frc.team5542.robot.commands.CommandBase;
import org.usfirst.frc.team5542.robot.commands.auto.left.*;
import org.usfirst.frc.team5542.robot.commands.auto.line.*;

public abstract class AutoBase extends CommandBase {
	static HashMap<String, Integer> command = new HashMap<String, Integer>();
	public AutoBase(){
		
	}
	
	public void startCommandGroup(String name){
		command.put(name, 0);
		AutoCommandGroup group = AutoCommandGroup.getCommandGroup(name);
		group.getCommands().get(0).start();
	}
	
	public void executeNextCommand(String name){
		int pos = command.get(name);
		AutoCommandGroup group = AutoCommandGroup.getCommandGroup(name);
		group.getCommands().get(pos + 1).start();
		command.put(name, pos + 1);
	}
	
	public static void defineGroups(){
		AutoCommandGroup line = new AutoCommandGroup("line");
		line.addCommand(new ForwardLineAuto());
		line.addCommand(new KickLineAuto());
		line.addCommand(new BackwardLineAuto());
		
		AutoCommandGroup left = new AutoCommandGroup("left");
		left.addCommand(new FirstForwardLeftAuto());
		left.addCommand(new TurnLeftAuto());
		left.addCommand(new SecondForwardLeftAuto());
		left.addCommand(new BackwardLeftAuto());
	}
}
