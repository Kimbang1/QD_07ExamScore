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
@Table(name = "Slist")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;

	@Column(name = "examNumber", nullable = false)
	private String examNumber;

	@Column(name = "examName", nullable = false)
	private String examName;

	@Column(nullable = false)
	private String korean;

	@Column(nullable = false)
	private String khistory;

	@Column(name = "phoneNumber", nullable = false)
	private String phoneNumber;

	@CreationTimestamp
	private Timestamp regTM;

}
