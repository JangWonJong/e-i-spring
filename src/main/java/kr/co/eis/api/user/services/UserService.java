package kr.co.eis.api.user.services;

import kr.co.eis.api.user.domains.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

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

    //String login(User login);

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    long count();

    //String update(User user);

    String delete(User user);

    String save(User user);

    Optional<User> findById(String userid);

    boolean existsById(String userid);

    // custom

    List<User> findUserName(String name); 

}
