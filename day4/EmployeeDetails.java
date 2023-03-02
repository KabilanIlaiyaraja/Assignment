package week2.day4;

public class EmployeeDetails {
	
	public void printEmpName(String empName,int empId) {
		System.out.println("EmployeeName-"+empName);
		System.out.println("EmpId-"+empId);
	}
	public void getEmpAddress(String empAddress) {
		System.out.println("Emp Address-"+empAddress);
	}

	public void printEmpSalary(double empSalary) {
		System.out.println("Emp Salary-"+empSalary);
	}
	public void empMobileNumber(long mobNum) {
		System.out.println("Emp Mobile Number-"+mobNum);
	}
	
	public static void main(String[] args) {
		EmployeeDetails empDetail=new EmployeeDetails(); 
		empDetail.printEmpName("Kabilan", 202318);
		empDetail.getEmpAddress("Madurai");
		empDetail.empMobileNumber(8515624562l);
		empDetail.printEmpSalary(19999.99);
		
		
	}
	
}
