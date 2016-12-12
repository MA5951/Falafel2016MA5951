
package org.usfirst.frc.team5951.robot;


import org.usfirst.frc.team5951.subsystems.chassis.ChassisArcade;
import org.usfirst.frc.team5951.subsystems.dropper.Dropper;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Timer;

/**
 * This is a demo program showing the use of the RobotDrive class.
 * The SampleRobot class is the base of a robot application that will automatically call your
 * Autonomous and OperatorControl methods at the right time as controlled by the switches on
 * the driver station or the field controls.
 *
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SampleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 *
 * WARNING: While it may look like a good choice to use for your code if you're inexperienced,
 * don't. Unless you know what you are doing, complex code will be much more difficult under
 * this system. Use IterativeRobot or Command-Based instead if you're new.
 */
public class Robot extends SampleRobot {
	//Joysticks
    private Joystick mainDriverStick;
    
    //Subsystems
    private ChassisArcade chassisArcade;
    private Dropper dropper;

    public Robot() {
        mainDriverStick = new Joystick(ButtonPorts.k_MAIN_DRIVER_JOYSTICK); //Main driver's joystick
        chassisArcade = new ChassisArcade(); //Chassis arcade init
    }
    
    public void robotInit() {
        
    }

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString line to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the if-else structure below with additional strings.
	 * If using the SendableChooser make sure to add them to the chooser code above as well.
	 */
    public void autonomous() {
    	
    }

    /**
     * Runs the motors with arcade steering.
     */
    public void operatorControl() {
        while(isEnabled() && isOperatorControl()){
        	chassisArcade.tankDrive(mainDriverStick.getAxis(AxisType.kX), mainDriverStick.getAxis(AxisType.kY));
        	Timer.delay(0);
        	Timer.delay(0.05);
        }
    }

    /**
     * Runs during test mode
     */
    public void test() {
    }
}
