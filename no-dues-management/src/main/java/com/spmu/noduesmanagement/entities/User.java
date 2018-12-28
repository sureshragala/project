package com.spmu.noduesmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SPMV_USERS")
public class User {
	
	@Id
	@Column(name = "id")
	private long id;
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
