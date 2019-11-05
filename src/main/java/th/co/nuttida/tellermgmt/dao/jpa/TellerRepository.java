package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.Teller;

@Repository
public interface TellerRepository extends JpaRepository<Teller, Long> {

	@Query("SELECT * FROM teller")
	List<Teller> findAll();

	@Query("SELECT * FROM teller WHERE teller.teller_id = :teller_id")
	Teller findById(@Param("teller_id") int id);
}
