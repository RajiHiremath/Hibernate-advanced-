package com.xworkz.patient;

import com.xworkz.patient.dao.PatientDAO;
import com.xworkz.patient.dao.PatientDAOImpl;
import com.xworkz.patient.entity.PatientEntity;

public class PatientScammer {

	public static void main(String[] args) {
		
		PatientEntity entity1=new PatientEntity(1,"Pavitra","Davangere","Positive",26,27);
		PatientEntity entity2=new PatientEntity(2,"Pushpa","Bangalore","Negative",21,22);
		PatientEntity entity3=new PatientEntity(3,"Vijaya","Mandya","Positive",26,31);
		PatientEntity entity4=new PatientEntity(4,"Kalpana","Kolar","Negative",19,30);
		PatientEntity entity5=new PatientEntity(5,"Kaveri","Mysore","Negative",23,45);
		
		
		PatientDAO dao=new PatientDAOImpl();
		dao.create(entity5);
		dao.create(entity4);
		dao.create(entity3);
		dao.create(entity2);
		dao.create(entity1);
		
		PatientEntity idEntity=dao.getById(5);
		System.out.println(idEntity);
		
		dao.updateCoronaById("Positive", 4);

	}

}
