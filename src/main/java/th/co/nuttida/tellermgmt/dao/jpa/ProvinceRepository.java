package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {

//	@Query("SELECT * FROM province")
	List<Province> findAll();

	@Query(value = "FROM province u WHERE u.province_id = :province_id", nativeQuery = true)
	Province findById(@Param("province_id") int provinceId);
}
