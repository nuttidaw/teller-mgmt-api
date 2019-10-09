package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.controller.TellerDetails;

@Repository
public interface TellerDetailsRepository
		extends JpaRepository<TellerDetails, Integer>, JpaSpecificationExecutor<TellerDetails> {

	@Override
	List<TellerDetails> findAll();

	@Query("SELECT r FROM teller_details r WHERE r.teller_details_id = :teller_details_id")
	TellerDetails findOneById(@Param("teller_details_id") String id);
}
