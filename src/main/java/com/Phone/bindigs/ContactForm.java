package com.Phone.bindigs;

import java.util.Date;

import lombok.Data;

@Data
public class ContactForm {
	
	 private Integer contactId;
	 private String contactName;
	 private String contactEmail;
	 private Long contactNumber;
	 private Date cretaiondate;
	 private Date updateddate;

}
