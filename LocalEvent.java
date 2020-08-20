/*a class representing
 * the tasks or the events
 * which are consisting of two 
 * members the event text and the date
*/
package com.amedsoft.todo;

import java.time.LocalDate;

public class LocalEvent {
	private String description;
	private LocalDate date;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalEvent(String description, LocalDate date) {
		
		this.description = description;
		this.date = date;
	}
	@Override
	public String toString() {
		return date+" "+description;
	}
	

}
