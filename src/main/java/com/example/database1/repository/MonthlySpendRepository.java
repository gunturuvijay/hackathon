package com.example.database1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.database1.entity.MonthlySpendEntity;
import com.example.database1.model.MonthlySpendModel;

public interface MonthlySpendRepository extends JpaRepository<MonthlySpendEntity, String>  {
	
	@Query(value = " select new com.example.database1.model.MonthlySpendModel(MS.month,sum(MS.totalincoming),sum(MS.totaloutgoing)) from MonthlySpendEntity MS  group by MS.month")
     List<MonthlySpendModel> getMonthlySpendGroup();
}
