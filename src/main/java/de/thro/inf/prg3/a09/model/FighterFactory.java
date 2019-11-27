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

	public FighterFactory()
	{
		nameGenerator = new NameGenerator();
		random = new Random();
		imageResourceLoader = new ResourceLoader<>(Image::new);
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
				return new AWing(nameGenerator.generateName(), imageResourceLoader.loadResource(ClassLoader.getSystemClassLoader(), "fighter/awing.jpg"));
			case 1:
				return new XWing(nameGenerator.generateName(), imageResourceLoader.loadResource(ClassLoader.getSystemClassLoader(), "fighter/xwing.jpg"));
			case 2:
				return new YWing(nameGenerator.generateName(), imageResourceLoader.loadResource(ClassLoader.getSystemClassLoader(), "fighter/ywing.jpg"));
			case 3:
				return new TieBomber(nameGenerator.generateName(), imageResourceLoader.loadResource(ClassLoader.getSystemClassLoader(), "fighter/tiebomber.jpg"));
			case 4:
				return new TieFighter(nameGenerator.generateName(), imageResourceLoader.loadResource(ClassLoader.getSystemClassLoader(), "fighter/tiefighter.jpg"));
			default:
				return new TieInterceptor(nameGenerator.generateName(), imageResourceLoader.loadResource(ClassLoader.getSystemClassLoader(), "fighter/tieinterceptor.jpg"));
		}
	}
}
