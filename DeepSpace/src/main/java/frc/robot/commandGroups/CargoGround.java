/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commandGroups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;
import frc.robot.commands.SetFirstStage;
import frc.robot.commands.SetIntakePosition;
import frc.robot.commands.SetPneumaticPosition;
import frc.robot.commands.SetSecondStage;

public class CargoGround extends CommandGroup {
  public CargoGround() {
    addParallel(new SetFirstStage(RobotMap.StageOneCargoFloor));
    addParallel(new SetSecondStage(RobotMap.StageTwoCargoFloor));
    addParallel(new SetIntakePosition(RobotMap.IntakeCargoPickup));
    addParallel(new SetPneumaticPosition(true));
  }
}