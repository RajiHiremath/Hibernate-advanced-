package com.xworkz.sugar.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="sugar_table")
public class SugarEntity implements Serializable
{
	@Id
	@Column (name="id")
	private int id;
	@Column (name="name")
	private String name;
	@Column (name="factoryName")
	private String factoryName;
	@Column (name="quantity")
	private int quatity;
	@Column (name="location")
	private String cityName;
	
	public SugarEntity() {
		System.out.println("invoked no arg const");
	}

	public SugarEntity(int id, String name, String factoryName, int quatity, String cityName) {
		super();
		this.id = id;
		this.name = name;
		this.factoryName = factoryName;
		this.quatity = quatity;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "SugarCaneEntity [id=" + id + ", name=" + name + ", factoryName=" + factoryName + ", quatity=" + quatity
				+ ", cityName=" + cityName + "]";
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

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}
