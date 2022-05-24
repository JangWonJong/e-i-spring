package kr.co.eis.api.user.services;

import kr.co.eis.api.user.domains.User;
import kr.co.eis.api.user.repositories.UserRepository;
import kr.co.eis.api.common.datastructure.Box;
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


    /*@Override
    public String login(User user) {
        return repository.login(user);
    }*/


    /*@Override
    public String update(User user) {
        repository.update(user);
        return "";
    }*/

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
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String userid) {
        return repository.existsById(0L);
    }

    @Override
    public List<User> findUserName(String name) {
        List<User> ls = repository.findAll();
        Box<String, User> box = new Box<>();
        //ls = box.findUserName(ls, name);
        //ls.stream().filter();
        return null;
    }


    @Override
    public long count() {
        return repository.count();
    }
}

