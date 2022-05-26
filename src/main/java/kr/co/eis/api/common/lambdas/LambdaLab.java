package kr.co.eis.api.common.lambdas;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.function.Supplier;

/**
 * packageName: kr.co.eis.api.common.lambdas
 * fileName   : LambdaLab
 * author     : Jangwonjong
 * date       : 2022-05-26
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-26     Jangwonjong       최초 생성
 */
public class LambdaLab {
    public static void solution(){

    }

    public static String date(){
        Supplier<Date> f = Date::new;
        return String.valueOf(f.get());
    }
    @Test
    public void testsolution(){
        System.out.println();
        System.out.println(date());
    }
}
