package com.amedsoft.todo;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.*;
import javafx.fxml.*;

import javafx.scene.control.*;

public class Controller implements Initializable{
    
	//the things that will happen in the starting point 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		datePicker.setValue(LocalDate.now());
		
	}
	@FXML
	Button addButton; // to add the event to the list
	@FXML
	TextField descriptionTextField; // to write about the event 
	@FXML
	DatePicker datePicker; // to chose the date of the event 
	@FXML
	ListView<LocalEvent> eventList; // to list the events or tasks 
	
	ObservableList<LocalEvent> list = FXCollections.observableArrayList(); // for processing the list inside the controller
    
	//the method for adding the task after pressing the add button
	@FXML
	private void addEvent(Event e) {
		//create an object of LocalEvent and add it to the list
		list.add(new LocalEvent(descriptionTextField.getText(), datePicker.getValue()));
		//add the list to the gui version
		eventList.setItems(list);
		//refresh the dataPicker and the textfield 
		refresh();
		
	}
	
	// for refreshing the dataPicker and the textfield to enter new values 
	private void refresh() {
		datePicker.setValue(LocalDate.now());
		descriptionTextField.setText(null);
		
	}
	
	

}
