package th.co.nuttida.tellermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.nuttida.tellermgmt.dao.jpa.DistrictRepository;
import th.co.nuttida.tellermgmt.domain.District;

@Service
@Transactional
public class DistrictService {

	@Autowired
	private DistrictRepository districtRepository;

	public List<District> findAll() {
		return districtRepository.findAll();
	}

	public District findDistrictById(int id) {
		District found = districtRepository.findById(id);
		return found;
	}
}
