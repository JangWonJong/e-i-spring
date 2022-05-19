package kr.co.eis.api.soccer.repositories;

import kr.co.eis.api.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.eis.api.soccer.repositories
 * fileName   : SoccerRepository
 * author     : Jangwonjong
 * date       : 2022-05-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-09     Jangwonjong       최초 생성
 */

interface PlayerCustomRepository{}

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>, PlayerCustomRepository {
}
