package kr.co.eis.api.soccer.controllers;

import kr.co.eis.api.auth.domains.User;
import kr.co.eis.api.soccer.domains.Team;
import kr.co.eis.api.soccer.services.ScheduleService;
import kr.co.eis.api.soccer.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.eis.api.soccer.controllers
 * fileName   : TeamController
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
@RequestMapping("/team")
public class TeamController {
    private final TeamService service;

    @GetMapping("/findAll")
    public List<Team> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Team> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Team> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }


    @DeleteMapping("/delete")
    public String delete(@RequestBody Team team) {
        return service.delete(team);

    }

    @PostMapping("/join")
    public String save(@RequestBody Team team) {
        return service.save(team);

    }

    @GetMapping("/findById/{teamId}")
    public Optional<Team> findById(@PathVariable String teamId) {
        return service.findById(teamId);
    }

    @GetMapping("/existsById/{teamId}")
    public boolean existsById(@PathVariable String teamId) {
        return service.existsById(teamId);
    }

   }
