package de.thro.inf.prg3.a09.resource;

import javafx.scene.image.Image;

public class FxImageLoaderAdapter {
	private ResourceLoader<Image> loader = new ResourceLoader<>(Image::new);

	public Image loadImage(String path) {
		return loader.loadResource(ClassLoader.getSystemClassLoader(), path);
	}
}
