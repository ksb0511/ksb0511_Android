package org.duksung.test.api;

import org.duksung.test.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class firstController {

    @RequestMapping(method = RequestMethod.GET, value="12")
    public String hello2(){
        return "Success!!!~~!!!!!~~~~~!!!!!~~~~!!!!!!";
    }

    @GetMapping("/name/{name}")
    public String getName(@PathVariable(value = "name") final String name) {
        User user = new User();
        //user.

        return name;
    }

    @GetMapping("/num")
    public int number(@RequestParam(value = "num") final int[] num) {
        int sum =0;
        for(int i : num) {
            sum +=i;
        }
        return sum;
    }
}
