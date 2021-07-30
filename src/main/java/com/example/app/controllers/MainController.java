
package com.example.app.controllers;

import com.example.app.entity.Customer;
import com.example.app.gui.home;
import com.example.app.repos.CustomerRepo;

import com.example.app.services.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    
    @Autowired
    private CustomerRepo repo;
//    public static void main(String[] args) {
//        System.out.println("com.example.app.controllers.MainController.main()");
//        login();
//    }
    
    public void login() {
        
         home frame = new home();
//        frame.launch();


//        ls.forEach(action);

        
    }
    
}
