package kr.co.eis.api.common.datastructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * packageName: kr.co.eis.api.common.datastructure
 * fileName   : Trunk
 * author     : Jangwonjong
 * date       : 2022-05-12
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-12     Jangwonjong       최초 생성
 */
@Component @Data @Lazy
public class Trunk<K, V> {
    private HashMap<K, V> map;
    Trunk() {
        this.map = new HashMap<>();
    }
    public void save(K k, V v){map.put(k, v);}
    public void update(K k, V v){map.replace(k, v);}
    public void delete(K k){map.remove(k);}
    public List<V> findAll(){return (List<V>) map.values();
    }
    public V findById(K k){
        return map.get(k);}
    public int count(){
        return map.size();}
    public void clear(){
        map.clear();}
}
