package com.capgemini.dao;

import java.util.List;
import java.util.Map;

import com.capgemini.domain.Car;

public interface IDao {
public abstract boolean addCar(Map carList);
	
	public abstract boolean deleteCar(int car_id);
	
	public abstract List<Car> veiwCar();
	
	public abstract void editCar(int car_id);
	
	
	
	
	
}
