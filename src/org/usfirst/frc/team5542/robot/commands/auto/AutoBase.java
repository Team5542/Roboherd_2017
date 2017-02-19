package org.usfirst.frc.team5542.robot.commands.auto;

import java.util.HashMap;

import org.usfirst.frc.team5542.robot.commands.CommandBase;
import org.usfirst.frc.team5542.robot.commands.auto.line.BackwardLineAuto;
import org.usfirst.frc.team5542.robot.commands.auto.line.ForwardLineAuto;
import org.usfirst.frc.team5542.robot.commands.auto.line.KickLineAuto;

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
		AutoCommandGroup group = new AutoCommandGroup("line");
		group.addCommand(new ForwardLineAuto());
		group.addCommand(new KickLineAuto());
		group.addCommand(new BackwardLineAuto());
	}
}
