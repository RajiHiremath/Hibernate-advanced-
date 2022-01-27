package com.xworkz.vendor;

import java.time.LocalDateTime;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.dao.VendorDAOImpl;
import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.service.VendorService;
import com.xworkz.vendor.service.VendorServiceImpl;

public class VendorScammer {

	public static void main(String[] args) {
		
		VendorEntity entity1=new VendorEntity("Rajeshwari","rajianuhiremath@gmail.com",
				"Rajeshwari H","Rajeshwari@123","C.B.S circle-Islampur Gangavathi Dt.Koppal",
				"KABCHWM9535EG56","Anusha",LocalDateTime.now());
		VendorEntity entity2=new VendorEntity("Anusha H","anuhiremath@gmail.com",
				"Anusha Math","anusha#12","Gandhi circle Gangavathi Dt.Koppal",
				"KABCHWM45678FGY","Rajeshwari",LocalDateTime.now());
		VendorEntity entity3=new VendorEntity("Manjunath","manjuhiremath@gmail.in",
				"Manjunath H","manju@hypex","C.B.S circle-Islampur Gangavathi Dt.Koppal",
				"KABDFYH4590EG56","Shailaja H",LocalDateTime.now());
 
		VendorDAO dao=new VendorDAOImpl();
		
		VendorService service=new VendorServiceImpl(dao);
		service.validateAndSave(entity1);
		service.validateAndSave(entity2);
		service.validateAndSave(entity3);
	}

}
