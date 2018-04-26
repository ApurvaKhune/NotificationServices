package com.java.servlet;

public class WallRemainders {

	private String id;
	private String name;
	private String description;
	private String data;
	private long start_at_millis;
	private long end_at_millis;
	private long next_fired_at_millis;
	private long previous_fired_at_millis;
	private long frequency_in_millis;
	private boolean is_active;
	private String state;
	private int priority;
	private String created_by;
	private String last_updated_by;
	private String company_id;
	private int fired_count;
	private boolean recurring;
	private String type;

	private String start_at;
	private String end_at;
	private String next_fired_at;
	private String previous_fired_at;
	private String frequency;
	private String created_at;
	private String last_updated_at;
	private String post_id;

public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public long getStart_at_millis() {
		return start_at_millis;
	}

	public void setStart_at_millis(long start_at_millis) {
		this.start_at_millis = start_at_millis;
	}

	public long getEnd_at_millis() {
		return end_at_millis;
	}

	public void setEnd_at_millis(long end_at_millis) {
		this.end_at_millis = end_at_millis;
	}

	public long getNext_fired_at_millis() {
		return next_fired_at_millis;
	}

	public void setNext_fired_at_millis(long next_fired_at_millis) {
		this.next_fired_at_millis = next_fired_at_millis;
	}

	public long getPrevious_fired_at_millis() {
		return previous_fired_at_millis;
	}

	public void setPrevious_fired_at_millis(long previous_fired_at_millis) {
		this.previous_fired_at_millis = previous_fired_at_millis;
	}

	public long getFrequency_in_millis() {
		return frequency_in_millis;
	}

	public void setFrequency_in_millis(long frequency_in_millis) {
		this.frequency_in_millis = frequency_in_millis;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getLast_updated_by() {
		return last_updated_by;
	}

	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public int getFired_count() {
		return fired_count;
	}

	public void setFired_count(int fired_count) {
		this.fired_count = fired_count;
	}

	public boolean isRecurring() {
		return recurring;
	}

	public void setRecurring(boolean recurring) {
		this.recurring = recurring;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart_at() {
		return start_at;
	}

	public void setStart_at(String start_at) {
		this.start_at = start_at;
	}

	public String getEnd_at() {
		return end_at;
	}

	public void setEnd_at(String end_at) {
		this.end_at = end_at;
	}

	public String getNext_fired_at() {
		return next_fired_at;
	}

	public void setNext_fired_at(String next_fired_at) {
		this.next_fired_at = next_fired_at;
	}

	public String getPrevious_fired_at() {
		return previous_fired_at;
	}

	public void setPrevious_fired_at(String previous_fired_at) {
		this.previous_fired_at = previous_fired_at;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getLast_updated_at() {
		return last_updated_at;
	}

	public void setLast_updated_at(String last_updated_at) {
		this.last_updated_at = last_updated_at;
	}
	
	public String getPost_id() {
		return post_id;
	}

	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}

//	@Override
//	public String toString() {
//		try {
//			return new ObjectMapper().writeValueAsString(this);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return super.toString();
//	}

	public static void main(String[] args) {
		System.out.println(System.getenv("SERVER_INSTANCE_MODE"));
	}
}