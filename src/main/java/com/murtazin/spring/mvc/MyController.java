package com.murtazin.spring.mvc;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
@RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmplDet(){
    return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmplDet(){
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmplDet(HttpServletRequest request, Model model){
//
//    String empName=request.getParameter("employeeName");
//    empName="Zdorova, "+ empName;
//    model.addAttribute("nameAttribute", empName);
//    model.addAttribute("description", "megaAdmin");
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmplDet(@RequestParam("employeeName") String empName, Model model){

        empName="Zdorova, "+ empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", " - megaAdmin");
        return "show-emp-details-view";
    }


}
