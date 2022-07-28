package JunitTesting;

import java.lang.*;
public class Property extends java.lang.Object{
	
private String city;
private String owner;
private String propertyName;
double rentAmount;

private Plot plot;

int x,y,depth,width;


public Property () {
	propertyName = "";
	city = "";
	owner = "";
	rentAmount = 0.0;
	depth = 1;
	width = 1;
	x=0;
	y=0;
}

public Property (Property property) {
	this.propertyName = property.propertyName;
	this.city = property.city;
	this.rentAmount = property.rentAmount;
	this.owner = property.owner;
	this.x = property.x;
	this.y = property.y;
	this.width = property.width;
	this.depth = property.depth;
	
	}

public Property(String propertyName, String city, double rentAmount, String owner) {
	this.propertyName = propertyName;
	this.city = city;
	this.rentAmount = rentAmount;
	this.owner = owner;
}

public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth ) {
	this.propertyName = propertyName;
	this.city = city;
	this.rentAmount = rentAmount;
	this.owner = owner;
	this.x = x;
	this.y = y;
	this.width = width;
	this.depth = depth;
}

public String getCity() {
	return this.city;
}

public String getOwner() {
	return this.owner;
}


public double getRentAmount() {
	return this.rentAmount;
}


public String getPropertyName() {
	return this.propertyName;
}


public void setPlot(int x, int y, int width, int depth) {
	Plot plot = new Plot(x,y,width,depth);

}

public Plot getPlot() {
	Plot plot = new Plot(); 
	return plot;
}



public void setCity (String city) {
this.city = city;
}

public void setOwner (String owner) {
this.owner = owner;
}

public void setPropertyName (String propertyName) {
this.propertyName = propertyName;
}

public void setRentAmount (double rentAmount) {
this.rentAmount = rentAmount;
}

/*
Prints out the name, city, owner and rent amount for a property.
          Example:
              Property Name: Lakewood
               Located in Rockville
               Belonging to: Alex Tan
               Rent Amount: 3000.0
          Be sure the last item is the rent amount, preceded by a space.
*/

public String toString () {
	return ("Property name: "+propertyName+"\nLocated in: "+city+"\nBelonging to: "+owner+"\nRent Amount: "+rentAmount);
	
}

}


	

