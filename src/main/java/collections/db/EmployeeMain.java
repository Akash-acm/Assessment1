package collections.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmployeeMain {
	
	public EmployeeMain() {
		
	}
	public String findEmployee(int empId) {
		try {
		if(EmpDb.db.containsKey(empId)) {
			return EmpDb.db.get(empId).getDetails();
		}else {
				throw new EmpNotFoundException("Emp not found");
			}
		}
		catch(EmpNotFoundException e) {
			System.out.println("Emp Not Found Exception..");
		}finally {}
		return "Emp Not Found";
	}
	public String addEmployee(Emp em) {
		try {
		if(EmpDb.db.containsKey(em.getEmpId())) {
			throw new EmpExistsException("Employee already exists...");
		} else {
			EmpDb.db.put(em.getEmpId(), em);
			return "Employee Added successfully...";
		}
		}
	catch(EmpExistsException e) {
		System.out.println("Emp already exits");
	}finally {}
	return "Emp exits";

}
		public List<String>listEmployeeByCity(String city){
			List<String> employees=new ArrayList<String>();
			Set<Integer> keys=EmpDb.db.keySet();
			for(Integer key : keys) {
				Emp em=EmpDb.db.get(key);
				if(em.getCity().equals(city))
					employees.add(em.getDetails());
			}
			return employees;
		}
}
