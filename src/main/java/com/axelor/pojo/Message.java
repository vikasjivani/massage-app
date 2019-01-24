package com.axelor.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message {

		@Id
	    @Column(name="id")
	    @GeneratedValue
	    private int id;
		
		@Column(name="uid")
		private int uid;
		
		@Column(name="uname")
		private String name;
		
		@Column(name="message")
		private String message;

		public Message() {
			super();
		}

		public Message( int uid, String name, String message) {
			super();
			this.uid = uid;
			this.name = name;
			this.message = message;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getUid() {
			return uid;
		}

		public void setUid(int uid) {
			this.uid = uid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		
		
		
}
