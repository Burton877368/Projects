package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

import javafx.event.*;

public class SampleController {
	private int turns = 0;
	
	private labelList labels = new labelList();
	private row Row = new row();
	
	private Words words = new Words();
	
	private String hiddenWord = "CRANE";
	
	@FXML private Button Q, W, E, R, T, Y, U, I, O, P, A, S, D, F, G, H, J, K, L, Z, X, C, V, B, N, M, ENTER, DELETE;
	
	@FXML private Label label00, label01, label02, label03, label04, label10, label11, label12, label13, label14, label20, label21, label22, label23, label24, label30, label31, label32, label33, label34, label40, label41, label42, label43, label44, label50, label51, label52, label53, label54;
	
	@FXML public void initialize() {
		labels.add(label00);
		labels.add(label01);
		labels.add(label02);
		labels.add(label03);
		labels.add(label04);
		labels.add(label10);
		labels.add(label11);
		labels.add(label12);
		labels.add(label13);
		labels.add(label14);
		labels.add(label20);
		labels.add(label21);
		labels.add(label22);
		labels.add(label23);
		labels.add(label24);
		labels.add(label30);
		labels.add(label31);
		labels.add(label32);
		labels.add(label33);
		labels.add(label34);
		labels.add(label40);
		labels.add(label41);
		labels.add(label42);
		labels.add(label43);
		labels.add(label44);
		labels.add(label50);
		labels.add(label51);
		labels.add(label52);
		labels.add(label53);
		labels.add(label54);
		
		hiddenWord = words.getHiddenWord();
		System.out.println(hiddenWord);
	}
	
	@FXML public void onButtonClicked(ActionEvent event) {
		Button pressedButton = (Button) event.getTarget();
		
			//System.out.println(pressedButton.getId());
			Row.insertLetter(pressedButton.getId());
			updateGame(pressedButton.getId());
		
	}
	
	public void delete() {
		Row.deleteLetter();
		updateGame("DELETE");
	}
	
	public void enter() {
		updateGame("ENTER");
	}
	
	public void disableEverything() {
		Q.disarm();
		W.disarm();
		E.disarm();
		R.disarm();
		T.disarm();
		Y.disarm();
		U.disarm();
		I.disarm();
		O.disarm();
		P.disarm();
		A.disarm();
		S.disarm();
		D.disarm();
		F.disarm();
		G.disarm();
		H.disarm();
		J.disarm();
		K.disarm();
		L.disarm();
		Z.disarm();
		X.disarm();
		C.disarm();
		V.disarm();
		B.disarm();
		N.disarm();
		M.disarm();
		ENTER.disarm();
		DELETE.disarm();
	}
	
	public void reset() {
		Q.arm();
		W.arm();
		E.arm();
		R.arm();
		T.arm();
		Y.arm();
		U.arm();
		I.arm();
		O.arm();
		P.arm();
		A.arm();
		S.arm();
		D.arm();
		F.arm();
		G.arm();
		H.arm();
		J.arm();
		K.arm();
		L.arm();
		Z.arm();
		X.arm();
		C.arm();
		V.arm();
		B.arm();
		N.arm();
		M.arm();
		ENTER.arm();
		DELETE.arm();
		Row.reset();
		turns = 0;
		label00.setText("");
		label01.setText("");
		label02.setText("");
		label03.setText("");
		label04.setText("");
		label10.setText("");
		label11.setText("");
		label12.setText("");
		label13.setText("");
		label14.setText("");
		label20.setText("");
		label21.setText("");
		label22.setText("");
		label23.setText("");
		label24.setText("");
		label30.setText("");
		label31.setText("");
		label32.setText("");
		label33.setText("");
		label34.setText("");
		label40.setText("");
		label41.setText("");
		label42.setText("");
		label43.setText("");
		label44.setText("");
		label50.setText("");
		label51.setText("");
		label52.setText("");
		label53.setText("");
		label54.setText("");
		label00.setStyle("-fx-background-color:#303030");
		label01.setStyle("-fx-background-color:#303030");
		label02.setStyle("-fx-background-color:#303030");
		label03.setStyle("-fx-background-color:#303030");
		label04.setStyle("-fx-background-color:#303030");
		label10.setStyle("-fx-background-color:#303030");
		label11.setStyle("-fx-background-color:#303030");
		label12.setStyle("-fx-background-color:#303030");
		label13.setStyle("-fx-background-color:#303030");
		label14.setStyle("-fx-background-color:#303030");
		label20.setStyle("-fx-background-color:#303030");
		label21.setStyle("-fx-background-color:#303030");
		label22.setStyle("-fx-background-color:#303030");
		label23.setStyle("-fx-background-color:#303030");
		label24.setStyle("-fx-background-color:#303030");
		label30.setStyle("-fx-background-color:#303030");
		label31.setStyle("-fx-background-color:#303030");
		label32.setStyle("-fx-background-color:#303030");
		label33.setStyle("-fx-background-color:#303030");
		label34.setStyle("-fx-background-color:#303030");
		label40.setStyle("-fx-background-color:#303030");
		label41.setStyle("-fx-background-color:#303030");
		label42.setStyle("-fx-background-color:#303030");
		label43.setStyle("-fx-background-color:#303030");
		label44.setStyle("-fx-background-color:#303030");
		label50.setStyle("-fx-background-color:#303030");
		label51.setStyle("-fx-background-color:#303030");
		label52.setStyle("-fx-background-color:#303030");
		label53.setStyle("-fx-background-color:#303030");
		label54.setStyle("-fx-background-color:#303030");
		label00.setStyle("-fx-border-color:#a0a0a0");
		label01.setStyle("-fx-border-color:#a0a0a0");
		label02.setStyle("-fx-border-color:#a0a0a0");
		label03.setStyle("-fx-border-color:#a0a0a0");
		label04.setStyle("-fx-border-color:#a0a0a0");
		label10.setStyle("-fx-border-color:#a0a0a0");
		label11.setStyle("-fx-border-color:#a0a0a0");
		label12.setStyle("-fx-border-color:#a0a0a0");
		label13.setStyle("-fx-border-color:#a0a0a0");
		label14.setStyle("-fx-border-color:#a0a0a0");
		label20.setStyle("-fx-border-color:#a0a0a0");
		label21.setStyle("-fx-border-color:#a0a0a0");
		label22.setStyle("-fx-border-color:#a0a0a0");
		label23.setStyle("-fx-border-color:#a0a0a0");
		label24.setStyle("-fx-border-color:#a0a0a0");
		label30.setStyle("-fx-border-color:#a0a0a0");
		label31.setStyle("-fx-border-color:#a0a0a0");
		label32.setStyle("-fx-border-color:#a0a0a0");
		label33.setStyle("-fx-border-color:#a0a0a0");
		label34.setStyle("-fx-border-color:#a0a0a0");
		label40.setStyle("-fx-border-color:#a0a0a0");
		label41.setStyle("-fx-border-color:#a0a0a0");
		label42.setStyle("-fx-border-color:#a0a0a0");
		label43.setStyle("-fx-border-color:#a0a0a0");
		label44.setStyle("-fx-border-color:#a0a0a0");
		label50.setStyle("-fx-border-color:#a0a0a0");
		label51.setStyle("-fx-border-color:#a0a0a0");
		label52.setStyle("-fx-border-color:#a0a0a0");
		label53.setStyle("-fx-border-color:#a0a0a0");
		label54.setStyle("-fx-border-color:#a0a0a0");
	}
	
	public void updateGame(String key) {
		
		if (Row.isFull() && key == "ENTER") {
			String currWord = "";
			
			for (int i = 0; i < 5; ++i) {
				currWord += labels.accessLabel(turns, i).getText().toLowerCase();
			}
			
			//System.out.println(words.checkWord(currWord));
			
			if (words.checkWord(currWord)) {
			
			
				for (int i = 0; i < 5; ++i) {
					//labels.showColor(turns, i, hiddenWord);
					
					if (hiddenWord.contains(labels.accessLabel(turns, i).getText().toLowerCase())) {
						if (hiddenWord.indexOf(labels.accessLabel(turns, i).getText().toLowerCase(), i) == i) {
							labels.accessLabel(turns, i).setStyle("-fx-background-color:green");
						} else {
							labels.accessLabel(turns, i).setStyle("-fx-background-color:yellow");
						}
					} else {
						labels.accessLabel(turns, i).setStyle("-fx-background-color:gray");
					}
					
					currWord += labels.accessLabel(turns, i).getText().toLowerCase();
				}
			
			
			
			
				++turns;
				Row.reset();
				
				if (turns > 5) {
					System.out.println("You Lose!");
					disableEverything();
				}
				
				if (words.checkWin(currWord)) {
					System.out.println("You Win!");
					disableEverything();
				}
			} else {
				System.out.println("Not a word");
				for (int i = 0; i < 5; ++i) {
					labels.clearText(turns, i);
				}
				Row.reset();
			}
			
		} else {
			
			for (int i = 0; i < Row.size(); ++i) {
				labels.showText(turns, i, Row.at(i));
			}
			
			for (int i = Row.size(); i < 5; ++i) {
				labels.clearText(turns, i);
			}
			
		}	
	}
}
