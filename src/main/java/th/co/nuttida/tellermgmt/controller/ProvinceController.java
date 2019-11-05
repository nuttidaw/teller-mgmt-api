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
import th.co.nuttida.tellermgmt.domain.Province;
import th.co.nuttida.tellermgmt.service.ProvinceService;

@RestController
@RequestMapping("/api/v1/tellermgmt/province")
@Api(value = "Teller Management System", description = "Province Controller")
public class ProvinceController {

	@Autowired
	private ProvinceService provinceService;

	@GetMapping
	@ApiOperation(value = "Get all province", notes = "")
	public ResponseEntity<List<Province>> getAllProvince() {
		return new ResponseEntity<>(provinceService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get province by id", notes = "")
	public Province getProvinceById(@ApiParam(value = "A province id", required = true) @PathVariable int id) {
		return provinceService.findProvinceById(id);
	}

}
