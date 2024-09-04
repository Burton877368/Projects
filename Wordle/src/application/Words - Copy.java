package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Words {
	private String hiddenWord;
	
	Scanner input;
	File file;
	
	public boolean checkWin(String currWord) {
		boolean same = true;
		for (int j = 0; j < 5; ++j) {
			if (hiddenWord.charAt(j) != currWord.charAt(j)) {
				same = false;
			}
		}
		return same;
	}
	
	public boolean checkWord(String currWord) {
		//System.out.println(":" + currWord + ":");
		try {
            file = new File("src/Words.txt");

            input = new Scanner(file);

		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] words = new String[20];
		
		int counter = 0;
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			
			words = line.trim().split("\t", -1);
			
			for (int i = 0; i < 20; ++i) {
				++counter;
				if (counter >= 2250) {
					break;
				}
				//System.out.println(":" + words[i] + ":");
				boolean same = true;
				for (int j = 0; j < 5; ++j) {
					if (words[i].charAt(j) != currWord.charAt(j)) {
						same = false;
					}
				}
				if (same) {
					return true;
				}
			}
			if (counter >= 2250) {
				break;
			}
		}
		//System.out.println(counter);
		return false;
	}
	
	public String getHiddenWord() {
		
		try {
            file = new File("src/Words.txt");

            input = new Scanner(file);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Random rand = new Random();
		
		int randInt = rand.nextInt(2250);
		//System.out.println(randInt);
		
		String[] words = new String[20];
		
		int counter = 0;
		boolean brek = false;
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			
			words = line.trim().split("\t", -1);
			
			for (int i = 0; i < 20; ++i) {
				++counter;
				if (counter >= 2250) {
					break;
				}

				//System.out.println(words[i]);
				if (counter == randInt) {
					hiddenWord = words[i];
					//System.out.println(hiddenWord);
					brek = true;
					break;
				}
			}
			if (counter >= 2250) {
				break;
			}
			if (brek) {
				break;
			}
		}
		
		return hiddenWord;
	}	
}
