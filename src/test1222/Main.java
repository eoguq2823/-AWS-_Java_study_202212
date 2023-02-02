package test1222;

public class Main {
	public static void main(String[] args) {
		Company.CompanyBuilder com = new Company.CompanyBuilder();
		
		Company com1 = Company.builder()
				.companyId(100)
				.companyName("Apple")
				.address("Apple Computer Inc. 1 infinite Loop")
				.city("Cupertino")
				.state("CA")
				.zipCode("95014")
				.build();
		System.out.println(com1);
				
	}
}
