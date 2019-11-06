package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

//	@Query("SELECT * FROM district")
	List<District> findAll();

	@Query(value = "FROM district u WHERE u.district_id = :district_id", nativeQuery = true)
	District findById(@Param("district_id") int districtId);

}
