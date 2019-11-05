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
import th.co.nuttida.tellermgmt.domain.TypeAddress;
import th.co.nuttida.tellermgmt.service.TypeAddressService;

@RestController
@RequestMapping("/api/v1/tellermgmt/typeaddress")
@Api(value = "Teller Management System", description = "Type Address Controller")
public class TypeAddressController {

	@Autowired
	private TypeAddressService typeAddressService;

	@GetMapping
	@ApiOperation(value = "Get all type address", notes = "")
	public ResponseEntity<List<TypeAddress>> getAllTypeAddress() {
		return new ResponseEntity<>(typeAddressService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get type address by id", notes = "")
	public TypeAddress getTypeAddressById(
			@ApiParam(value = "A type address id", required = true) @PathVariable int id) {
		return typeAddressService.findTypeAddressById(id);
	}
}
