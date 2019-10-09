package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.controller.BrandTeller;

@Repository
public interface BrandTellerRepository
		extends JpaRepository<BrandTeller, Integer>, JpaSpecificationExecutor<BrandTeller> {

	@Override
	List<BrandTeller> findAll();
}
