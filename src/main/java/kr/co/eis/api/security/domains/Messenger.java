package kr.co.eis.api.security.domains;

import lombok.Builder;
import lombok.Getter;

/**
 * packageName: kr.co.eis.api.security.domain
 * fileName   : Messenger
 * author     : Jangwonjong
 * date       : 2022-05-23
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-23     Jangwonjong       최초 생성
 */
@Getter
@Builder
public class Messenger {
    private String Message, code;
    private int status;
}
