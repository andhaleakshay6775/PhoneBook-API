package com.Phone.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="CONTACT_DTLS")
@Data
public class Contact {
	@Id
	@GeneratedValue
	@Column(name = "CONTACT_ID")
	  private Integer contactId;
	
	@Column(name = "CONTACT_NAME")
	  private String contactName;
	@Column(name = "CONTACT_EMAIL")
	  private String contactEmail;
	@Column(name = "CONTACT_NUMBER")
	  private Long contactNumber;
	@Column(name = "CREATION_DATE")
	  private Date cretaiondate;
	@Column(name = "UPDATED_DATE")
	  private Date updateddate;
}
