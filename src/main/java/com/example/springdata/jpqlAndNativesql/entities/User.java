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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String msisdn;	

	@Column(name = "ServiceId") 
	private int serviceId;
	@Column(name = "planType") 
	private int planType;
	
	private String source;
}
