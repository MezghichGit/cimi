package com.sip.ams.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sip.ams.entities.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {
	
	    @Query("SELECT p FROM Provider p ORDER BY id DESC")
		List<Provider> findAllProvidersByIdAsc();
	
}
