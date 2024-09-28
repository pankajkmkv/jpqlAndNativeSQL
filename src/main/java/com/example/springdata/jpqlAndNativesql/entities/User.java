package com.example.springdata.jpqlAndNativesql.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Data
@Table(name = "Airtel_Niger_subscription")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String msisdn;	

	@Column(name = "Serviceid") 
	private int serviceId;
	@Column(name = "plantype") 
	private int planType;
	
	private String source;
}
