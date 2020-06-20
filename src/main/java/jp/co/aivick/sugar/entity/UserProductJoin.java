package jp.co.aivick.sugar.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

@Entity
@Table(name = "user_product")
public class UserProductJoin extends UserProduct{
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "sugar")
	private Double sugar;
	
	@Column(name = "totalsugar")
	private Double totalSugar;
	

	public Double getTotalSugar() {
		return totalSugar;
	}

	public void setTotalSugar(Double totalSugar) {
		this.totalSugar = totalSugar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSugar() {
		return sugar;
	}

	public void setSugar(Double sugar) {
		this.sugar = sugar;
	}

}
