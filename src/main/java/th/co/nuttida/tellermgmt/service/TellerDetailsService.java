package th.co.nuttida.tellermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.nuttida.tellermgmt.dao.jpa.TellerDetailsRepository;
import th.co.nuttida.tellermgmt.domain.TellerDetails;

@Service
@Transactional
public class TellerDetailsService {

	@Autowired
	private TellerDetailsRepository tellerDetailsRepository;

	public List<TellerDetails> findAll() {
		return tellerDetailsRepository.findAll();
	}

	public TellerDetails findTellerDetailsById(int id) {
		TellerDetails found = tellerDetailsRepository.findById(id);
		return found;
	}
}
