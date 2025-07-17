package com.spring.dto;

import java.io.Serializable;

public class LoginDTO implements Serializable
{	
	private String un;
	private String ps;
	
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
}
