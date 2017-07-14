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
	@Override
	public String toString() {
		return "FooDto [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + ", field4=" + field4
				+ ", field5=" + field5 + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((field1 == null) ? 0 : field1.hashCode());
		result = prime * result + (field2 ? 1231 : 1237);
		result = prime * result + field3;
		result = prime * result + ((field4 == null) ? 0 : field4.hashCode());
		result = prime * result + ((field5 == null) ? 0 : field5.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FooDto other = (FooDto) obj;
		if (field1 == null) {
			if (other.field1 != null)
				return false;
		} else if (!field1.equals(other.field1))
			return false;
		if (field2 != other.field2)
			return false;
		if (field3 != other.field3)
			return false;
		if (field4 == null) {
			if (other.field4 != null)
				return false;
		} else if (!field4.equals(other.field4))
			return false;
		if (field5 == null) {
			if (other.field5 != null)
				return false;
		} else if (!field5.equals(other.field5))
			return false;
		return true;
	}
	
	
	
}
