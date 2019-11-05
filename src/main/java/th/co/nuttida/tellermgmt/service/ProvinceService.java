package th.co.nuttida.tellermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.nuttida.tellermgmt.dao.jpa.ProvinceRepository;
import th.co.nuttida.tellermgmt.domain.Province;

@Service
@Transactional
public class ProvinceService {

	@Autowired
	private ProvinceRepository provinceRepository;

	public List<Province> findAll() {
		return provinceRepository.findAll();
	}

	public Province findProvinceById(int id) {
		Province found = provinceRepository.findById(id);
		return found;
	}
}
