package com.address.service;

import java.util.List;



import com.address.entity.Address;


public interface AddressService {
	
	public Address addAddress(Address address);
	
	public List<Address> getAllAddress();
	
	public Address getAddressById(int id);
	
	public Address updateAddress(int id, Address address);
	
	public String deleteAddress(int id);

}
