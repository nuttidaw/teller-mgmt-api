package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.Zone;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Long> {

//	@Query("SELECT * FROM zone")
	List<Zone> findAll();

	@Query(value = "FROM zone u WHERE u.zone_id = :zone_id", nativeQuery = true)
	Zone findById(@Param("zone_id") int zoneId);

}
