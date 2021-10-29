package com.morningstar.market.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.morningstar.market.entity.Mrf;
import com.morningstar.market.entity.YesBank;

@Repository
public interface YesBankRepo extends JpaRepository<YesBank, Integer> {
}