package de.thro.inf.prg3.a09.model;

import de.thro.inf.prg3.a09.resource.FxImageLoaderAdapter;
import javafx.scene.image.Image;

public class FighterImage
{
	private final Image image;

	protected FighterImage(String path)
	{
		FxImageLoaderAdapter imageLoader = new FxImageLoaderAdapter();

		this.image = imageLoader.loadImage(path);
	}

	public Image getImage()
	{
		return this.image;
	}
}
