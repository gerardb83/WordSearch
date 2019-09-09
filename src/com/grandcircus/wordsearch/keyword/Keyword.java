package com.grandcircus.wordsearch.keyword;

import java.util.List;

public class Keyword {

	protected String word;
	private Boolean isFound = false;
	protected Coordinates tempCoordinates;
	protected List<PotentialCoordinates> potentialCoordinates;
	private List<Coordinates> allCoordinates;

	public Keyword() {
		super();
	}

	public Keyword(String word) {
		super();
		this.word = word;
	}
	
	public Keyword(String word, Coordinates tempCoordinates) {
		super();
		this.word = word;
		this.tempCoordinates = tempCoordinates;
	}

	public Keyword(String word, List<PotentialCoordinates> potentialCoordinates) {
		super();
		this.word = word;
		this.potentialCoordinates = potentialCoordinates;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Boolean getIsFound() {
		return isFound;
	}

	public void setIsFound(Boolean isFound) {
		this.isFound = isFound;
	}
	
	public Coordinates getTempCoordinates() {
		return tempCoordinates;
	}

	public void setTempCoordinates(Coordinates tempCoordinates) {
		this.tempCoordinates = tempCoordinates;
	}

	public List<PotentialCoordinates> getPotentialCoordinates() {
		return potentialCoordinates;
	}

	public void setPotentialCoordinates(List<PotentialCoordinates> potentialCoordinates) {
		this.potentialCoordinates = potentialCoordinates;
	}

	public List<Coordinates> getAllCoordinates() {
		return allCoordinates;
	}

	public void setAllCoordinates(List<Coordinates> allCoordinates) {
		this.allCoordinates = allCoordinates;
	}

	public Integer getLength() {
		return getWord().length();
	}

	public String getSecondLetter() {
		return word.substring(1, 2);
	}
	
	public String writeCoordinatesString() {
		String coordinatesString = word + ": ";
		if (word.length() > 2) {
			for (int i = 0; i < allCoordinates.size() - 1; i++) {
				coordinatesString += allCoordinates.get(i) + ",";
			}
			coordinatesString += allCoordinates.get(allCoordinates.size() - 1);
		} else {
			coordinatesString += allCoordinates.get(0) + "," + allCoordinates.get(1);
		}

		return coordinatesString;
	}
	
	@Override
	public String toString() {
		return word;
	}

}