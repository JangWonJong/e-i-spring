package kr.co.eis.api.soccer.services;

import kr.co.eis.api.soccer.domains.Team;
import kr.co.eis.api.soccer.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.eis.api.soccer.services
 * fileName   : TeamServiceImpl
 * author     : Jangwonjong
 * date       : 2022-05-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-09     Jangwonjong       최초 생성
 */
@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService{
    private final TeamRepository repository;


    @Override
    public List<Team> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Team> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Team> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Team team) {
        repository.delete(team);
        return "";
    }

    @Override
    public String save(Team team) {
        repository.save(team);
        return "";
    }

    @Override
    public Optional<Team> findById(String teamId) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String teamId) {
        return repository.existsById(0L);
    }




}
