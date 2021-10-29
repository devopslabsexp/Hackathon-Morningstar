package com.morningstar.market.repo;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.morningstar.market.entity.Mrf;
import com.morningstar.market.entity.Pnb;

@Repository
public interface PnbRepo extends JpaRepository<Pnb, Integer> {
	Pnb findByDate(LocalDate date);
}