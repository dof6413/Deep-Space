/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  //TODO: Validate this
  WPI_VictorSPX intakeMotor = new WPI_VictorSPX(/*RobotMap.Intake*/ 3);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void Cargo(double speed) {
    intakeMotor.set(speed);
  }

  public void ExtendArm(boolean extend) {
    if(extend) {
      Robot.armExtender.set(Value.kForward);
    } else {
      Robot.armExtender.set(Value.kReverse);
    }
  } 
}
