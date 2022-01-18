package com.xworkz.website;

import com.xworkz.website.dao.WebsiteDAO;
import com.xworkz.website.dao.WebsiteDAOImpl;
import com.xworkz.website.entity.WebsiteEntity;

public class WebQueryScammer {

	public static void main(String[] args) {
		
		WebsiteDAO dao= new WebsiteDAOImpl();
		
		WebsiteEntity entity=new WebsiteEntity();
		System.out.println(dao.getByNameXworkz());
		System.out.println(dao.getByLikeUrlX());
		System.out.println(dao.getByMinSince());
		System.out.println(dao.getByMaxSince());
		

	}

}
