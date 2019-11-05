package th.co.nuttida.tellermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.nuttida.tellermgmt.dao.jpa.TypeAddressRepository;
import th.co.nuttida.tellermgmt.domain.TypeAddress;

@Service
@Transactional
public class TypeAddressService {

	@Autowired
	private TypeAddressRepository typeAddressRepository;

	public List<TypeAddress> findAll() {
		return typeAddressRepository.findAll();
	}

	public TypeAddress findTypeAddressById(int id) {
		TypeAddress found = typeAddressRepository.findById(id);
		return found;
	}
}
