package com.morningstar.market.service;

import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morningstar.market.entity.Mrf;
import com.morningstar.market.repo.MrfRepo;
import com.opencsv.CSVReader;

@Service
public class MrfInDB {
	
	@Autowired
	MrfRepo mrfRepo;
	
    ArrayList<Mrf> scd = new ArrayList<>();
	Mrf tempMrf;
	
	
	public void csvToModel(String file)
	{
		int id = 0;
	    try {
	        FileReader filereader = new FileReader(file);
	        CSVReader csvReader = new CSVReader(filereader);
	        String[] nextLine;
            nextLine = csvReader.readNext();

	        while ((nextLine = csvReader.readNext()) != null) {
	        	
	            Iterator<String> it = Arrays.stream(nextLine).iterator();
                String date = it.next();
                String open = it.next();
                String high = it.next();
                String low = it.next();
                String close = it.next();
                String adjClose = it.next();
                String volume = it.next();
                try{
                	if (open.equals("null") || high.equals("null") || low.equals("null") || close.equals("null") || adjClose.equals("null") || volume.equals("null") ) {
						
					}
                	else {
                		 tempMrf = new Mrf(++id,LocalDate.parse(date), 
                         		Double.parseDouble(open), Double.parseDouble(high), Double.parseDouble(low),
                         		Double.parseDouble(close),Double.parseDouble(adjClose),Long.parseLong(volume));
                         scd.add(tempMrf);
                         System.out.println(tempMrf.toString());
                         mrfRepo.save(tempMrf);
					}               
                }
                catch (Exception e){
                    e.printStackTrace();
                }            
	            System.out.println();
	        }
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
