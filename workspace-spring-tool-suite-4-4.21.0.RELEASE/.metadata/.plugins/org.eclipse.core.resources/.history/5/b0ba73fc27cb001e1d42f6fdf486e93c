package com.hexa.samplejpa.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.hexa.samplejpa.dto.ProductDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "product")
@Entity
public class Product {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	private String stockKeepingUnit;
	private String name;
	private String description;
	private BigDecimal price;
	private boolean active;
	private String imageURL;
	@CreationTimestamp
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	private LocalDateTime dateUpdated;
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", stockKeepingUnit=" + stockKeepingUnit + ", name=" + name + ", description="
				+ description + ", price=" + price + ", active=" + active + ", imageURL=" + imageURL + ", dateCreated="
				+ dateCreated + ", dateUpdated=" + dateUpdated + "]";
	}
	
	public Product(Long id, String stockKeepingUnit, String name, String description, BigDecimal price, boolean active,
			String imageURL, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
		super();
		this.id = id;
		this.stockKeepingUnit = stockKeepingUnit;
		this.name = name;
		this.description = description;
		this.price = price;
		this.active = active;
		this.imageURL = imageURL;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}
	public Product(ProductDto o) {
		super();
		this.id = o.getId();
		this.stockKeepingUnit = o.getStockKeepingUnit();
		this.name = o.getName();
		this.description = o.getDescription();
		this.price = o.getPrice();
		this.active = o.isActive();
		this.imageURL = o.getImageURL();
		this.dateCreated = o.getDateCreated();
		this.dateUpdated = o.getDateUpdated();
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getPrice() {
		return price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStockKeepingUnit() {
		return stockKeepingUnit;
	}
	public void setStockKeepingUnit(String stockKeepingUnit) {
		this.stockKeepingUnit = stockKeepingUnit;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDateTime getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(LocalDateTime dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
}
