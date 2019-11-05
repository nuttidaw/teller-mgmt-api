package th.co.nuttida.tellermgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import th.co.nuttida.tellermgmt.domain.Role;
import th.co.nuttida.tellermgmt.service.RoleService;

@RestController
@RequestMapping("/api/v1/tellermgmt/role")
@Api(value = "Teller Management System", description = "Role Controller")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping
	@ApiOperation(value = "Get all role", notes = "")
	public ResponseEntity<List<Role>> getAllRole() {
		return new ResponseEntity<>(roleService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get role by id", notes = "")
	public Role getRoleById(@ApiParam(value = "A role id", required = true) @PathVariable int id) {
		return roleService.findRoleById(id);
	}

}
