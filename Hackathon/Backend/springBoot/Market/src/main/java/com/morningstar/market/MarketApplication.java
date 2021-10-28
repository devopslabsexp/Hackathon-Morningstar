package com.morningstar.market;

import java.math.BigDecimal;
import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.Interval;

@SpringBootApplication
public class MarketApplication {

	public static void main(String[] args) throws Exception{
		
		name();
		SpringApplication.run(MarketApplication.class, args);
	}
	
	public static void name() throws Exception {
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		from.add(Calendar.MONTH, -1); // from 5 years ago
		

		Stock google = YahooFinance.get("MRF.NS", from, to, Interval.DAILY);
		
		System.out.println("/////////////");
		System.out.println(google.getQuote().getChangeInPercent());
		System.out.println(google.getQuote());
	}
	
	public static void name2() throws Exception {
		Stock stock = YahooFinance.get("MRF.NS");

		BigDecimal price = stock.getQuote().getPrice();
		BigDecimal change = stock.getQuote().getChangeInPercent();
		BigDecimal peg = stock.getStats().getPeg();
		BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

		stock.print();
		System.out.println("Nikhilllllll"+price + " " +change + " " + peg + " " +dividend);
		
	}

}
