package th.co.nuttida.tellermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.nuttida.tellermgmt.dao.jpa.ZoneRepository;
import th.co.nuttida.tellermgmt.domain.Zone;

@Service
@Transactional
public class ZoneService {

	@Autowired
	private ZoneRepository zoneRepository;
	
	public List<Zone> findAll() {
		return zoneRepository.findAll();
	}

	public Zone findZoneById(int id) {
		Zone found = zoneRepository.findById(id);
		return found;
	}
}
