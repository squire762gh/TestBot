// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5137.TestBot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveBaseLeftMotor;
    public static SpeedController driveBaseRightMotor;
    public static RobotDrive driveBaseChassis;
    public static Encoder driveBaseLeftEncoder;
    public static Encoder driveBaseRightEncoder;
    public static SpeedController slideDriveMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveBaseLeftMotor = new VictorSP(0);
        LiveWindow.addActuator("DriveBase", "Left Motor", (VictorSP) driveBaseLeftMotor);
        driveBaseLeftMotor.setInverted(false);
        driveBaseRightMotor = new VictorSP(1);
        LiveWindow.addActuator("DriveBase", "Right Motor", (VictorSP) driveBaseRightMotor);
        driveBaseRightMotor.setInverted(false);
        driveBaseChassis = new RobotDrive(driveBaseLeftMotor, driveBaseRightMotor);
        
        driveBaseChassis.setSafetyEnabled(true);
        driveBaseChassis.setExpiration(0.1);
        driveBaseChassis.setSensitivity(0.5);
        driveBaseChassis.setMaxOutput(1.0);
        driveBaseChassis.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveBaseChassis.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        driveBaseLeftEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveBase", "Left Encoder", driveBaseLeftEncoder);
        driveBaseLeftEncoder.setDistancePerPulse(25.13);
        driveBaseLeftEncoder.setPIDSourceType(PIDSourceType.kDisplacement);
        driveBaseRightEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveBase", "Right Encoder", driveBaseRightEncoder);
        driveBaseRightEncoder.setDistancePerPulse(25.13);
        driveBaseRightEncoder.setPIDSourceType(PIDSourceType.kDisplacement);
        slideDriveMotor = new Spark(2);
        LiveWindow.addActuator("SlideDrive", "Motor", (Spark) slideDriveMotor);
        slideDriveMotor.setInverted(false);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
