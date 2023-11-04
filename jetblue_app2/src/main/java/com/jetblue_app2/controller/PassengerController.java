package com.jetblue_app2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jetblue_app2.entity.Bill;
import com.jetblue_app2.entity.Employee;
import com.jetblue_app2.entity.Passenger;
import com.jetblue_app2.services.BillService;
import com.jetblue_app2.services.EmployeeService;
import com.jetblue_app2.services.PassengerService;

@Controller
public class PassengerController {
	
	@RequestMapping("/")
	public String  home()
	{
		return"index";
	}
	@Autowired
	private PassengerService  passServ;
	@Autowired
	private EmployeeService employeeServ;
	
	@Autowired
	private BillService billServ;
	
	@RequestMapping("/newpass")
	 public String newpass(){
		return "newpass";
	}
	
	@RequestMapping("/savepass")
	public String savepass( Passenger pass) {
		passServ.savePassInfo(pass);
	 return "newpass";
	}
	
	//http://localhost:8080/listall
	@RequestMapping("/listall")
	public String listall(Passenger pass,Model model) {
		List<Passenger> passengers = passServ.listallData(pass);
		model.addAttribute("passengers", passengers);
		return "list_all";
	}
	
	//update
	@RequestMapping("/update")
	public String updatepass(@RequestParam("id") long id,Model model) {
	
		Passenger passenger = passServ.updateOnePass(id);
		model.addAttribute("passenger", passenger);
		return "update_pass";
	
	}
	
	//updatepass
	@RequestMapping("/updatepass")
	public String updatepass(Passenger pass, Model model) {
		passServ.updateOneData(pass);
        List<Passenger> passengers = passServ.listallData(pass);
		model.addAttribute("passengers", passengers);
		return "list_all";	
	}
	
	@RequestMapping("/deletepass")
	public String deletepass(@RequestParam("id") long id, Passenger pass,Model model) {
		passServ.deleteOnePass(id);
		 List<Passenger> passengers = passServ.listallData(pass);
			model.addAttribute("passengers", passengers);
			return "list_all";
		
	}
							
//	the is Employee 
	
	
	//http://localhost:8080//newemp
	@RequestMapping("/newemp")
	public String newemp() {
		return "newemp";
	} 
	@RequestMapping("/saveemp")
		public String saveemployee(Employee emp) {
		employeeServ.saveEmployee(emp);
		return"newemp";
			
		
	}
	
	
	
	//http://localhost:8080/listall
	@RequestMapping("/listallemp")
	public String listallemp(Employee emp,Model model) {
		List<Employee> employees = employeeServ.listallEmp(emp);
		model.addAttribute("employees", employees);
		return "list_allemp";
	}
	//updatee
	@RequestMapping("/updatee")
	public String updateemp(@RequestParam("id") long id,Model model) {
		Employee employee = employeeServ.updateOneEmp(id);
		model.addAttribute("employee", employee);
		return "update_emp";
	
	}
	
	//updateemp
	@RequestMapping("/updateemp")
	public String updateemp(Employee emp, Model model) {
		employeeServ.updateOneE(emp);
        List<Employee> employees = employeeServ.listallEmp(emp);
		model.addAttribute("employees", employees);
		return "list_allemp";

	}
		
		@RequestMapping("/deleteemp")
		public String deleteemp(@RequestParam("id") long id, Employee emp , Model model) {
			employeeServ.deleteOneEmp(id);
			 List<Employee> employees = employeeServ.listallEmp(emp);
				model.addAttribute("employees", employees);
				return "list_allemp";
			
		}
				
//	<------------------------------------Billing start-----------------------------------------------------?>
		
	
		//http://localhost:8080//newbill
		@RequestMapping("/newbill")
		public String newbil() {
			return "new_bill";
		}
		
		@RequestMapping("/savebill")
		public String savebill(Bill bi) {
			billServ.saveBill(bi);
			return"redi";
		}
		//http://localhost:8080/listall
		@RequestMapping("/listallbills")
		public String listallbill(Bill bi,Model model) {
			List<Bill> bills = billServ.listallBill(bi);
			model.addAttribute("bills", bills);
			return "listall_bills";
		}
		
		//http://localhost:8080/listall
		@RequestMapping("/updateB")
		public String showbill(@RequestParam("id") long id,Model model ,Bill bi) {
			Bill bill = billServ.showOneBill(id);
			model.addAttribute("bill", bill);
			return "show_bil";
		
		}
		@RequestMapping("/updatebill")
		public String showing(Bill bi,Model model) {
			
			billServ.updateOneB(bi);
			List<Bill> bills = billServ.listallBill(bi);
			model.addAttribute("bills", bills);
			return "listall_bills";
		

		}
		
	
}
	
		
		
		
		
		
		
		

//		<------------------------------------Billing end-----------------------------------------------------?>
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	


