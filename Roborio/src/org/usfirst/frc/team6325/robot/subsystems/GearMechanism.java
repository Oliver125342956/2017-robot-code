package org.usfirst.frc.team6325.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearMechanism extends Subsystem {

	Compressor compressor = new Compressor(21);
	
	DoubleSolenoid piston = new DoubleSolenoid(21, 0, 1);
	
	public void init(){
		compressor.setClosedLoopControl(true);
		close();
	}
	
	public void open(){
		piston.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void close(){
		piston.set(DoubleSolenoid.Value.kForward);
	}
	
	public String getValue() {
		Value val = piston.get();
		
		if(val == Value.kForward){
			return "Closed";
		}else{
			return "Open";
		}
	}
	
	public void initDefaultCommand() {

		// setDefaultCommand(new MySpecialCommand());
	}
}

