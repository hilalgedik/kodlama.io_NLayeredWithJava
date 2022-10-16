package kodlama.io_NLayered.entities;

import java.text.DecimalFormat;

public class Course extends Entity {
	
	private int id;
	private int instructorId;
	private int categoryId;
	private String name;
	private double price;
	
public Course() {
		
	}

public Course(int id, int instructorId, int categoryId, String name, double price) {
	super();
	this.id = id;
	this.instructorId = instructorId;
	this.categoryId = categoryId;
	this.name = name;
	this.price = price;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getInstructorId() {
	return instructorId;
}

public void setInstructorId(int instructorId) {
	this.instructorId = instructorId;
}

public int getCategoryId() {
	return categoryId;
}

public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

	

}
