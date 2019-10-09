package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.controller.TypeAddress;

@Repository
public interface TypeAddressRepository
		extends JpaRepository<TypeAddress, Integer>, JpaSpecificationExecutor<TypeAddress> {

	@Override
	List<TypeAddress> findAll();

	@Query("SELECT r FROM type_address r WHERE r.type_address_id = :type_address_id")
	TypeAddress findOneById(@Param("type_address_id") String id);
}
