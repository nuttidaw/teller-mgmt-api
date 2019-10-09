package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.controller.Teller;

@Repository
public interface TellerRepository extends JpaRepository<Teller, Integer>, JpaSpecificationExecutor<Teller> {

	@Override
	List<Teller> findAll();

	@Query("SELECT r FROM teller r WHERE r.teller_id = :teller_id")
	Teller findOneById(@Param("teller_id") String id);
}
