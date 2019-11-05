package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.TypeAddress;

@Repository
public interface TypeAddressRepository extends JpaRepository<TypeAddress, Long> {

	@Query("SELECT * FROM type_address")
	List<TypeAddress> findAll();

	@Query("SELECT * FROM type_address WHERE type_address.type_address_id = :type_address_id")
	TypeAddress findById(@Param("type_address_id") int id);
}
