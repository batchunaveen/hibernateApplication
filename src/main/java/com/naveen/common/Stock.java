package com.naveen.common;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name="stock", catalog = "sys" , uniqueConstraints = {
		@UniqueConstraint(columnNames = "STOCK_NAME"),
		@UniqueConstraint(columnNames = "STOCK_CODE")
})

public class Stock implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer stockId;
	private String stockCode;
	private String stockName;
	
	public Stock(){
		
	}
	
	public Stock(String stockCode, String stockName){
		this.stockCode = stockCode;
		this.stockName = stockName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "STOCK_ID" , unique = true, nullable = false)
	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	@Column(name = "STOCK_CODE", unique = true, nullable = false, length = 10)
	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}


	@Column(name = "STOCK_NAME", unique = true, nullable = false, length = 10)
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	
}
