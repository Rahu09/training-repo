package com.hexa.relationdemo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "user_name")
	private String userName;
	
	//reference columns
	
	// one-to-one
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	
	//one-to-many
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="user_mobile_mapping", 
	joinColumns = @JoinColumn(name="user_idd"),
	inverseJoinColumns = @JoinColumn(name ="mobile_id"))
	private List<Mobile> mobileList = new ArrayList<>();

	//many-to-many
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="user_vehicle_mapping", 
	joinColumns = @JoinColumn(name="user_id"),
	inverseJoinColumns = @JoinColumn(name ="vehicle_id"))
	private List<Vehicle> vehicleList = new ArrayList<>();

	public User(int id, String userName, Address address, List<Mobile> mobileList, List<Vehicle> vehicleList) {
		super();
		this.id = id;
		this.userName = userName;
		this.address = address;
		this.mobileList = mobileList;
		this.vehicleList = vehicleList;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Mobile> getMobileList() {
		return mobileList;
	}

	public void setMobileList(List<Mobile> mobileList) {
		this.mobileList = mobileList;
	}

	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", address=" + address + ", mobileList=" + mobileList
				+ ", vehicleList=" + vehicleList + "]";
	}
	
	
}
