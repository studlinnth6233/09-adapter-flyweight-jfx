package de.thro.inf.prg3.a09.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class NameGeneratorTest
{

	private static final Logger logger = LogManager.getLogger(NameGeneratorTest.class);
	private final NameGenerator nameGenerator = new NameGenerator();

	@Test
	void generateName()
	{
		for (int i = 0; i < 100; i++)
		{
			String generatedName = nameGenerator.generateName();
			assertNotNull(generatedName);
			assertNotEquals(0, generatedName.length());
			logger.debug("Generated name: {}", generatedName);
		}
	}
}
