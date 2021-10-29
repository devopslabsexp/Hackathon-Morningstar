package com.morningstar.lossaversion.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.morningstar.lossaversion.dto.UserPortfolioDto;
import com.morningstar.lossaversion.entity.User;
import com.morningstar.lossaversion.entity.UserPortfolio;
import com.morningstar.lossaversion.exception.LossAversionCutomException;
import com.morningstar.lossaversion.repository.UserPortfolioRepo;
import com.morningstar.lossaversion.repository.UserRepo;
import com.morningstar.lossaversion.utils.TokenService;

@Service
public class UserPortfolioService implements IUserPortfolioService {
	
	@Autowired
	UserRepo userRepository;
	
	@Autowired
	UserPortfolioRepo userPortfolioRepo;
	
	@Autowired
	TokenService tokenService;
	
	public void addingUserPortfolio(UserPortfolioDto userPortfolioDto, String token) {
		User user = userRepository.findById(tokenService.decodeToken(token)).orElseThrow( 
				() -> new LossAversionCutomException(HttpStatus.BAD_REQUEST, "User Not Found, for reseting password") );
		UserPortfolio userPortfolio = new UserPortfolio();
		BeanUtils.copyProperties(userPortfolioDto, userPortfolio);
		userPortfolioRepo.save(userPortfolio);
		user.getUserPortfolio().add(userPortfolio);
		System.out.println(user.getFname() + " " + user.getUserPortfolio());
		userRepository.save(user);
	}
	
	public List<UserPortfolio> showingUserPortfolio(String token) {
		User user = userRepository.findById(tokenService.decodeToken(token)).orElseThrow( 
				() -> new LossAversionCutomException(HttpStatus.BAD_REQUEST, "User Not Found, for reseting password") );
		
		return user.getUserPortfolio();
	}
	
}
