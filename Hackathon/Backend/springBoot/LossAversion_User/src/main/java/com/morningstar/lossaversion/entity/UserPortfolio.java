package com.morningstar.lossaversion.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPortfolio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int portfolioId;
	@Column(nullable = false,unique = false)
	private String symbol;
	@Column(nullable = false,unique = false)
	private Integer symbolQuantity;
	@Column(nullable = false,unique = false)
	private double purchaseAmountForSingleStock;
	@Column(nullable = false,unique = false)
	private LocalDate purchaseDate;
	@Column(columnDefinition="double default 10.00")
	private double stopLoss;
	
}
