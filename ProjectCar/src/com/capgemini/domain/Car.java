package com.capgemini.domain;

import com.flp.fms.domain.Column;

@Entity
public class Car {
	
	@Id @GeneratedValue(strategy=GeneratedTyped.Auto)
	@Column(nullable=false)
	public int car_id;
	
	@Column(nullable=false)
	public String carMake;
	
	@Column(nullable=false)
	public String carName;
	
	@Column(nullable=false)
	public String carModel;
	
	
	

	public Car() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Car [car_id=" + car_id + ", carMake=" + carMake + ", carName=" + carName + ", carModel=" + carModel
				+ ", getCar_id()=" + getCar_id() + ", getCarMake()=" + getCarMake() + ", getCarName()=" + getCarName()
				+ ", getCarModel()=" + getCarModel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

}
