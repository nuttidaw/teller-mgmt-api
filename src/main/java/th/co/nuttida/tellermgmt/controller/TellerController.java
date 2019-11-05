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
import th.co.nuttida.tellermgmt.domain.Teller;
import th.co.nuttida.tellermgmt.service.TellerService;

@RestController
@RequestMapping("/api/v1/tellermgmt/teller")
@Api(value = "Teller Management System", description = "Teller Controller")
public class TellerController {

	@Autowired
	private TellerService tellerService;

	@GetMapping
	@ApiOperation(value = "Get all teller", notes = "")
	public ResponseEntity<List<Teller>> getAllTeller() {
		return new ResponseEntity<>(tellerService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get teller by id", notes = "")
	public Teller getTellerTellerById(@ApiParam(value = "A teller details id", required = true) @PathVariable int id) {
		return tellerService.findTellerById(id);
	}
}
