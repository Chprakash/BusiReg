package com.prakash.busi.dto;

import org.springframework.stereotype.Component;

@Component
public class RoleDTO {
	private Long id;
	private String type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
