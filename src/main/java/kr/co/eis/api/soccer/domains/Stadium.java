package kr.co.eis.api.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: kr.co.eis.api.soccer.domains
 * fileName   : Stadium
 * author     : Jangwonjong
 * date       : 2022-05-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-09     Jangwonjong       최초 생성
 */
@Data
@Component
@Entity
@Table(name = "stadium")
public class Stadium {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String stadiumid;
    private String stadiumname;
    private String hometeamid;
    private String seatcount;
    private String address;
    private String ddd;
    private String tel;

}
