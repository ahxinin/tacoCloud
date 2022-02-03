package com.ahxinin.tacocloud.interfaces;

import com.ahxinin.tacocloud.domain.Taco;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : hexin
 * @date : 2022-02-02
 */
@RestController
public class TacoController {

    @PostMapping("process")
    public void process(@Valid Taco taco){
        // process
    }

    @GetMapping("/")
    public String home(){
        return "welcome";
    }
}
