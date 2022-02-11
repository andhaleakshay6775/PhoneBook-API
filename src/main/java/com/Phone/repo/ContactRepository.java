package com.Phone.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Phone.modal.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact,Serializable> {

}
