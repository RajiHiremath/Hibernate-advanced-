package com.xworkz.state;

import com.xworkz.state.dao.StateDAO;
import com.xworkz.state.dao.StateDAOImpl;
import com.xworkz.state.entity.StateEntity;

public class StateScammer {

	public static void main(String[] args) {

      StateEntity entity1=new StateEntity(1,"Karnataka",30,"Bangalore");
      StateEntity entity2=new StateEntity(2,"Andra Pradesh",31,"Hyderabad");
      StateEntity entity3=new StateEntity(3,"Tamil nadu",21,"Chennai");
      StateEntity entity4=new StateEntity(4,"Maharastra",29,"Mumbai");
      StateEntity entity5=new StateEntity(5,"West Bengal",28,"Kolkata");
      
      StateDAO dao=new StateDAOImpl();
      dao.create(entity5);
      dao.create(entity4);
      dao.create(entity3);
      dao.create(entity2);
      dao.create(entity1);
      
      StateEntity idEntity=dao.getById(4);
      System.out.println(idEntity);
      
      dao.updateNoOfDistById(35, 1);
      

	}

}
