package com.qd07.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Examdto {
	
	private String Examnumber;
	private String ExamName;
	private int Korean;
	private	int Khistory;
	private String PhoneNumber;
}
