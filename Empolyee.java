package com.prince.beans;

public  class Empolyee {
private String name;
private String salary;
private String cname;
private Address address ;



public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Empolyee(String name, String salary, String cname) {
	super();
	this.name = name;
	this.salary = salary;
	this.cname = cname;
}
public Empolyee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Empolyee [name=" + name + ", salary=" + salary + ", cname=" + cname + ", address=" + address + "]";
}


}
