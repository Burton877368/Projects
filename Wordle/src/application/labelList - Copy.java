package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class labelList {
	//@FXML private Label label00, label01, label02, label03, label04, label10, label11, label12, label13, label14, label20, label21, label22, label23, label24, label30, label31, label32, label33, label34, label40, label41, label42, label43, label44, label50, label51, label52, label53, label54;
	
	private ArrayList<Label> labelArr;
	
	labelList() {
		labelArr = new ArrayList<Label>();
	}
	
	public void add(Label l) {
		labelArr.add(l);
	}
	
	public Label accessLabel(int i, int j) {
		return labelArr.get(i * 5 + j);
	}
	
	public void showColor(int i, int j, String word) {
		//System.out.println(word);
		if (word.contains(accessLabel(i, j).getText())) {
			if (word.indexOf(accessLabel(i, j).getText()) == j) {
				accessLabel(i, j).setStyle("-fx-background-color:green");
			} else {
				accessLabel(i, j).setStyle("-fx-background-color:yellow");
			}
		} else {
			accessLabel(i, j).setStyle("-fx-background-color:gray");
		}
		
		
	}
	
	public void showText(int i, int j, String Letter) {
		//System.out.println(":" + Letter + ":");
		accessLabel(i, j).setText(Letter);
	}
	
	public void clearText(int i, int j) {
		accessLabel(i, j).setText("");
	}
}
