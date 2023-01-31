package com.address.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.address.entity.Address;
import com.address.repo.AddressRepo;
import com.address.service.AddressService;

@Component
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressRepo addressrepo;

	@Override
	public Address addAddress(Address address) {
		// TODO Auto-generated method stub
		Address addaddress = this.addressrepo.save(address);
		
		return addaddress;
	}

	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		List<Address> addresslist = this.addressrepo.findAll();
		return addresslist;
	}

	@Override
	public Address getAddressById(int id) {
		// TODO Auto-generated method stub
		Address addressbyid = this.addressrepo.findById(id).get();
		return addressbyid;
	}

	@Override
	public Address updateAddress(int id, Address address) {
		// TODO Auto-generated method stub
		Address updateaddress =  this.addressrepo.findById(id).get();
		
		updateaddress.setHno(address.getHno());
		updateaddress.setStreet(address.getStreet());
		updateaddress.setCity(address.getCity());
		updateaddress.setState(address.getState());
		updateaddress.setPincode(address.getPincode());
		
		this.addressrepo.save(updateaddress);
		return updateaddress;
	}

	@Override
	public String deleteAddress(int id) {
		// TODO Auto-generated method stub
		this.addressrepo.deleteById(id);
		
		return "Address deleted in Service Implimentation";
	}

}
