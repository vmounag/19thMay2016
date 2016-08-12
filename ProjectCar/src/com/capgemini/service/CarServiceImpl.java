package com.capgemini.service;

import java.util.List;
import java.util.Map;

import com.capgemini.dao.DaoImpl;
import com.capgemini.dao.IDao;
import com.capgemini.domain.Car;

public class CarServiceImpl {

	IDao dao;
	
	public CarServiceImpl()
	{
		dao= new DaoImpl();
	}
	
	public boolean addCar(Map carList)
	{
	Car car=new Car();
	car.setCarMake((String) carList.get(1));	
	car.setCarModel((String) carList.get(2));	
	car.setCarName((String) carList.get(3));	
	if(dao.addCar())
	{
		return true;
	}
	else return false;
	}
	
	
	public boolean deleteCar(int car_id)
	{
		Car car=new Car();
       if(dao.deleteCar(car_id))
       {
    	   return true;
       }
       else return false;
		
	}
	
	
	public void editCar(int car_id)
	{
		Car car=new Car();
		dao.editCar(car_id);
		
	}
	
	public void veiwCar()
	{
		dao.veiwCar();
		
	}
		
		
		
		
	
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
