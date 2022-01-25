package com.xworkz.mart.entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity
@Table(name="sweetmart_table")
public class SweetMartEntity implements Serializable
{
  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name="name")
  private String name;
  @Column(name="ownerName")
  private String ownerName;
  @Column(name="phoneNo")
  private double phoneNo;
  @Column(name="alternativeNo")
  private double alternativeNo;
  @Column(name="email")
  private String email;
  @Column(name="address")
  private String address;
  @Column(name="started")
  private double started;
  @Column(name="noOfWorkers")
  private int noOfWorkers;
  @Column(name="openTime")
  private String openTime;
  @Column(name="closeTime")
  private String closeTime;
  @Column(name="areaOfManufacture")
  private String areaOfManufacture;
  @Column(name="quality")
  private String quality;
  @Column(name="homeDelivery")
  private boolean homeDelivery;
  @Column(name="serviceCharge")
  private boolean serviceCharge;
  @Column(name="s_createdBy")
  private String createdBy;
  @Column(name="s_createdAT")
  private LocalDateTime  createdAT;
  @Column(name="s_updatedBy")
  private String updatedBy;
  @Column(name="s_updatedAt")
  private LocalDateTime  updatedAt;
public SweetMartEntity(String name, String ownerName, double phoneNo, double alternativeNo, String email,
		String address, double started, int noOfWorkers, String openTime, String closeTime, String areaOfManufacture,
		String quality, boolean homeDelivery, boolean serviceCharge, String createdBy, LocalDateTime createdAT,
		String updatedBy, LocalDateTime updatedAt) {
	super();
	this.name = name;
	this.ownerName = ownerName;
	this.phoneNo = phoneNo;
	this.alternativeNo = alternativeNo;
	this.email = email;
	this.address = address;
	this.started = started;
	this.noOfWorkers = noOfWorkers;
	this.openTime = openTime;
	this.closeTime = closeTime;
	this.areaOfManufacture = areaOfManufacture;
	this.quality = quality;
	this.homeDelivery = homeDelivery;
	this.serviceCharge = serviceCharge;
	this.createdBy = createdBy;
	this.createdAT = createdAT;
	this.updatedBy = updatedBy;
	this.updatedAt = updatedAt;
	
	
}

 
  
 }

