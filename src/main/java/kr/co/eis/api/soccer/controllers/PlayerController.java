package kr.co.eis.api.soccer.controllers;

import kr.co.eis.api.soccer.domains.Player;
import kr.co.eis.api.soccer.domains.Team;
import kr.co.eis.api.soccer.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.eis.api.soccer.controllers
 * fileName   : SoccerController
 * author     : Jangwonjong
 * date       : 2022-05-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-09     Jangwonjong       최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerController {
    private final PlayerService service;
    @GetMapping("/findAll")
    public List<Player> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Player> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Player> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }


    @DeleteMapping("/delete")
    public String delete(@RequestBody Player player) {
        return service.delete(player);

    }

    @PostMapping("/join")
    public String save(@RequestBody Player player) {
        return service.save(player);

    }

    @GetMapping("/findById/{playerId}")
    public Optional<Player> findById(@PathVariable String playerId) {
        return service.findById(playerId);
    }

    @GetMapping("/existsById/{playerId}")
    public boolean existsById(@PathVariable String playerId) {
        return service.existsById(playerId);
    }
}
