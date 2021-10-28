package com.morningstar.market;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

@SpringBootApplication
public class MarketApplication {

	public static void main(String[] args) throws Exception{
		
		Stock stock = YahooFinance.get("TATAMOTORS.NS");

		BigDecimal price = stock.getQuote().getPrice();
		BigDecimal change = stock.getQuote().getChangeInPercent();
		BigDecimal peg = stock.getStats().getPeg();
		BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

		stock.print();

		
		SpringApplication.run(MarketApplication.class, args);
	}

}
