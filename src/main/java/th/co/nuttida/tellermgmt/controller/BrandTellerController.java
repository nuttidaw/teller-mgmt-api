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
import th.co.nuttida.tellermgmt.domain.BrandTeller;
import th.co.nuttida.tellermgmt.service.BrandTellerService;

@RestController
@RequestMapping("/api/v1/tellermgmt/brandteller")
@Api(value = "Teller Management System", description = "Brand Teller Controller")
public class BrandTellerController {

	@Autowired
	private BrandTellerService brandTellerService;

	@GetMapping
	@ApiOperation(value = "Get all brand teller", notes = "")
	public ResponseEntity<List<BrandTeller>> getAllBrandTeller() {
		return new ResponseEntity<>(brandTellerService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get brand teller by id", notes = "")
	public BrandTeller getBrandTellerById(
			@ApiParam(value = "A brand teller id", required = true) @PathVariable int id) {
		return brandTellerService.findBrandTellerById(id);
	}

}
