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
import th.co.nuttida.tellermgmt.domain.Zone;
import th.co.nuttida.tellermgmt.service.ZoneService;

@RestController
@RequestMapping("/api/v1/tellermgmt/zone")
@Api(value = "Teller Management System", description = "Zone Controller")
public class ZoneController {
	
	@Autowired
	private ZoneService zoneService;
	
	@GetMapping
	@ApiOperation(value = "Get all zone", notes = "")
	public ResponseEntity<List<Zone>> getAllZone() {
		return new ResponseEntity<>(zoneService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get zone by id", notes = "")
	public Zone getZoneById(@ApiParam(value = "A zone id", required = true) @PathVariable int id) {
		return zoneService.findZoneById(id);
	}
}
