package com.hiber;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	@Override
	public String toString() {
		return "Certificate [course=" + course + ", dur=" + dur + "]";
	}
	private String course;
	private String dur;
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.dur = duration;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return dur;
	}
	public void setDuration(String duration) {
		this.dur = duration;
	}
}
