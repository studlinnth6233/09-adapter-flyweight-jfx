package de.thro.inf.prg3.a09.model;

import de.thro.inf.prg3.a09.model.empire.TieBomber;
import de.thro.inf.prg3.a09.model.empire.TieFighter;
import de.thro.inf.prg3.a09.model.empire.TieInterceptor;
import de.thro.inf.prg3.a09.model.rebellion.AWing;
import de.thro.inf.prg3.a09.model.rebellion.XWing;
import de.thro.inf.prg3.a09.model.rebellion.YWing;
import de.thro.inf.prg3.a09.resource.ResourceLoader;
import de.thro.inf.prg3.a09.util.NameGenerator;
import javafx.scene.image.Image;

import java.util.Random;

/**
 * Factory to create new fighters
 * Creates random fighters
 *
 * @author Peter Kurfer
 */
public final class FighterFactory
{

	private static final int NumberOfKnownFighterTypes = 6;
	private final Random random;
	private final NameGenerator nameGenerator;
	private final ResourceLoader<Image> imageResourceLoader;
	private final FighterImageFactory imageFactory;

	public FighterFactory()
	{
		nameGenerator = new NameGenerator();
		random = new Random();
		imageResourceLoader = new ResourceLoader<>(Image::new);
		imageFactory = new FighterImageFactory();
	}

	/**
	 * Create a random Fighter
	 *
	 * @return a new Fighter instance
	 *
	 * @implNote the method has an implementation flaw because it always loads the fighters image
	 */
	public Fighter createFighter()
	{
		switch (random.nextInt(NumberOfKnownFighterTypes))
		{
			case 0:
				return new AWing(nameGenerator.generateName(), imageFactory.getFlyweight("fighter/awing.jpg").getImage());
			case 1:
				return new XWing(nameGenerator.generateName(), imageFactory.getFlyweight("fighter/xwing.jpg").getImage());
			case 2:
				return new YWing(nameGenerator.generateName(), imageFactory.getFlyweight("fighter/ywing.jpg").getImage());
			case 3:
				return new TieBomber(nameGenerator.generateName(), imageFactory.getFlyweight("fighter/tiebomber.jpg").getImage());
			case 4:
				return new TieFighter(nameGenerator.generateName(), imageFactory.getFlyweight("fighter/tiefighter.jpg").getImage());
			default:
				return new TieInterceptor(nameGenerator.generateName(), imageFactory.getFlyweight("fighter/tieinterceptor.jpg").getImage());
		}
	}
}
