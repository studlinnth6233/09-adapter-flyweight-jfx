package de.thro.inf.prg3.a09.resource;

import javafx.scene.image.Image;

public class FxImageLoaderAdapter
{
	private final ResourceLoader<Image> imageLoader = new ResourceLoader<>(Image::new);

	public Image loadImage(String path)
	{
		return imageLoader.loadResource(ClassLoader.getSystemClassLoader(), path);
	}

	public Image loadImage(ClassLoader resourceContext, String path)
	{
		return imageLoader.loadResource(resourceContext, path);
	}
}
