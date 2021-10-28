package com.morningstar.lossaversion.service;

import java.util.List;

import com.morningstar.lossaversion.dto.UserPortfolioDto;
import com.morningstar.lossaversion.entity.UserPortfolio;

public interface IUserPortfolioService {
	public void addingUserPortfolio(UserPortfolioDto userPortfolioDto, String token);
	public List<UserPortfolio> showingUserPortfolio(String token);
	}
