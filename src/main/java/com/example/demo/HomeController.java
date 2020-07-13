package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("var1", "Yes, you can!");
        model.addAttribute("var2", "Let's have fun!");
        return "home";
    }

        @RequestMapping("/displaypage")
        public String homePage() {
            return "displaypage";

        }

    }


//
//import org.springframework.stereotype.Controller;
//        import .....Model;
//        import .....ReportMapping;
//
//@Controller
//public HomeController {
//@ReportMapping("/homepage")
//public string homePage(Model model) {
//        model.addAttribute("var1","Yes, you can!");
//        model.addAttribute("var2","Let's have fun!");
//        return "home"
//        }
//@ReportMapping("/displaypage")
//public string homePage() {
//        return "display"
//        }
//
//        }