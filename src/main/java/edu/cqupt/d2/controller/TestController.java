package edu.cqupt.d2.controller;

import edu.cqupt.d2.domain.Admin;
import edu.cqupt.d2.domain.User;
import edu.cqupt.d2.service.AdminService;
import edu.cqupt.d2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String getAdminByID(String id){
        User user = new User();
        user.setUid(id);
        user.setUser_name("lisi");
        user.setUser_password("123");
        user.setUser_phone("111111");
        userService.saveUser(user);

        return "success "+userService.getUserById(id).getUser_name();
    }
}
