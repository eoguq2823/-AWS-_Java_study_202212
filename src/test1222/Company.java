package test1222;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
@AllArgsConstructor
public class Company {
	
	private int companyId;
	private String companyName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	
	public static CompanyBuilder builder() {
		return new CompanyBuilder();
	}
	

}