package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.TypeAddress;

@Repository
public interface TypeAddressRepository extends JpaRepository<TypeAddress, Long> {

//	@Query("SELECT * FROM type_address")
	List<TypeAddress> findAll();

	@Query(value = "FROM type_address u WHERE u.type_address_id = :type_address_id", nativeQuery = true)
	TypeAddress findById(@Param("type_address_id") int typeAddressId);
}
