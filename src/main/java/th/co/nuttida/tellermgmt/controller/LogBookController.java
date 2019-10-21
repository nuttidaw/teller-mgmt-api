package th.co.nuttida.tellermgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import th.co.nuttida.tellermgmt.domain.LogBook;
import th.co.nuttida.tellermgmt.service.LogBookService;

@RestController
@RequestMapping("/api/v1/tellermgmt/logbook")
@Api(value = "Teller Management System", description = "LogBook Controller")
public class LogBookController {

	@Autowired
	private LogBookService logBookService;

	@GetMapping
	@ApiOperation(value = "Get all logbook", notes = "")
	public ResponseEntity<List<LogBook>> getAllLogBook() {
		return new ResponseEntity<>(logBookService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get logbook by id", notes = "")
	public LogBook getLogBookById(
			@ApiParam(value = "A logbook id", required = true) 
			@PathVariable int id) {
		return logBookService.findLogBookById(id);
	}

	@GetMapping("/find-by-teller-id/{tellerid}")
	@ApiOperation(value = "Get user logbook by teller id", notes = "")
	public List<LogBook> getLogBookByTellerId(
			@ApiParam(value = "A teller ID", required = true) 
			@PathVariable String tellerId) {
		return logBookService.findLogBookByTellerId(tellerId);
	}
	
	@PostMapping
    @ApiOperation(value = "Add logbook", notes = "")
    public ResponseEntity<LogBook> addLogBook(
            @ApiParam(value = "A new logbook data", required = true)
            @RequestBody LogBook logBook) {
        return new ResponseEntity<>(logBookService.addLogBook(logBook), HttpStatus.OK);
    }
}
