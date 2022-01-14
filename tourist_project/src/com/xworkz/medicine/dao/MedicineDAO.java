package com.xworkz.medicine.dao;

import java.util.List;

import com.xworkz.medicine.entity.MedicineEntity;

public interface MedicineDAO 
{
   public void putMedicine(MedicineEntity entity);
   
   public void addAll(List<MedicineEntity> entities);
}
