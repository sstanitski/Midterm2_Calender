package Calender.view;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import Calender.Main;

public class CalenderController {
	
	@FXML
	private ComboBox<String> day = new ComboBox<String>();
	@FXML
	private ComboBox<String> month = new ComboBox<String>();
	@FXML
	private ComboBox<String> year = new ComboBox<String>();
	
	String[] day28 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
			"21", "22", "23", "24", "25", "26", "27", "28"};
	String[] day29 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
			"21", "22", "23", "24", "25", "26", "27", "28", "29"};
	String[] day30 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
			"21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
	String[] day31 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
			"21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	@FXML
	public void initialize(){
	month.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "September", "November", "December");
	year.getItems().addAll("2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020");
	
	}
	@FXML
	private void handleMonth() {
		if(month.getValue().equals("January") || month.getValue().equals("March") || month.getValue().equals("May") ||
				month.getValue().equals("July") || month.getValue().equals("August") || month.getValue().equals("October") ||
				month.getValue().equals("December")){
			day.getItems().addAll(day31);
		}
		if(month.getValue().equals("September") || month.getValue().equals("April") || month.getValue().equals("June") ||
				month.getValue().equals("November")) {
			day.getItems().addAll(day30);
		}
		if(month.getValue().equals("February")) {
			if(year.getValue().equals("2012") || year.getValue().equals("2016"))
				day.getItems().addAll(day29);
			else{
				day.getItems().addAll(day28);
			}
			
		}
	}	
}
