package com.morningstar.market.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.morningstar.market.entity.Mrf;
import com.morningstar.market.entity.Pnb;
import com.morningstar.market.entity.Tamo;
import com.morningstar.market.entity.YesBank;
import com.morningstar.market.repo.MrfRepo;
import com.morningstar.market.repo.PnbRepo;
import com.morningstar.market.repo.TamoRepo;
import com.morningstar.market.repo.YesBankRepo;

@RestController
public class UsefullApi {
	@Autowired
	MrfRepo mrfRepo;
	
	@Autowired
	PnbRepo pnbRepo;
	
	@Autowired
	TamoRepo tamoRepo;
	
	@Autowired
	YesBankRepo yesBankRepo;
	
	@GetMapping("/getPriceOnDate")
	public Double postMrf(@RequestHeader String symbol, @RequestHeader String date1) {
				
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		  LocalDate date = LocalDate.parse(date1, formatter);
	
		if (symbol.equals("pnb")) {
			Pnb stck = pnbRepo.findByDate(date);
			double price = stck.getClose();
			return price;

		}
		else if (symbol.equals("yesbank")) {
			YesBank stck = yesBankRepo.findByDate(date);
			double price = stck.getClose();
			return price;

		}
		else if (symbol.equals("tatamotors")) {
			Tamo stck = tamoRepo.findByDate(date);
			double price = stck.getClose();
			return price;

		}
		else if (symbol.equals("mrf")) {
			Mrf stck = mrfRepo.findByDate(date);
			double price = stck.getClose();
			return price;
		}
		else {
			return null;
		}
	}
}
