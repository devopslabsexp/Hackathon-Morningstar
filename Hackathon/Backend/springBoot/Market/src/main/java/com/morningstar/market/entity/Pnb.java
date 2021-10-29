package com.morningstar.market.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pnb {
	@Id
	private int id;
	private LocalDate date;
	private double open;
	private double high;
	private double low;
	private double close;
	private double adjClose;
	private Long volume;
}
