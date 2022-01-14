package com.xworkz.biscuit;

import com.xworkz.biscuit.dao.BiscuitDAO;
import com.xworkz.biscuit.dao.BiscuitDAOImpl;
import com.xworkz.biscuit.entity.BiscuitEntity;

public class BiscuitScammer {

	public static void main(String[] args) {
		
		BiscuitEntity entity1=new BiscuitEntity(1,"Cadbury","Bournvita","Orange",140,5,"1905-England");
		 BiscuitEntity entity2=new BiscuitEntity(2,"cadbury ","cadbury Chocobakes","Purple",20,10,"200-Europe");
		 BiscuitEntity entity3=new BiscuitEntity(3,"Parle","Parle-G","Yellow",100,5,"1879-England");
	 
		 BiscuitDAO dao=new BiscuitDAOImpl();
		 dao.putBiscuit(entity1);
		 dao.putBiscuit(entity2);
		 dao.putBiscuit(entity3);
	}

}
