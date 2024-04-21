package com.cecilio0.dicostat.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class MainController {
	@FXML
	private Label mainWindowLabel;
	
	@FXML
	protected void onShowMessageButtonClicked() {
		mainWindowLabel.setText("Welcome to JavaFX Application!");
	};

}
