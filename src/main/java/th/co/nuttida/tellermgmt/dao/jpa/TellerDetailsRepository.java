package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.TellerDetails;

@Repository
public interface TellerDetailsRepository
		extends JpaRepository<TellerDetails, Long> {

//	@Query("SELECT * FROM teller_details")
	List<TellerDetails> findAll();

	@Query(value = "FROM teller_details u WHERE u.teller_details_id = :teller_details_id", nativeQuery = true)
	TellerDetails findById(@Param("teller_details_id") int tellerDetailsId);
}
