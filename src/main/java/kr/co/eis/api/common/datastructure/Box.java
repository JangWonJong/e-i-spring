package kr.co.eis.api.common.datastructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName: kr.co.eis.api.common.datastructure
 * fileName   : Box
 * author     : Jangwonjong
 * date       : 2022-05-12
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-12     Jangwonjong       최초 생성
 */

@Component @Data @Lazy
public class Box<T> {
    private ArrayList<T> list;
    Box() {
        this.list = new ArrayList<>();
    }
    // save, update, delete, findAll, findByName, findById, count, existsBuId, clear
    // add, set, remove, get(), X, get(id), size, X, clear
    public void save(T t) {
        list.add(t);
    }
    public void update(T t, int i) {
        list.set(i,t);
    }
    public void delete(T t) {
        list.remove(t);
    }
    public List<T> findAll() {
        return list;
    }
    public T findById(int i) {
        return list.get(i);
    }
    public int count() {
        return list.size();
    }
    public void clear() {
        list.clear();
    }
}


