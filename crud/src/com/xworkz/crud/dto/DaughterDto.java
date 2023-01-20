package com.xworkz.crud.dto;

import java.io.Serializable;

public class DaughterDto implements Serializable {

	private String nameD;
	private Long mobileNo;
	private Integer ageD;
	private Boolean commited;

	public DaughterDto() {
		// TODO Auto-generated constructor stub
	}

	public DaughterDto(String nameD, Long mobileNo, Integer ageD, Boolean commited) {
		super();
		this.nameD = nameD;
		this.mobileNo = mobileNo;
		this.ageD = ageD;
		this.commited = commited;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 18;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DaughterDto) {
				if (nameD.equals(this.nameD)) {
					DaughterDto dto = (DaughterDto) obj;
					System.out.println("equals method:  " + dto);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "DaughterDto [nameD=" + nameD + ", mobileNo=" + mobileNo + ", ageD=" + ageD + ", commited=" + commited + "]";
	}

	public String getNameD() {
		return nameD;
	}

	public void setNameD(String name) {
		this.nameD = nameD;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getAge() {
		return ageD;
	}

	public void setAge(Integer age) {
		this.ageD = ageD;
	}

	public Boolean getCommited() {
		return commited;
	}

	public void setCommited(Boolean commited) {
		this.commited = commited;
	}

}
