package kr.co.eis.api.soccer.controllers;

import kr.co.eis.api.soccer.domains.Schedule;
import kr.co.eis.api.soccer.domains.Team;
import kr.co.eis.api.soccer.services.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.eis.api.soccer.controllers
 * fileName   : ScheduleController
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
@RequestMapping("/schedule")
public class ScheduleController {
    private final ScheduleService service;
    @GetMapping("/findAll")
    public List<Schedule> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Schedule> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Schedule> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }


    @DeleteMapping("/delete")
    public String delete(@RequestBody Schedule schedule) {
        return service.delete(schedule);

    }

    @PostMapping("/join")
    public String save(@RequestBody Schedule schedule) {
        return service.save(schedule);

    }

    @GetMapping("/findById/{scheDate}")
    public Optional<Schedule> findById(@PathVariable String scheDate) {
        return service.findById(scheDate);
    }

    @GetMapping("/existsById/{scheDate}")
    public boolean existsById(@PathVariable String scheDate) {
        return service.existsById(scheDate);
    }
}
