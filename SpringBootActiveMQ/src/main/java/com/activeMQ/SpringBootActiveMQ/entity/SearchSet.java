package com.activeMQ.SpringBootActiveMQ.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SearchSet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String values;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}

	public String toString() {
		return "searchSet {id=" + id + ", name=" + name + ",values=" + values + "}";

	}

}
