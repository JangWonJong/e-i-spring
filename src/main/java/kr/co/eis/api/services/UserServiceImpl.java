package kr.co.eis.api.services;

import kr.co.eis.api.domains.User;
import kr.co.eis.api.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: kr.co.eis.api.services
 * fileName   : UserService
 * author     : Jangwonjong
 * date       : 2022-05-03
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-03     Jangwonjong       최초 생성
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    public final UserRepository userRepository;


    @Override
    public String join(User join) {
        return null;
    }

    @Override
    public String login(User login) {
        return null;
    }

    @Override
    public String logout(User logout) {
        return null;
    }
}

