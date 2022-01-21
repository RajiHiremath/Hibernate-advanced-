package com.xworkz.product.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name="product_table")
@NamedQueries({
  @NamedQuery(name="getAll",query="select product from ProductEntity product "),
  @NamedQuery(name="getMaxPrice",query="select MAX(price) from ProductEntity"),
  @NamedQuery(name="getTotalPrice",query="select Sum(Price) from ProductEntity;"),
  @NamedQuery(name="getBrandByName",query="select product.brand from ProductEntity product where product.name=:nm"),
  @NamedQuery(name="getByBrand",query="select product.brand from ProductEntity product where product.brand=:bd"),
  @NamedQuery(name="getNameAndPrice",query="select product.name,product.price from ProductEntity product where product.name=:nm,product.price=:pr"),
  @NamedQuery(name="getNameAndPriceByBrand",query="select prodcut.name,product.price from ProductEntity product where product.brand=:bd"),
  @NamedQuery(name="getQuantityByName",query="select product.quantity from ProductEntity product where product.name=:nm"),
  @NamedQuery(name="getQuantityAndPriceByName",query="select product.quantity,product.price from ProductEntity product prodcut.name=:nm"),
  @NamedQuery(name="getQuantityAndPriceByNameAndId",query="select product.quantity,product.price from ProductEntity product where product.name=:nm,product.id=:id"),
  @NamedQuery(name="getByNameAndId",query="select product.name,product.id from ProductEntity product where product.name=:nm,product.id=:id"),
  @NamedQuery(name="getByName",query="select product.name from ProductEntity product where product.name=:nm"),
  @NamedQuery(name="getByPriceGreaterThan",query="select product.MAX(price) from ProductEntity product where product.price=:pr")
})
public class ProductEntity implements Serializable
{
 @Id
 @Column(name="id")
 private int id;
 @Column(name="name")
 private String name;
 @Column(name="quantity")
 private int quantity;
 @Column(name="brand")
 private String brand;
 @Column(name="price")
 private double price;
 @Column(name="rating")
 private float rating;

 public ProductEntity(String name, int quantity, String brand, double price, float rating) {
	super();
	this.name = name;
	this.quantity = quantity;
	this.brand = brand;
	this.price = price;
	this.rating = rating;
}
 
 
 
}
