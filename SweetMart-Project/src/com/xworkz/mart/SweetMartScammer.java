package com.xworkz.mart;

import java.time.LocalDateTime;

import com.xworkz.mart.dao.SweetMartDAO;
import com.xworkz.mart.dao.SweetMartDAOImpl;
import com.xworkz.mart.dao.SweetMartService;
import com.xworkz.mart.dao.SweetMartServiceImpl;
import com.xworkz.mart.entity.SweetMartEntity;

public class SweetMartScammer {

	public static void main(String[] args) {
		
		SweetMartEntity entity1=new SweetMartEntity("Mishra Pedha-Gangavati", "Mahesh", 8050058473d, 
				                 9483764424d, "www.mishrapedhagvt.com", "Busstand road, near Gandhi circle,Gangavathi", 
				                 2012, 5, "8:00 AM", "10:00 PM", " C.B.T Hubli", "Best", true, false,"Raj",LocalDateTime.now(),"Raji",LocalDateTime.now());
		SweetMartEntity entity2=new SweetMartEntity("Mishra Pedha-Gangavathi", "Shailaja", 7204735375d, 
                9380674362d, "www.mishrapedha.in", "Mahaveer circle,Gangavathi", 
                2015, 7, "8:00 AM", "9:00 PM", " C.B.T Hubli", "Best", true, true,"Raju",LocalDateTime.now(),"Anu",LocalDateTime.now());

		SweetMartEntity entity3=new SweetMartEntity("Mishra Pedha-Gangavati", "Manju", 7202208648d, 
                9483764414d, "www.gvtmishrapedha.com", "CBI, opposite Gandhi circle,Gangavathi", 
                2012, 5, "8:00 AM", "10:00 PM", " C.B.T Hubli", "Best", false, false,"Shyloo" ,LocalDateTime.now(), "Shaila",LocalDateTime.now());
		
		SweetMartEntity entity4=new SweetMartEntity("Mishra Pedha-Koppal", "Veeresh", 9483764433d, 
                9483764400d, "www.mishrapedha@kpl.com", "Islampur circle,Koppal", 
                2012, 5, "7:00 AM", "10:00 PM", " C.B.T Hubli", "Best", true, true,"Praneet" ,LocalDateTime.now(),"Pranu",LocalDateTime.now());
		
		SweetMartEntity entity5=new SweetMartEntity("Mishra Pedha-Koppal","Manju M", 7202208648d, 
                9483764414d, "www.gvtmishrapedha@hpt.com", "Gandhi circle,Hospete", 
                2012, 5, null, "09:00 PM", " C.B.T Hubli", "Best", true, true,"Poorvik",LocalDateTime.now(),"Proovi",LocalDateTime.now());
		
		
		
	SweetMartDAO dao=new SweetMartDAOImpl();
//		dao.save(entity5);
//		dao.save(entity4);
//		dao.save(entity3);
//		dao.save(entity2);
//		dao.save(entity1);
		
		SweetMartService service=new SweetMartServiceImpl(dao);
		service.validationAndSave(entity5);
//		service.validationAndSave(entity4);
//		service.validationAndSave(entity3);
//		service.validationAndSave(entity2);
//		service.validationAndSave(entity1);
		
	}

}
