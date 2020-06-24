package jp.co.aivick.sugar.form;

import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;

public class UserProductShowForm {
	
	@NotNull
	@Positive
	private Integer userId;
	
	@NotNull
	@Past
	private Date date;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
