package th.co.nuttida.tellermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.nuttida.tellermgmt.dao.jpa.BrandTellerRepository;
import th.co.nuttida.tellermgmt.domain.BrandTeller;

@Service
@Transactional
public class BrandTellerService {

	@Autowired
	private BrandTellerRepository brandTellerRepository;

	public List<BrandTeller> findAll() {
		return brandTellerRepository.findAll();
	}

	public BrandTeller findBrandTellerById(int id) {
		BrandTeller found = brandTellerRepository.findById(id);
		return found;
	}

}
