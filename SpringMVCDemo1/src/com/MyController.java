package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;
import com.deloitte.cms.service.CustomerService;
import com.deloitte.cms.service.CustomerServiceImpl;

@Controller
public class MyController {
	@Autowired
	CustomerService customerService;
@RequestMapping("/AddCustomer")
public ModelAndView addCustomer(Customer customer) {

	customerService.insertCustomer(customer);
	return new ModelAndView("success","cust",customer);
	
}
	@RequestMapping("/UpdateCustomer")
	public String mapper1() {
		return "UpdateCustomer";
	}
		@RequestMapping("/DeleteCustomer")
		public String mapper2() {
			return "DeleteCustomer";
		}
			@RequestMapping("/FindCustomer")
			public String mapper3() {
				return "FindCustomer";
			}
			@RequestMapping("/FindAllCustomer")
			public String mapper4() {
				return "FindAllCustomer";
			}
			@RequestMapping("/doSome")
			public ModelAndView mnv() {
			ModelAndView view=new ModelAndView();
			view.addObject("Message", "MY MESSAGE");
			view.setViewName("sayHello");
			return view;
			}
			
			@RequestMapping("/customersearchbyid")
			public ModelAndView searchCustomerByIdForm()
			{
				return new ModelAndView("customersearchbyid","sonu",new Customer());
			}
			
			@RequestMapping("/searchcustomerbyid")
			public ModelAndView searchCustomerById(Customer customer)
			{
				Customer customer2=new Customer();
				customer2=customerService.searchCustomerById(customer.getCustomerId());
		
				return new ModelAndView("customersearchbyid","sonu",customer2);
			}

			
			
				
}

