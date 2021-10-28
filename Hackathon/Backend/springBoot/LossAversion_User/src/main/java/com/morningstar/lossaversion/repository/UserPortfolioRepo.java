package com.morningstar.lossaversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.morningstar.lossaversion.entity.UserPortfolio;

@Repository
public interface UserPortfolioRepo extends JpaRepository<UserPortfolio, Integer> {

}
