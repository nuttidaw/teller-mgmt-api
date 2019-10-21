package th.co.nuttida.tellermgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import th.co.nuttida.tellermgmt.domain.User;
import th.co.nuttida.tellermgmt.service.UserService;

@RestController
@RequestMapping("/api/v1/tellermgmt/user")
@Api(value = "Teller Management System", description = "User Controller")
public class UserController {
	@Autowired
    private UserService userService;
	
	@GetMapping
    @ApiOperation(value = "Get all user", notes = "")
    public ResponseEntity<List<User>> getAllUser() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
	
	@GetMapping("/{id}")
    @ApiOperation(value = "Get user by id", notes = "")
    public User getUserById(
            @ApiParam(value = "A user id", required = true)
            @PathVariable int id) {
        return userService.findUserById(id);
    }
	
	@GetMapping("/find-by-username/{username}")
    @ApiOperation(value = "Get user data by username", notes = "")
    public User getUserByUsername(
            @ApiParam(value = "A username", required = true)
            @PathVariable String username) {
        return userService.findUserByUsername(username);
    }
	
	@PostMapping
    @ApiOperation(value = "Add user", notes = "")
    public ResponseEntity<User> addUser(
            @ApiParam(value = "A new user data", required = true)
            @RequestBody User user) {
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }
	
	@PutMapping("/edit/{id}")
    @ApiOperation(value = "Update user by id", notes = "")
    public ResponseEntity<User> updateUser(
            @ApiParam(value = "A user id", required = true)
            @PathVariable int id,
            @ApiParam(value = "A user data", required = true)
            @RequestBody User userUpdates) {
        return new ResponseEntity<>(userService.updateUser(id, userUpdates), HttpStatus.OK);
    }
	
	@GetMapping("/delete-user/{id}/{userDelete}")
    @ApiOperation(value = "Delete user by id", notes = "")
    public ResponseEntity<User> deleteUser(
            @ApiParam(value = "A user id", required = true)
            @PathVariable int id) {
        return new ResponseEntity<>(userService.deleteUser(id), HttpStatus.OK);
    }
}
