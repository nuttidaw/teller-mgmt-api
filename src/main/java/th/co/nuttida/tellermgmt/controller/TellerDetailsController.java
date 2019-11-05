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
import th.co.nuttida.tellermgmt.domain.TellerDetails;
import th.co.nuttida.tellermgmt.service.TellerDetailsService;

@RestController
@RequestMapping("/api/v1/tellermgmt/tellerdetails")
@Api(value = "Teller Management System", description = "Teller Details Controller")
public class TellerDetailsController {

	@Autowired
	private TellerDetailsService tellerDetailsService;

	@GetMapping
	@ApiOperation(value = "Get all teller details", notes = "")
	public ResponseEntity<List<TellerDetails>> getAllTellerDetails() {
		return new ResponseEntity<>(tellerDetailsService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get teller details by id", notes = "")
	public TellerDetails getTellerDetailsById(
			@ApiParam(value = "A teller details id", required = true) @PathVariable int id) {
		return tellerDetailsService.findTellerDetailsById(id);
	}

}
