package kr.co.eis.api.common.streams;

import kr.co.eis.api.common.datastructure.ApplelList;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.eis.api.common.streams
 * fileName   : HelloStream
 * author     : Jangwonjong
 * date       : 2022-05-16
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-16     Jangwonjong       최초 생성
 */
//한국어 안녕, 영어 Hello
public class HelloStream {

    @Data //속성
        public static class Hello {
        protected String greeting, inLanguage;

        public Hello(Builder builder) {
            this.greeting = builder.greeting;
            this.inLanguage = builder.inLanguage;
        }

        public static class Builder {
            private String greeting, inLanguage;

            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            public Builder inLanguage(String inLanguage) {
                this.inLanguage = inLanguage;
                return this;
            }

            public Hello build() {
                return new Hello(this);
            }
        }

        @Override
        public String toString() {
            return String.format("[인사] %s,  %s",
                    greeting, inLanguage);
        }
    }
        interface HelloService {
            Set<String> greet(String[] arr);
        }
        static class HelloServiceImpl implements HelloService {
            private final List<HelloStream.Hello> list;
            HelloServiceImpl() {
                this.list = new ArrayList<>();
            }

            @Override
            public Set<String> greet(String[] arr) {
                return Arrays.asList(arr)
                        .stream()
                        .filter(e -> e.startsWith("한국"))
                        .collect(Collectors.toSet());
            }
        }
        @Test
        void HelloStreamTest() {
            String[] arr = {"한국어 안녕", "영어 Hello"};
            HelloService service = new HelloServiceImpl();
            Set<String> se = service.greet(arr);
            se.forEach(System.out::println);


        
    }
}