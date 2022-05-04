package kr.co.eis.api.services;

import kr.co.eis.api.domains.User;

/**
 * packageName: kr.co.eis.api.repositories
 * fileName   : User
 * author     : Jangwonjong
 * date       : 2022-05-03
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-03     Jangwonjong       최초 생성
 */
public interface UserService {
    String join(User join);
    String login(User login);
    String logout(User logout);
}
