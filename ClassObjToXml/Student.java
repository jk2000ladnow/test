package com.jason.test;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Student")
public class Student implements Serializable {
	/** * */
	private static final long serialVersionUID = -8317239764136972094L;
	private String name;
	private String country;
	private String birthDate;
	
	public Student () {
	}
	
	public Student (String name, String country, String birthDate) {
		this.birthDate = birthDate;
		this.country = country;
		this.name = name;
	}
	

	/** * @param name * the name to set */
	public void setName(String name) {
		this.name = name;
	}


	/** * @param country * the country to set */
	public void setCountry(String country) {
		this.country = country;
	}

	
	/** * @param birthDate the birthDate to set */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getName() {
		return name;
	}


	public String getCountry() {
		return country;
	}


	public String getBirthDate() {
		return birthDate;
	}
	
}
