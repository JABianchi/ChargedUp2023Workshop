// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Roller;

public class IntakeEat extends CommandBase {
 
  private Roller roller; /** Creates a new IntakeEat. */
  public IntakeEat() {
    roller = Roller.getInstance();
    addRequirements(roller);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  roller.stop();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    roller.takein();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    roller.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}