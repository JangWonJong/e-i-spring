package kr.co.eis.api.soccer.services;

import kr.co.eis.api.soccer.domains.Player;
import kr.co.eis.api.soccer.domains.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.eis.api.soccer.services
 * fileName   : SoccerService
 * author     : Jangwonjong
 * date       : 2022-05-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-09     Jangwonjong       최초 생성
 */
public interface PlayerService {

    List<Player> findAll();

    List<Player> findAll(Sort sort);

    Page<Player> findAll(Pageable pageable);

    long count();

    String delete(Player player);

    String save(Player player);

    Optional<Player> findById(String playerId);

    boolean existsById(String playerId);
}
