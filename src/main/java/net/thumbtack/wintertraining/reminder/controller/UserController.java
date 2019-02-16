package net.thumbtack.wintertraining.reminder.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    //private UserService userService;

    //@Autowired
   // public UserController(UserService userService) {
   //     this.userService = userService;
    //}
}
