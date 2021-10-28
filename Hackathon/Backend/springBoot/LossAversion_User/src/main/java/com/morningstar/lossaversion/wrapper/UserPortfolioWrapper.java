package com.morningstar.lossaversion.wrapper;

import java.util.List;

import com.morningstar.lossaversion.dto.UserPortfolioDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPortfolioWrapper {
	private List<UserPortfolioDto> userPortfolioDtos;
}
