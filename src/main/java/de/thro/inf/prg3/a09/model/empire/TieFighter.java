package de.thro.inf.prg3.a09.model.empire;

import de.thro.inf.prg3.a09.model.Fighter;
import de.thro.inf.prg3.a09.model.Force;
import javafx.scene.image.Image;

public class TieFighter extends Fighter
{

	public TieFighter(String pilot, Image fighterImage)
	{
		super(pilot, fighterImage);
	}

	@Override
	public Force getSideOfForce()
	{
		return Force.DarkSide;
	}

	@Override
	public String getFighterType()
	{
		return "Tie Fighter";
	}
}
