package uni.fmi.masters.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {
    @GetMapping(path = "/")
    public String getMain(){
        return "index.html";
    }

}
