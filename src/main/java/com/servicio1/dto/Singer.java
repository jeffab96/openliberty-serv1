package com.servicio1.dto;

import java.io.Serializable;
import java.util.Date;


//import javax.xml.bind.annotation.XmlRootElement;


public class Singer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Integer version;
	
	public Singer() {
	}

	public Singer(String firstName, String lastName, Date  birthDate, Integer version) {
		this.firstName = firstName;
		this.lastName =  lastName;
		this.birthDate =  birthDate;
		this.version = version;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	

	

}
