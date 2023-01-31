package com.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.entity.Address;
import com.address.service.impl.AddressServiceImpl;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
	
	@Autowired
	private AddressServiceImpl addressimpl;
	
	@PostMapping(value = "/add")
	public Address saveAddress(@RequestBody Address address) {
		 Address addresssave = this.addressimpl.addAddress(address);
		return addresssave;
	}
	
	@GetMapping(value = "/getbyid/{id}")
	public Address getAddressById(@PathVariable("id") int id) {
		
		Address addressbyid = this.getAddressById(id);
		return addressbyid;
	}
	
	@GetMapping(value = "/getall")
	public List<Address> getAllAddress(){
		List<Address> addresslist = this.addressimpl.getAllAddress();
		return addresslist;
	}
	
	@PutMapping(value = "update/{id}")
	public Address updateAddress(@PathVariable("id") int id, @RequestBody Address address) {
		Address updateaddress = this.updateAddress(id, address);
		return updateaddress;
	}
	
	@DeleteMapping(value = "delete/{id}")
	public String deleteAddress(@PathVariable("id") int id) {
		this.addressimpl.deleteAddress(id);
		return "Address Deeleted in Controller";
	}
	

}
