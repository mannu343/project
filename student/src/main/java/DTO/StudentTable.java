package DTO;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="student")
public class StudentTable {
	@Id
	private long s_mob;
	@Column (nullable = false)
	private String s_name;
	@Column (nullable = false)
	private Date s_dob;
	@Column (nullable = false)
	private String s_adress;
	@Column (nullable = false)
	private String s_Contry;
	@Column (nullable = false)
	private String s_gender;
	@Column (nullable = false)
	private String s_hobies;
	public long getS_mob() {
		return s_mob;
	}
	public void setS_mob(long s_mob) {
		this.s_mob = s_mob;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public Date getS_dob() {
		return s_dob;
	}
	public void setS_dob(Date s_dob) {
		this.s_dob = s_dob;
	}
	public String getS_adress() {
		return s_adress;
	}
	public void setS_adress(String s_adress) {
		this.s_adress = s_adress;
	}
	public String getS_Contry() {
		return s_Contry;
	}
	public void setS_Contry(String s_Contry) {
		this.s_Contry = s_Contry;
	}
	public String getS_gender() {
		return s_gender;
	}
	public void setS_gender(String s_gender) {
		this.s_gender = s_gender;
	}
	public String getS_hobies() {
		return s_hobies;
	}
	public void setS_hobies(String s_hobies) {
		this.s_hobies = s_hobies;
	}
	
	

}
