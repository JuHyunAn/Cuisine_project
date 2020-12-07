package com.cuisine.web.entity;

public class Comment {
	
	int id;
	int restaurantId;
	int memberId;
	String content;
	int score;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "RegComment [id=" + id + ", restaurantId=" + restaurantId + ", memberId=" + memberId + ", content="
				+ content + ", score=" + score + "]";
	}
	
	
}
