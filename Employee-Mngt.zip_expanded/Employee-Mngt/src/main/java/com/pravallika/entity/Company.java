package com.pravallika.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Company {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "compid")
	private int cId;
	@Column(name = "compname", length = 20)
	private String cName;
	@Column(name = "complocation")
	private String cLocation;
	@Column(name = "comppincode")
	private int cPincode;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcLocation() {
		return cLocation;
	}
	public void setcLocation(String cLocation) {
		this.cLocation = cLocation;
	}
	public int getcPincode() {
		return cPincode;
	}
	public void setcPincode(int cPincode) {
		this.cPincode = cPincode;
	}
	
	
}