package de.thro.inf.prg3.a09.model;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class FighterFactoryTest
{

	private final FighterFactory fighterFactory;

	FighterFactoryTest()
	{
		fighterFactory = new FighterFactory();
	}

	@Test
	void createFighterEnsureDifferentNames()
	{
		HashSet<String> fighters = new HashSet<>();

		for (int i = 0; i < 25; i++)
		{
			Fighter fighter = fighterFactory.createFighter();
			assertFalse(fighters.contains(fighter.getPilot()));
			fighters.add(fighter.getPilot());
		}
	}

	@Test
	void createFighterEnsureSideOfForce()
	{
		Map<Force, List<Fighter>> groupedBySideOfForce = IntStream.range(0, 100)
			.mapToObj(i -> fighterFactory.createFighter())
			.collect(Collectors.groupingBy(Fighter::getSideOfForce));

		assertEquals(2, groupedBySideOfForce.keySet().size());
	}

	@Test
	void createFighterEnsureTypesPerSideOfForce()
	{
		Map<Force, List<Fighter>> groupedBySideOfForce = IntStream.range(0, 100)
			.mapToObj(i -> fighterFactory.createFighter())
			.collect(Collectors.groupingBy(Fighter::getSideOfForce));

		for (Force sideOfForce : groupedBySideOfForce.keySet())
		{
			Map<? extends Class<?>, List<Fighter>> groupedByType = groupedBySideOfForce.get(sideOfForce)
				.stream()
				.collect(Collectors.groupingBy(Object::getClass));

			assertEquals(3, groupedByType.keySet().size());
		}
	}

}
