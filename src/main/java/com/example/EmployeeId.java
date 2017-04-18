package com.example;

public class EmployeeId {
	String nama;
	String gender;
	Integer id;
	
	EmployeeId(String nama,String gender,Integer id){
		this.nama=nama;
		this.gender=gender;
		this.id=id;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
