package kr.co.eis.api.common.datastructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * packageName: kr.co.eis.api.common.datastructure
 * fileName   : MemberCRUD
 * author     : Jangwonjong
 * date       : 2022-05-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-09     Jangwonjong       최초 생성
 */

public class MemberCRUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService service = new MemberServiceImpl();
        while (true){
            System.out.println("0.Exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findAll 7.count 8.existById");
            switch (scanner.next()){
                case "0":return;
                case "1":break;
                case "2":break;
                case "3":break;
                case "4":break;
                case "5":break;
                case "6":break;
                case "7":break;
                case "8":break;
                default:break;

            }
        }
    }
    @Data @AllArgsConstructor @Component
    static class Member{
        protected String userid, name, password, profileImg, phone, email;
        @Override public String toString(){
            return String.format("[user spec] userid : %s, name : %s, password: %s, profileImg : %s, phone: %s, email: %s,",
                    userid, name, password, profileImg, phone, email);

        }
    }
    interface MemberService{
        void save(Member member);
        void update(Member member);
        void delete(Member member);
        Member findById(String id);
        List<Member> findByName(String name);
        List<Member> findAll();
        int count();
        boolean existsById(String id);
    }

    static class MemberServiceImpl implements MemberService{
        Map<String, Member> map;

        MemberServiceImpl(){
            this.map = new HashMap<>();
        }
        @Override
        public void save(Member member) {

        }

        @Override
        public void update(Member member) {

        }

        @Override
        public void delete(Member member) {

        }

        @Override
        public Member findById(String id) {
            return null;
        }

        @Override
        public List<Member> findByName(String name) {
            return null;
        }

        @Override
        public List<Member> findAll() {
            return null;
        }

        @Override
        public int count() {
            return 0;
        }

        @Override
        public boolean existsById(String id) {
            return false;
        }
    }
}
