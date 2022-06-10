package com.example.accessingdatamysql.entities;
import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customer {
	@Id
//	@Column(name = "id", nullable = false)
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name="name",nullable = false)
	private String name;

	@Column(name="street",nullable = false)
	private String street;

	@Column(name="postcode",nullable = false)
	private String postcode;

	@Column(name="location",nullable = false)
	private String location;

	@Column(name="particularities",nullable = false)
	private String particularities;

	@Column(name="trial480",nullable = false)
	private String trial;

	public void setName(String name) {
		this.name = name;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setParticularities(String particularities) {
		this.particularities = particularities;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public void setTrial(String trial) {
		this.trial = trial;
	}

	public String getPhone() {
		return phone;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public Long getId() {
		return id;
	}

	public String getLocation() {
		return location;
	}

	public String getParticularities() {
		return particularities;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getTrial() {
		return trial;
	}
}
