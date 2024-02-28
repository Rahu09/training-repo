package com.hexa.auth.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.hexa.auth.entity.Product;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDto {

	private Long id;
	@NotEmpty
	private String stockKeepingUnit;
	@NotEmpty
	@Size(max = 20, min = 3, message = "Invalid name. Size should be between 3 to 20.")
	private String name;
	@Size(max = 20, min = 3, message = "Invalid description. Size should be between 3 to 20.")
	private String description;
	@NotNull
	private BigDecimal price;
	private boolean active;
	@NotEmpty
	private String imageURL;
	@FutureOrPresent
	private LocalDateTime dateCreated;
	@FutureOrPresent
	private LocalDateTime dateUpdated;
	
	
	public ProductDto(Long id, String stockKeepingUnit, String name, String description, BigDecimal price, boolean active,
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
	public ProductDto(Product o) {
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
	@Override
	public String toString() {
		return "Product [id=" + id + ", stockKeepingUnit=" + stockKeepingUnit + ", name=" + name + ", description="
				+ description + ", price=" + price + ", active=" + active + ", imageURL=" + imageURL + ", dateCreated="
				+ dateCreated + ", dateUpdated=" + dateUpdated + "]";
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getPrice() {
		return price;
	}

	public ProductDto() {
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
