package de.thro.inf.prg3.a09.model;

import java.util.HashMap;
import java.util.Map;

public class FighterImageFactory
{
	private Map<String, FighterImage> images = new HashMap<>();

	FighterImage getFlyweight(String path)
	{
		if (images.containsKey(path))
			return images.get(path);

		FighterImage image = new FighterImage(path);
		images.put(path, image);
		return image;
	}
}
