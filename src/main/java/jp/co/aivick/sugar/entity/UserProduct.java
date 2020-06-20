package jp.co.aivick.sugar.entity;

import java.sql.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "user_product")
public class UserProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_product_id")
	private Integer userProductId;
	
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "date")
	private Date date;
	
	public Integer getUserProductId() {
		return userProductId;
	}

	public void setUserProductId(Integer userProductId) {
		this.userProductId = userProductId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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
