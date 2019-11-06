package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.TypeTeller;

@Repository
public interface TypeTellerRepository extends JpaRepository<TypeTeller, Long> {

//	@Query("SELECT * FROM type_teller")
	List<TypeTeller> findAll();

	@Query(value = "FROM type_teller u WHERE u.type_teller_id = :type_teller_id", nativeQuery = true)
	TypeTeller findById(@Param("type_teller_id") int typeTellerId);

}
