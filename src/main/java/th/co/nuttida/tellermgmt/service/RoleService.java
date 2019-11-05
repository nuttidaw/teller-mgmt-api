package th.co.nuttida.tellermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.nuttida.tellermgmt.dao.jpa.RoleRepository;
import th.co.nuttida.tellermgmt.domain.Role;

@Service
@Transactional
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	public Role findRoleById(int id) {
		Role found = roleRepository.findById(id);
		return found;
	}
}
