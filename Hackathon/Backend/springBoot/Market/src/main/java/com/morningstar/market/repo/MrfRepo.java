package com.morningstar.market.repo;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.morningstar.market.entity.Mrf;

@Repository
public interface MrfRepo extends JpaRepository<Mrf, Integer> {
	Mrf findByDate(LocalDate date);
}