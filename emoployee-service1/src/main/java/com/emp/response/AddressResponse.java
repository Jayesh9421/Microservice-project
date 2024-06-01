package com.emp.response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressResponse {

	private int id;
	private String lane1;
	private String lane2;
	private long zip;
	private String state;
	
}
