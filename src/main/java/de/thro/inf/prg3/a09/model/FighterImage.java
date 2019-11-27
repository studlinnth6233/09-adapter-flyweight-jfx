package de.thro.inf.prg3.a09.model;

import de.thro.inf.prg3.a09.resource.ResourceLoader;
import javafx.scene.image.Image;

public class FighterImage
{
	private final Image image;

	protected FighterImage(String path)
	{
		ResourceLoader<Image> imageLoader = new ResourceLoader<>(Image::new);

		this.image = imageLoader.loadResource(ClassLoader.getSystemClassLoader(), path);
	}

	public Image getImage()
	{
		return this.image;
	}
}
