package kr.co.eis.api.auth.repositories;

import kr.co.eis.api.auth.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.eis.api.repositories
 * fileName   : UserRepository
 * author     : Jangwonjong
 * date       : 2022-05-03
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-03     Jangwonjong       최초 생성
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    String login(User user);
    void put(User user);
    String logout(User user);
}
