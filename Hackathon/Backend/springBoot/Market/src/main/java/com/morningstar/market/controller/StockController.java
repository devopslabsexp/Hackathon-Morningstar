package com.morningstar.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.morningstar.market.dto.ResponseDto;
import com.morningstar.market.service.MrfInDB;
import com.morningstar.market.service.PnbInDB;
import com.morningstar.market.service.TamoInDB;
import com.morningstar.market.service.YeshBankInDB;

@RestController
public class StockController {
	@Autowired
	MrfInDB mrfInDB;
	
	@Autowired
	PnbInDB pnbInDB;
	
	@Autowired
	TamoInDB tamoInDB;
	
	@Autowired
	YeshBankInDB yeshBankInDB;

	@PostMapping("/addMrf")
	public ResponseEntity<ResponseDto> postMrf() {
		String filePathName = "C:\\Nikhil\\backup\\Backend\\addons\\csv\\MRFNS.csv";
		mrfInDB.csvToModel(filePathName);
		ResponseDto responseDto = new ResponseDto("Added succesfully"," ");
		return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
	}
	
	@PostMapping("/addPnb")
	public ResponseEntity<ResponseDto> postPnb() {
		String filePathName = "C:\\Nikhil\\backup\\Backend\\addons\\csv\\PNBNS.csv";
		pnbInDB.csvToModel(filePathName);
		ResponseDto responseDto = new ResponseDto("Added succesfully"," ");
		return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
	}
	
	@PostMapping("/addTamo")
	public ResponseEntity<ResponseDto> postTamo() {
		String filePathName = "C:\\Nikhil\\backup\\Backend\\addons\\csv\\TATAMOTORSNS.csv";
		tamoInDB.csvToModel(filePathName);
		ResponseDto responseDto = new ResponseDto("Added succesfully"," ");
		return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
	}
	
	@PostMapping("/addYesBank")
	public ResponseEntity<ResponseDto> postYesBank() {
		String filePathName = "C:\\Nikhil\\backup\\Backend\\addons\\csv\\YESBANKNS.csv";
		yeshBankInDB.csvToModel(filePathName);
		ResponseDto responseDto = new ResponseDto("Added succesfully"," ");
		return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
	}
	
	
}
