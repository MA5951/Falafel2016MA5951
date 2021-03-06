package org.usfirst.frc.team5951.subsystems.Dropper;

import org.usfirst.frc.team5951.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;

/**
 * Components for the {@link Dropper} Class (e.g. Motors, Sensors etc.).
 */
public class DropperComponents {
	public static CANTalon leftDropperMotor = new CANTalon(RobotMap.k_DROPPER_TALON_LEFT);
	public static CANTalon rightDropperMotor = new CANTalon(RobotMap.k_DROPPER_TALON_RIGHT);
}
