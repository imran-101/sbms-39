package com.userimran.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.userimran.entity.CityEntity;

public interface CityRepo extends JpaRepository<CityEntity, Integer>{

	@Query(value="select * from city_master where state_id=:sid", nativeQuery=true)
	public List<CityEntity> getCities(Integer sid);
}
