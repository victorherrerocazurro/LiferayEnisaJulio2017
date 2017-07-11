package com.example.plugins.service.dto;

import java.util.Date;

public class FooDto {

	private String field1;
	private boolean field2;
	private int field3;
	private Date field4;
	private String field5;
	
	public FooDto(String field1, boolean field2, int field3, Date field4, String field5) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
		this.field5 = field5;
	}
	public FooDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public boolean isField2() {
		return field2;
	}
	public void setField2(boolean field2) {
		this.field2 = field2;
	}
	public int getField3() {
		return field3;
	}
	public void setField3(int field3) {
		this.field3 = field3;
	}
	public Date getField4() {
		return field4;
	}
	public void setField4(Date field4) {
		this.field4 = field4;
	}
	public String getField5() {
		return field5;
	}
	public void setField5(String field5) {
		this.field5 = field5;
	}
	
	
	
}
