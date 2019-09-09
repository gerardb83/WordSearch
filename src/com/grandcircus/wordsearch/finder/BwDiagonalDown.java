package com.grandcircus.wordsearch.finder;

import java.util.ArrayList;
import java.util.List;
import com.grandcircus.wordsearch.keyword.Coordinates;

public class BwDiagonalDown extends Compass {

	public BwDiagonalDown(Compass compass) {
		super(compass.getKeyword(), compass.getCoordinates());
	}

	@Override
	public void makeGridSubstring() {
		String gridSubstring = "";
		int aStep = 0;
		for (; !outOfLetters(aStep); aStep++) {
			gridSubstring += grid[down + aStep][back - aStep];
		}
		setGridSubstring(gridSubstring);
	}

	@Override
	public void findRemainingCoordinates() {
		List<Coordinates> foundCoordinates = new ArrayList<>();
		foundCoordinates.add(coordinates);
		int aStep = 0;
		for (; !outOfLetters(aStep); aStep++) {
			foundCoordinates.add(new Coordinates(down + aStep, back - aStep));
		}
		setRemainingCoordinates(foundCoordinates);
	}

	@Override
	public String toString() {
		return "BwDiagonalDown";
	}
}
