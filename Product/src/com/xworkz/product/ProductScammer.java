package com.xworkz.product;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class ProductScammer {

	public static void main(String[] args) {
	
		ProductEntity entity1=new ProductEntity("Shampoo", 5, "Chik", 750d, 4.1f);
		ProductEntity entity2=new ProductEntity("Lotion", 2, "Zever's", 680d, 4.5f);
		ProductEntity entity3=new ProductEntity("wallet", 4, "Jack", 1000d, 4.2f);
		ProductEntity entity4=new ProductEntity("perfume", 1, "Yardley", 350d, 4.6f);
		ProductEntity entity5=new ProductEntity("Mobile", 1, "realme 6", 15000d, 4.0f);
		
		List<ProductEntity> list=new ArrayList<ProductEntity>();
		ProductDAO dao=new ProductDAOImpl();
		dao.save(entity5);
		dao.save(entity4);
		dao.save(entity3);
		dao.save(entity2);
		dao.save(entity1);
		
		dao.saveAll(list);
		
		List<ProductEntity> product=dao.getAll(list);
		System.out.println(product);
		
		System.out.println(dao.getMaxPrice());
		
		System.out.println(dao.getBrandByName("mobile"));
		
		System.out.println(dao.getByBrand("Chik"));
		
		System.out.println(dao.getNameAndPrice("mobile", 15000));
		
		System.out.println(dao.getNameAndPriceByBrand("Jack"));
		
		System.out.println(dao.getQuantityByName("Lotion"));
		
		System.out.println(dao.getQuantityAndPriceByName("perfume"));
		
		System.out.println(dao.getQuantityAndPriceByNameAndId("Shampoo", 5));
		
		System.out.println(dao.getByNameAndId("mobile", 1));
		
		System.out.println(dao.getByName("wallet"));
		
		System.out.println(dao.getByPriceGreaterThan(500));

		
	}

}
