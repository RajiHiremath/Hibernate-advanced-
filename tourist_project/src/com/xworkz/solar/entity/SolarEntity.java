package com.xworkz.solar.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="solar_table")
public class SolarEntity implements Serializable
{
	@Id
	 @Column(name="id")
	 private int id;
	 @Column(name="name")
	 private String name;
	 @Column(name="size")
	 private String size;
	 @Column(name="price")
	 private int price;
	 @Column(name="noOfPanels")
	 private int noOfPanels;
	 @Column(name="totalVolt")
	 private int TotalVoltages;
	 
	 public SolarEntity() {
		System.out.println("invoked no arg const");
	}

	public SolarEntity(int id, String name, String size, int price, int noOfPanels, int totalVoltages) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.price = price;
		this.noOfPanels = noOfPanels;
		TotalVoltages = totalVoltages;
	}

	@Override
	public String toString() {
		return "SolarSystemEntity [id=" + id + ", name=" + name + ", size=" + size + ", price=" + price
				+ ", noOfPanels=" + noOfPanels + ", TotalVoltages=" + TotalVoltages + "]";
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNoOfPanels() {
		return noOfPanels;
	}

	public void setNoOfPanels(int noOfPanels) {
		this.noOfPanels = noOfPanels;
	}

	public int getTotalVoltages() {
		return TotalVoltages;
	}

	public void setTotalVoltages(int totalVoltages) {
		TotalVoltages = totalVoltages;
	}
}
