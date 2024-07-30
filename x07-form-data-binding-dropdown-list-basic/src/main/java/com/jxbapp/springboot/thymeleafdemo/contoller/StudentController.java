package com.jxbapp.springboot.thymeleafdemo.contoller;

import com.jxbapp.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    //create a method for showing our form
    @GetMapping("/showStudentForm")
    public String showFrom(Model theModel){

        //create a new student object
        Student theStudent = new Student();
        //add the student object as a model attribute
        theModel.addAttribute("student", theStudent);

        //make a return over to student-form
        return "student-form";
    }

    //create Form Processing code
    @PostMapping("/processStudentForm")
    public String processFrom(@ModelAttribute("student") Student theStudent){

       // log the input data
       System.out.printf("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

        return "student-confirmation";

    }


}
