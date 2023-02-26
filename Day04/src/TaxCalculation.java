
public class TaxCalculation {
	
	public void CalculateTax(Person p1) {
		
		if(p1.getAge()>65 || p1.getGender().equalsIgnoreCase("female")) {
			
			p1.setTax(0);
			System.out.println("Tax is not applicable");
		}
		else {
			if(p1.getIncome()<=160000) {
				p1.setTax(0);
			}
			else if(p1.getIncome()>1600000 && p1.getIncome()<=500000) {
				p1.setTax((p1.getIncome()-160000)*10/100);
			}
			else if(p1.getIncome()>500000 && p1.getIncome()<+800000) {
				p1.setTax((p1.getIncome()-500000)*20/100);
			}
			else {
				p1.setTax((p1.getIncome()-800000)*30/100 +94000);
			}
		}
	}

}
