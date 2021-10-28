package com.morningstar.lossaversion.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPortfolioDto {
	
	private String symbol;
	private Integer symbolQuantity;
	private double purchaseAmountForSingleStock;
	private LocalDate purchaseDate;
	private double stopLoss;
	
}
