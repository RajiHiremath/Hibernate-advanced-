package com.xworkz.airport.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="airport_table")
public class AirportEntity implements Serializable
{
	@Id
	 @Column(name="id")
	 private int id;
	 @Column(name="name")
	 private String name;
	 @Column(name="location")
	 private String location;
	 @Column(name="type")
	 private String type;
	 @Column(name="sanitized")
	 private boolean sanitized;
	 @Column(name="noOfWorkers")
	 private int noOfWorkers;
	
	 
	public AirportEntity() {
		System.out.println("invoked no args const");
	}


	public AirportEntity(int id, String name, String location, String type, boolean sanitized, int noOfWorkers) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.type = type;
		this.sanitized = sanitized;
		this.noOfWorkers = noOfWorkers;
	}


	@Override
	public String toString() {
		return "AirportEntity [id=" + id + ", name=" + name + ", location=" + location + ", type=" + type
				+ ", sanitized=" + sanitized + ", noOfWorkers=" + noOfWorkers + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public boolean isSanitized() {
		return sanitized;
	}


	public void setSanitized(boolean sanitized) {
		this.sanitized = sanitized;
	}


	public int getNoOfWorkers() {
		return noOfWorkers;
	}


	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}
}
