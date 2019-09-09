package com.grandcircus.wordsearch.finder;

import java.util.ArrayList;
import java.util.List;
import com.grandcircus.wordsearch.keyword.Coordinates;

public class Horizontal extends Compass {

	public Horizontal (Compass compass) {
		super(compass.getKeyword(), compass.getCoordinates());
	}
	
	@Override
	public void makeGridSubstring() {
		String gridSubstring = "";
		int aStep = 0;
		for (; !outOfLetters(aStep); aStep++) {
			gridSubstring += grid[thisRow][forward + aStep];
		}
		setGridSubstring(gridSubstring);
	}
	
	@Override
	public void findRemainingCoordinates() {
		List<Coordinates> foundCoordinates = new ArrayList<>();
		foundCoordinates.add(coordinates);
		int aStep = 0;
		for (; !outOfLetters(aStep); aStep++) {
			foundCoordinates.add(new Coordinates(thisRow, forward + aStep));
		}
		setRemainingCoordinates(foundCoordinates);
	}

	@Override
	public String toString() {
		return "Horizontal";
	}

}
