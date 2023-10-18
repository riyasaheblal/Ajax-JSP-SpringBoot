package com.example.HtmlCRUDProject.Controller;

import com.example.HtmlCRUDProject.Model.MyntraCloth;
import com.example.HtmlCRUDProject.Service.MyntraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyntraController {

    @Autowired
    private MyntraService myntraService;

    @GetMapping("/")
    public String get(Model model){
        model.addAttribute("list",myntraService.getAll());
        return "home";
    }

    @GetMapping("/AddDetails")
    public String AddDetails(Model model){
        MyntraCloth myntraCloth=new MyntraCloth();
        model.addAttribute("myntra",myntraCloth);
        return "adddetails";
    }

    @GetMapping("/fo")
    public String test(){
        return "test";
    }

    @PostMapping("/save")
        public String saveData(@ModelAttribute("myntra") MyntraCloth myntraCloth){
        this.myntraService.create(myntraCloth);
            return "redirect:/";
        }




    @GetMapping("/update/{id}")
    String updatData(@PathVariable int id, Model model) {
        MyntraCloth myntraCloth = myntraService.findClothById(id);
        model.addAttribute("myntra", myntraCloth);
        return "update";
    }

    @GetMapping("/delete/{id}")
    String deleteData(@PathVariable int id) {
     this.myntraService.deleteClothById(id);
        return "redirect:/";
    }


    //Performing Ajax

    @GetMapping("/check")
    public String check(){
        return "test";
    }
    @PostMapping(path = "/saveData", consumes = "application/json")
    @ResponseBody
    public List<MyntraCloth> details1(@RequestBody MyntraCloth cloths){
        myntraService.create(cloths);
        return myntraService.getAll();
    }
}
