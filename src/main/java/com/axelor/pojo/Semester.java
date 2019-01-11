package com.axelor.pojo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="semester")
public class Semester {

	 @Id
	    @Column(name="sid")
	    @GeneratedValue
	    private int sid;
	    
	    @Column(name="uid")
	    private int uid;
	    
	    @Column(name="semester")
	    private String sem;
	    
	    @ManyToMany
	            @JoinTable(name = "user_sem", 
					joinColumns = { @JoinColumn(name = "sid") }, 
					inverseJoinColumns = { @JoinColumn(name = "uid") })
	    Set<User> user;

	    public Semester() {
	    }

	    public Semester( String sem) {
	     
	        this.sem = sem;
	    }

	    public int getSid() {
	        return sid;
	    }

	    public void setSid(int sid) {
	        this.sid = sid;
	    }

	    public int getUid() {
	        return uid;
	    }

	    public void setUid(int uid) {
	        this.uid = uid;
	    }

	    public String getSem() {
	        return sem;
	    }

	    public void setSem(String sem) {
	        this.sem = sem;
	    }

	    public Set<User> getUser() {
	        return user;
	    }

	    public void setUser(Set<User> user) {
	        this.user = user;
	    }
}
