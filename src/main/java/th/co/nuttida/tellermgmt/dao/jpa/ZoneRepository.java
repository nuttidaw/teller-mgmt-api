package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.controller.Zone;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer>, JpaSpecificationExecutor<Zone> {

	@Override
	List<Zone> findAll();

	@Query("SELECT r FROM zone r WHERE r.zone_id = :zone_id")
	Zone findOneById(@Param("zone_id") String id);

}
