module com.cecilio0.dicostat {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
	
	requires org.controlsfx.controls;
	requires com.dlsc.formsfx;
	requires net.synedra.validatorfx;
	requires org.kordamp.ikonli.javafx;
	requires eu.hansolo.tilesfx;
	
	opens com.cecilio0.dicostat to javafx.fxml;
	exports com.cecilio0.dicostat;
	exports com.cecilio0.dicostat.controllers;
	opens com.cecilio0.dicostat.controllers to javafx.fxml;
}