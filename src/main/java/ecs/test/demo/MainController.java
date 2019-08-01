package ecs.test.demo;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/", produces = "application/json;charset=UTF-8")
@CrossOrigin("*")
public class MainController {


    @GetMapping
    public String helloWorld() {
        return "Hello World !";
    }

    @GetMapping("/{user}")
    public String greet(@PathVariable String user) {
        return "Hello " + user + " !";
    }
}
