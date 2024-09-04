package application;

import java.util.ArrayList;

public class row {
	private int counter;
	
	private ArrayList<String> arr;
	
	public row() {
		arr = new ArrayList<String>();
		counter = 0;
	}
	
	public void insertLetter (String letter) {
		if (counter != 5) {
			arr.add(letter);
			++counter;
			//System.out.println(arr.get(counter - 1));
		}
	}
	
	public void deleteLetter() {
		if (counter != 0) {
			arr.remove(counter - 1);
			--counter;
		}
	}
	
	public boolean isFull() {
		return counter == 5;
	}
	
	public ArrayList<String> getRow() {
		return arr;
	}
	
	public void reset() {
		arr.clear();
		counter = 0;
	}
	
	public String at(int i) {
		return arr.get(i);
	}
	
	public int size() {
		return counter;
	}
}
