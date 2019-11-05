package th.co.nuttida.tellermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.nuttida.tellermgmt.dao.jpa.TypeTellerRepository;
import th.co.nuttida.tellermgmt.domain.TypeTeller;

@Service
@Transactional
public class TypeTellerService {

	@Autowired
	private TypeTellerRepository typeTellerRepository;

	public List<TypeTeller> findAll() {
		return typeTellerRepository.findAll();
	}

	public TypeTeller findTypeTellerById(int id) {
		TypeTeller found = typeTellerRepository.findById(id);
		return found;
	}
}
