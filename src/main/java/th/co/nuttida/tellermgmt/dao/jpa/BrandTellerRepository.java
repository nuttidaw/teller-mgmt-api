package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.BrandTeller;

@Repository
public interface BrandTellerRepository
		extends JpaRepository<BrandTeller, Long> {

	@Override
	List<BrandTeller> findAll();
	
	@Query(value = "SELECT * FROM branch_teller WHERE branch_teller.brand_teller_id = :id", nativeQuery = true)
    BrandTeller findById(@Param("id") int id);
}
