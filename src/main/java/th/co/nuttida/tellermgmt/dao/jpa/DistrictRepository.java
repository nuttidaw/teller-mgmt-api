package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

//	@Override
//	List<District> findAll();
//	
//	@Query("SELECT * FROM district WHERE district.district_id = :district_id")
//	District findById(@Param("district_id") String id);

}
