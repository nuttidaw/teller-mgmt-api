package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.BrandTeller;

@Repository
public interface BrandTellerRepository
		extends JpaRepository<BrandTeller, Long> {

//	@Query(value = "SELECT * FROM branch_teller", nativeQuery = true)
	List<BrandTeller> findAll();
	
	@Query(value = "FROM branch_teller u WHERE u.brand_teller_id = :brand_teller_id", nativeQuery = true)
    BrandTeller findById(@Param("brand_teller_id") int brandTellerId);
}
