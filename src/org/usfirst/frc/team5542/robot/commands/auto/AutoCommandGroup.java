package org.usfirst.frc.team5542.robot.commands.auto;

import java.util.ArrayList;
import java.util.HashMap;

import edu.wpi.first.wpilibj.command.Command;

public class AutoCommandGroup {
	private ArrayList<Command> commands;
	private String name;
	
	public AutoCommandGroup(String name){
		this.name = name;
		groups.put(name, this);
	}
	
	private static HashMap<String, AutoCommandGroup> groups = new HashMap<String, AutoCommandGroup>();
	
	public ArrayList<Command> getCommands(){
		return commands;
	}
	
	public static AutoCommandGroup getCommandGroup(String name){
		return groups.get(name);
	}
	
	public void addCommand(Command command){
		commands.add(command);
		groups.put(name, this);
	}
	
}
