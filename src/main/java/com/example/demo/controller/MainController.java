package com.example.demo.controller;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entity.OrderUser;
import com.example.demo.repo.OrderUserRepo;


@Controller
public class MainController {
	
		
	@Autowired
	OrderUserRepo repoUser;
	
		
	@GetMapping("/getAllOrders")
    public String showAllOrderUsers(Model model) {
        model.addAttribute("orderUsers", repoUser.findNotAccepted(false));
        return "orderUsers";
    }
	     
	
	@GetMapping("/order/{orderid}")
    public String updateOrderStatus(@PathVariable int orderid, Model model) {
        Optional<OrderUser> ord=repoUser.findById(orderid);
	    System.out.println("In the method update");
        OrderUser ordNew=new OrderUser();
        java.util.Date date=new java.util.Date();
        ordNew.setOrderid(orderid);
    	ordNew.setUsername(ord.get().getUsername());
    	ordNew.setUseraddress(ord.get().getUseraddress());
    	ordNew.setUseremail(ord.get().getUseremail());
        if(!ord.get().isOrder_received())
        {
        	      	
        	
        	ordNew.setOrder_received(true);
        	ordNew.setOrder_accepted(ord.get().isOrder_accepted());
        	ordNew.setOrder_outfordelivery(ord.get().isOrder_outfordelivery());
        	ordNew.setOrderdatetime(ord.get().getOrderdatetime());
        	ordNew.setOrder_delivered(ord.get().isOrder_delivered());
        	ordNew.setOrderdelivereddatetime(ord.get().getOrderdelivereddatetime());
        	
        }
        else if(ord.get().isOrder_received() && !ord.get().isOrder_accepted())
        {
        	
        	
        	ordNew.setOrder_received(ord.get().isOrder_received());
        	ordNew.setOrder_accepted(true);
        	ordNew.setOrder_outfordelivery(ord.get().isOrder_outfordelivery());
        	ordNew.setOrderdatetime(ord.get().getOrderdatetime());
        	ordNew.setOrder_delivered(ord.get().isOrder_delivered());
        	ordNew.setOrderdelivereddatetime(ord.get().getOrderdelivereddatetime());
        	
        }
        else if(ord.get().isOrder_received() && ord.get().isOrder_accepted() && !ord.get().isOrder_outfordelivery())
        {
        	
        	
        	ordNew.setOrder_received(ord.get().isOrder_received());
        	ordNew.setOrder_accepted(ord.get().isOrder_accepted());
        	ordNew.setOrder_outfordelivery(true);
        	ordNew.setOrderdatetime(ord.get().getOrderdatetime());
        	ordNew.setOrder_delivered(ord.get().isOrder_delivered());
        	ordNew.setOrderdelivereddatetime(ord.get().getOrderdelivereddatetime());
        	
        }
        
        else if(ord.get().isOrder_received() && ord.get().isOrder_accepted() && ord.get().isOrder_outfordelivery())
        {
        	
        	
        	ordNew.setOrder_received(ord.get().isOrder_received());
        	ordNew.setOrder_accepted(ord.get().isOrder_accepted());
        	ordNew.setOrder_outfordelivery(ord.get().isOrder_outfordelivery());
        	ordNew.setOrderdatetime(ord.get().getOrderdatetime());
        	ordNew.setOrder_delivered(true);
        	ordNew.setOrderdelivereddatetime(date);
        	
        } 
        
            repoUser.save(ordNew);
        	model.addAttribute("orderUsers", repoUser.findNotAccepted(false));

        
       return "orderUsers";
    }

}
