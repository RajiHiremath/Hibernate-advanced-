package com.xworkz.product.dao;

import java.util.List;

import com.xworkz.product.entity.ProductEntity;

public interface ProductDAO {

	public void save(ProductEntity entity);
	
	public void saveAll(List<ProductEntity> entities);
	
	List<ProductEntity> getAll(List<ProductEntity> entities);
	
	ProductEntity getMaxPrice();
	
	ProductEntity getTotalPrice();
	
	String getBrandByName(String name);
	
	ProductEntity getByBrand(String brand);
	
	ProductEntity getNameAndPrice(String name,double price);
	
	ProductEntity getNameAndPriceByBrand(String brand);
	
	int getQuantityByName(String name);
	
	ProductEntity getQuantityAndPriceByName(String name);
	
	ProductEntity getQuantityAndPriceByNameAndId(String name,int id);
	
	ProductEntity getByNameAndId(String name,int id);
	
	String getByName(String name);
	
	double getByPriceGreaterThan(double price);
	
	
	
}
