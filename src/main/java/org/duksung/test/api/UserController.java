package org.duksung.test.api;

import org.duksung.test.model.DefaultRes;
import org.duksung.test.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class UserController {

    private final static List<User> userList = new LinkedList<>();

    @GetMapping("/users")
    public String getUserList(
            @RequestParam(value = "name", required = false) final String name,
            @RequestParam(value = "part", required = false) final String part){

//        if(name.equals(name))
//            return userList.toString();
//        if(part.equals(part))
//            return userList.toString();
//        else
//            return "없습니다.";

//        getUserList(name, part);
//        DefaultRes defaultRes = new DefaultRes<>();
//        return new ResponseEntity(defaultRes.res(userList.toString()), HttpStatus.OK);

//            return
        if(userList.size()==0)
            return "없습니다.";
        else
            return "크기는 "+userList.size()+"이며, \n"+userList.toString();



    }

    @GetMapping("/users/{user_idx}")
    public String getUserList_Idx(@PathVariable(value = "user_idx") final int user_idx) {
        return "없습니다.";
    }

    @PostMapping("/users")
    public ResponseEntity postUserList(@RequestBody final User user) {
          userList.add(user);
//        return new ResponseEntity("123456789",HttpStatus.BAD_REQUEST);
         DefaultRes defaultRes = new DefaultRes<>();
        //defaultRes.res("123");
        return new ResponseEntity(defaultRes.res(user.getName()), HttpStatus.OK);
    }

    @PutMapping("/users/{user_idx}")
    public String putUserList(
            @PathVariable(value = "user_idx") final int user_idx,
            @RequestBody final User user) {
        userList.remove(user_idx);
        userList.add(user);
        return "삭제하고 다시 저장했습니다.";
    }


    @DeleteMapping("/users/{user_idx}")
    public String deleteUserList(@PathVariable(value = "user_idx") final int user_idx) {
        userList.remove(user_idx);
        return userList.toString()+"삭제해 버렸다^^";
    }

}
