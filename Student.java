package com.prince.beans;

public class Student {
  private String  name;
  private Address address;
  
  
  
  
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student( Address address) {
	super();
	this.address = address;
}
@Override
public String toString() {
	return "Student [name=" + name + ", address=" + address + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
	
	
	
	
	
	
	
} 
  
  
  
}
