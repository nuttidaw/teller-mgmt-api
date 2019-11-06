package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.Teller;

@Repository
public interface TellerRepository extends JpaRepository<Teller, Long> {

//	@Query("SELECT * FROM teller")
	List<Teller> findAll();

	@Query(value = "FROM teller u WHERE u.teller_id = :teller_id", nativeQuery = true)
	Teller findById(@Param("teller_id") int tellerId);
	
	@Query(value = "FROM teller u WHERE u.teller_no = :teller_no", nativeQuery = true)
	Teller findTellerNo(@Param("teller_no") String tellerNo);
}
