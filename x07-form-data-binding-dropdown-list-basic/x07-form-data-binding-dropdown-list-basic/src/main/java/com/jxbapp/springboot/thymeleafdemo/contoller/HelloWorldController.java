package com.jxbapp.springboot.thymeleafdemo.contoller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    // need a controller method to show initial HTML form, only works for Get Mappings
    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    //need a controller method to read form data and
    // add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        //read the request parameter from the HTML form
        String theName = request.getParameter("studentName");
        //convert the data to all caps
        theName = theName.toUpperCase();
        //create the message
        String result = "Yo! " + theName;
        //add message to the model, attribute Name, and value (ie result)
        model.addAttribute("message", result);

        return "helloworld";
    }

    //HTML form field name (next to RequestParam) and assigns it to the theName to value of request param
    //Modify the code to only support GET requests
    @GetMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){

        //BECAUSE of the requestparam binding we no longer need this line of code
//        //read the request parameter from the HTML form
//        String theName = request.getParameter("studentName");

        //convert the data to all caps
        theName = theName.toUpperCase();
        //create the message
        String result = "Hey My Friend from Version3! " + theName;
        //add message to the model, attribute Name, and value (ie result)
        model.addAttribute("message", result);

        return "helloworld";
    }
}
