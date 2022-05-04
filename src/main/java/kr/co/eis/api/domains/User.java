package kr.co.eis.api.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: kr.co.eis.api.domains
 * fileName   : user
 * author     : Jangwonjong
 * date       : 2022-05-03
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-03     Jangwonjong       최초 생성
 */
@Data
@Component
public class User {
    private String userid;
    private String password;
    private String email;
    private String name;
    private String phone;
    private String birth;
    private String address;
}
