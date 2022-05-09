package kr.co.eis.api.auth.services;

import kr.co.eis.api.auth.domains.User;
import kr.co.eis.api.auth.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public final UserRepository repository;


    @Override
    public String login(User user) {
        return repository.login(user);
    }

    @Override
    public String logout(User user) {
        return repository.logout(user);
    }

    @Override
    public String put(User user) {
        repository.put(user);
        return "";
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public List<User> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public String delete(User user) {
        repository.delete(user);
        return "";
    }

    @Override
    public String save(User user) {
        repository.save(user);
        return null;
    }

    @Override
    public Optional<User> findById(String userid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String userid) {
        return false;
    }



    @Override
    public long count() {
        return repository.count();
    }
}

