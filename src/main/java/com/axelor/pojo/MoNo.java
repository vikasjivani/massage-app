package com.axelor.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "mono")
public class MoNo {

    @Id
    @Column(name="mid")
    @GeneratedValue
    private int uid;
    @Column(name="number")
    private String number;
    
    @ManyToOne
    @JoinColumn(name="uid")
    private User user;

    public MoNo() {
    }

    public MoNo( String number, User user) {
      
        this.number = number;
        this.user = user;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
	
}
