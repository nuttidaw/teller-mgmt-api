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
import th.co.nuttida.tellermgmt.domain.TypeTeller;
import th.co.nuttida.tellermgmt.service.TypeTellerService;

@RestController
@RequestMapping("/api/v1/tellermgmt/typeteller")
@Api(value = "Teller Management System", description = "Type Teller Controller")
public class TypeTellerController {

	@Autowired
	private TypeTellerService typeTellerService;

	@GetMapping
	@ApiOperation(value = "Get all type teller", notes = "")
	public ResponseEntity<List<TypeTeller>> getAllTypeTeller() {
		return new ResponseEntity<>(typeTellerService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get type teller by id", notes = "")
	public TypeTeller getTypeTellerById(@ApiParam(value = "A type teller id", required = true) @PathVariable int id) {
		return typeTellerService.findTypeTellerById(id);
	}
}
