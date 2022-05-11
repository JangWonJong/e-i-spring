package kr.co.eis.api.common.datastructure;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * packageName: kr.co.eis.api.common.datastructure
 * fileName   : ApplelList
 * author     : Jangwonjong
 * date       : 2022-05-11
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-11     Jangwonjong       최초 생성
 */
// Apple color price(int) origin(영동, 풍기)
public class ApplelList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppleService service = new AppleServiceImpl();
        while (true) {
            System.out.println("0.Exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findAll 7.count 8.existById 9.clear");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    Apple yd = new Apple.Builder()
                            .origin("영동")
                            .color("RED")
                            .price(1000)
                            .build();
                    service.save(yd);
                    Apple yd2 = new Apple.Builder()
                            .origin("영동")
                            .color("BLUE")
                            .price(1500)
                            .build();
                    service.save(yd2);
                    Apple pg = new Apple.Builder()
                            .origin("풍기")
                            .color("RED")
                            .price(2000)
                            .build();
                    service.save(pg);
                    break;
                case "2":
                    Apple temp = new Apple();
                    temp.set("jang");
                    service.update(temp);
                    break;
                case "3":
                    MemberCRUD.Member temp1 = new MemberCRUD.Member();
                    temp1.setUserid("you");
                    service.delete(temp1);
                    System.out.println("삭제된 값은" + temp1);
                    break;
                case "4":
                    String res = "";
                    MemberCRUD.Member temp2 = new MemberCRUD.Member();
                    temp2.setUserid("you");
                    res = (service.findById(temp2.userid) == null) ? "찾는 값이 없습니다" : String.format("찾는 값은 %s입니다", temp2);
                    System.out.println(res);
                    break;
                case "5":
                    break;
                case "6":
                    System.out.println("총 회원 목록: " + service.findAll());
                    break;
                case "7":
                    System.out.println("총 회원 수: " + service.count());
                    break;
                case "8":
                    break;
                case "9":
                    service.clear();
                    break;
                default:
                    break;

            }
        }
    }
    @Data
    static class Apple{
        protected String color, origin;
        protected int price;

        public Apple(Builder builder){
            this.color = builder.color;
            this.origin = builder.origin;
            this.price = builder.price;
        }
        @NoArgsConstructor
        static class Builder{
            private String color, origin;
            private int price;
            public Builder color (String color){this.color=color; return this;}
            public Builder origin(String origin){this.origin=origin; return this;}
            public Builder price(int price){this.price=price; return this;}
            Apple build(){return  new Apple(this);}
        }
        @Override public String toString(){
            return String.format("[apple spec] origin : %s, color : %s, price: %d",
                    origin, color, price);

        }
    }
    interface AppleService{
        void save(Apple apple);
        void update(Apple apple, int i);
        void delete(Apple apple);
        List<Apple> findAll();
        List<Apple> findByOrigin(String orgin);
        List<Apple> findByColor(String color);
        Apple findById(int i);
        int count();
        void clear();
    }

    static class AppleServiceImpl implements AppleService{
        private final List<Apple> list;

        AppleServiceImpl() {
            this.list = new ArrayList<>();
        }


        @Override
        public void save(Apple apple) {
            list.add(apple);
        }

        @Override
        public void update(Apple apple, int i) {
            list.set(i, apple);
        }


        @Override
        public void delete(Apple apple) {
            list.remove(apple);
        }

        @Override
        public List<Apple> findAll() {
            return list;
        }
        @Override
        public List<Apple> findByOrigin(String orgin) {
            return null;
        }

        @Override
        public List<Apple> findByColor(String color) {
            return null;
        }

        @Override
        public Apple findById(int i) {
            return list.get(i);
        }

        @Override
        public int count() {
            return list.size();
        }

        @Override
        public void clear() {
            list.clear();
        }
    }
    static List<Apple> filterApples(List<Apple> list, Predicate<Apple> predicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: list){
            if(predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
    static List<Apple> filterApplesByOrigin(List<Apple> list, String origin){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: list){
            if(origin.equals(apple.getOrigin())){
                result.add(apple);
            }
        }
        return result;
    }

}
