package com.morningstar.lossaversion.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.morningstar.lossaversion.dto.ResponseDto;
import com.morningstar.lossaversion.dto.UserPortfolioDto;
import com.morningstar.lossaversion.entity.UserPortfolio;
import com.morningstar.lossaversion.service.IUserPortfolioService;
import com.morningstar.lossaversion.wrapper.UserPortfolioWrapper;

@RestController
public class UserPortfolioController {
	
	@Autowired
	IUserPortfolioService userPortfolioService;
	
	@PostMapping("/addPortfolio")
	public ResponseEntity<ResponseDto> post(@RequestBody UserPortfolioWrapper userPortfolioWrapper, @RequestHeader String token) {
		
		for(UserPortfolioDto ud : userPortfolioWrapper.getUserPortfolioDtos()) {
			System.out.println(ud.toString());
			userPortfolioService.addingUserPortfolio(ud, token);
		}
		
		ResponseDto responseDto = new ResponseDto("Added succesfully"," ");
		return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
	}
	

	@GetMapping("/showUserPortfolio/{token}")
	public List<UserPortfolio> giveUser(@RequestHeader String token) {
		List<UserPortfolio> userPortfolio = userPortfolioService.showingUserPortfolio(token);
		return userPortfolio;
	}
}
