package kr.co.eis.api.soccer.repositories;

import kr.co.eis.api.soccer.domains.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.eis.api.soccer.repositories
 * fileName   : StadiumRepository
 * author     : Jangwonjong
 * date       : 2022-05-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-09     Jangwonjong       최초 생성
 */

interface StadiumCustomRepository{
    // 스타디움 전화번호 tel 을 변경하도록 하시오
}

@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long>,StadiumCustomRepository {
}
