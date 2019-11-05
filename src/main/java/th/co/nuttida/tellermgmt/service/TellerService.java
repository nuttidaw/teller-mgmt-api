package th.co.nuttida.tellermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.nuttida.tellermgmt.dao.jpa.TellerRepository;
import th.co.nuttida.tellermgmt.domain.Teller;

@Service
@Transactional
public class TellerService {
	
	@Autowired
	private TellerRepository tellerRepository;
	
	public List<Teller> findAll() {
		return tellerRepository.findAll();
	}

	public Teller findTellerById(int id) {
		Teller found = tellerRepository.findById(id);
		return found;
	}

}
