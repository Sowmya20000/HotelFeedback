package com.capg.HotelFeedbackModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Feedback")
public class HotelFeedback {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    //@NonNull
	@Column (name = "hotelfeedback")
	private String userId;
	
	@Column (name = "feedback")
	private int feedback;

	private String comments;
	
	@Column (name = "comments")
	//private String comments;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getFeedback() {
		return feedback;
	}
	public void setFeedback(int feedback) {
		this.feedback = feedback;
	}
	public String getComments() {
		return getComments();
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public HotelFeedback(String userId, int feedback, String comments) {
		super();
		this.userId = userId;
		this.feedback = feedback;
		this.comments = comments;
	}
	public HotelFeedback() {
		super();
	}
	@Override
	public String toString() {
		return "HotelFeedback [userId=" + userId + ", feedback=" + feedback + ", comments=" + comments + "]";
	}
	

}
