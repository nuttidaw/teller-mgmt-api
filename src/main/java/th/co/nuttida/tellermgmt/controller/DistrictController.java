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
import th.co.nuttida.tellermgmt.domain.District;
import th.co.nuttida.tellermgmt.service.DistrictService;

@RestController
@RequestMapping("/api/v1/tellermgmt/district")
@Api(value = "Teller Management System", description = "District Controller")
public class DistrictController {
	
	@Autowired
	private DistrictService districtService;

	@GetMapping
	@ApiOperation(value = "Get all district", notes = "")
	public ResponseEntity<List<District>> getAllDistrict() {
		return new ResponseEntity<>(districtService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get district by id", notes = "")
	public District getDistrictById(
			@ApiParam(value = "A district id", required = true) @PathVariable int id) {
		return districtService.findDistrictById(id);
	}

}
