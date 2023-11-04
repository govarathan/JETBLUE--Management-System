package com.jetblue_app2.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetblue_app2.entity.Bill;
import com.jetblue_app2.entity.Passenger;
import com.jetblue_app2.respository.BillRepository;
import com.jetblue_app2.respository.PassengerRepository;;


@Service
public class BillServiceImpl implements BillService {

	    @Autowired
	    private BillRepository billRepo;
	    
	    @Override
	    public void saveBill(Bill bi) {
	    	billRepo.save(bi);
	    }
		@Override
		public List<Bill> listallBill(Bill bi) {
			List<Bill> bills = billRepo.findAll();
			return bills;
			
		}
		@Override
		public Bill showOneBill(long id) {
			Optional<Bill> findById = billRepo.findById(id);
			Bill bill = findById.get();
			return  bill;
		}
		
		public void updateOneB(Bill bi) {
		    billRepo.save(bi);
			
		}
		
	
		
		
		
		
//		@Override
//		public Bill showOnebill(long id) {
//			Optional<Bill> findById = billRepo.findById(id);
//			Bill bill = findById.get();
//			return bill;
//		}
//		@Override
//		public void updateOneB(Bill bi) {
//			billRepo.save(bi);
//			
//		}
}
//@Autowired
//private EmployeeRepository  employeeRepo;
//
//@Override
//public void saveEmployee(Employee emp) {
//	employeeRepo.save(emp);
//}
//@Override
//public List<Employee> listallEmp(Employee emp){
//	List<Employee> employees = employeeRepo.findAll();
//	return employees;
//	
//}
//@Override
//public Employee updateOneEmp(long id) {
//	Optional<Employee> findById = employeeRepo.findById(id);
//	Employee employee = findById.get();
//	return employee;
//}