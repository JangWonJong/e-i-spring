package kr.co.eis.api.controllers;

import kr.co.eis.api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: kr.co.eis.api.controllers
 * fileName   : UserController
 * author     : Jangwonjong
 * date       : 2022-05-03
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-03     Jangwonjong       최초 생성
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/join")
    public String join(){
        return null;
    }
    @PostMapping("/login")
    public String login(){
        return null;
    }
    @PostMapping("/logout")
    public String logout(){
        return null;
    }
}
