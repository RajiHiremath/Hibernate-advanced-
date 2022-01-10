package com.xworkz.state.dao;
import com.xworkz.state.entity.StateEntity;

public interface StateDAO 
{
	public void create(StateEntity entity);
	 
	 default StateEntity getById(int id)
		{
			return null;
		}
		default void updateNoOfDistById(int newNoOfDist,int id)
		{
			
		}
		
		default void deleteId(int id) {
			
		}
}
