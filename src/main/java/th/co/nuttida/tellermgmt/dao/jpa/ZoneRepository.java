package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.Zone;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Long> {

	// @Override
	// List<Zone> findAll();
	//
	// @Query("SELECT * FROM zone WHERE zone.zone_id = :zone_id")
	// Zone findById(@Param("zone_id") String id);

}
