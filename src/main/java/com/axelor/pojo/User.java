package com.axelor.pojo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="user1")
public class User {
	
	@Id
    @Column(name="uid")
    @GeneratedValue
    private int uid;
    
    @Column(name = "enno")
    private String enNo;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "dob")
    private String dob;
    
    @Column(name = "gender")
    private String gendre;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "status")
    private int status;       // 0 -> non-active and 1 -> active 
    
    @Column(name = "type")
    private int type;         // 0  -> employee and  1  -> student
    
    @OneToMany(mappedBy = "user")
    Set<MoNo> moNos;
    
    
    @OneToMany(mappedBy = "user")
    Set<Leave> leaves;
    
    
    
    @ManyToMany
    @JoinTable(name = "user_sem", 
				joinColumns = { @JoinColumn(name = "uid") }, 
				inverseJoinColumns = { @JoinColumn(name = "sid") })
    Set<Semester> semesters;

    public User() {
    }

    public User( String enNo, String name, String email, String password,String date, String gendre, int status, int type) {
       
        this.enNo = enNo;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dob = date;
        this.gendre = gendre;
        this.status = status;
        this.type = type;
    }
    
    

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getEnNo() {
        return enNo;
    }

    public void setEnNo(String enNo) {
        this.enNo = enNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return dob;
    }

    public void setDate(String date) {
        this.dob = date;
    }

    public String getGendre() {
        return gendre;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Set<MoNo> getMoNos() {
        return moNos;
    }

    public void setMoNos(Set<MoNo> moNos) {
        this.moNos = moNos;
    }

    public Set<Semester> getSemesters() {
        return semesters;
    }

    public void setSemesters(Set<Semester> semesters) {
        this.semesters = semesters;
    }

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Set<Leave> getLeaves() {
		return leaves;
	}

	public void setLeaves(Set<Leave> leaves) {
		this.leaves = leaves;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
    
}
