package com.qd07.domain;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="Slist")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	
	@Column(nullable = false)
	private String Examnumber;
	
	@Column(nullable = false)
	private String ExamName;
	
	@Column(nullable = false)
	private String Korean;
	
	@Column(nullable = false)
	private String Khistory;
	
	@Column(nullable = false)
	private String PhoneNunber;
	
	@CreationTimestamp
	private Timestamp regTM;
		
	
}
