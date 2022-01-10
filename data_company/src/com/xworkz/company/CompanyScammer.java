package com.xworkz.company;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dao.CompanyDAOImpl;
import com.xworkz.company.entity.CompanyEntity;

public class CompanyScammer {

	public static void main(String[] args) {
		
		CompanyEntity entity=new CompanyEntity(1,"Accenture","service based","IT","www.accenture.itjob");
		CompanyEntity entity1=new CompanyEntity(2,"Xworkz ODC","Training Ist","IT","www.xworkzodc.btm");
		CompanyEntity entity2=new CompanyEntity(3,"TCS","service based","IT","www.tcscareer.com");
		CompanyEntity entity3=new CompanyEntity(4,"Cognizant","service based","IT","www.cognizantdeveloper.com");
		CompanyEntity entity4=new CompanyEntity(5,"Capgemini","service based","IT","www.capgeminisuperset.com");
		
		CompanyDAO dao=new CompanyDAOImpl();
		dao.create(entity);
		dao.create(entity1);
		dao.create(entity2);
		dao.create(entity3);
		dao.create(entity4);
		
		CompanyEntity idEntity=dao.getById(2);
		System.out.println(idEntity);

		dao.updateWebsiteById("www.careerHub.itjob :",3);
	    //dao.deleteById(3);

		
	}

}
