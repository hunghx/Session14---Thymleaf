package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.model.User;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("name","Thắng mít");
        model.addAttribute("welcome","¡Bienvenido a nuestra tienda de comestibles!");
        model.addAttribute("user",new User(1,"Hùng"));
        return "/index";
    }
    @GetMapping("/list-product")
    public String getListProduct(){
        return "/lst-product";
    }
}
