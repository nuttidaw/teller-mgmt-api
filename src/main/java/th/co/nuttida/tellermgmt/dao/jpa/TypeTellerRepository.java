package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.controller.TypeTeller;

@Repository
public interface TypeTellerRepository extends JpaRepository<TypeTeller, Integer>, JpaSpecificationExecutor<TypeTeller> {

	@Override
	List<TypeTeller> findAll();

	@Query("SELECT r FROM type_teller r WHERE r.type_teller_id = :type_teller_id")
	TypeTeller findOneById(@Param("type_teller_id") String id);

}
