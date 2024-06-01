package com.address.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.address.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

	@Query(nativeQuery = "")
	findAdressByEmployeeId(@Param("employee") int employeeId);
	
}
