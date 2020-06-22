package jp.co.aivick.sugar.form;

import java.sql.Date;

import javax.validation.constraints.NotNull;

public class UserProductForm {
	
	private Integer userProcuctId;
	
	@NotNull
	private Integer productId;
	
	@NotNull
	private Double amount;
	
	@NotNull
	private Date date;
	
	private String[] productList;
	
	public String[] getProductList() {
		return productList;
	}

	public void setProductList(String[] productList) {
		this.productList = productList;
	}

	public Integer getUserProcuctId() {
		return userProcuctId;
	}

	public void setUserProcuctId(Integer userProcuctId) {
		this.userProcuctId = userProcuctId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
