package kr.co.eis.api.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: kr.co.eis.api.soccer
 * fileName   : Soccer
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
@Table(name = "player")
public class Player {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String playerid;
    private String playername;
    private String teamid;
    private String eplayername;
    private String nickname;
    private String joinyyyy;
    private String position;
    private String backno;
    private String nation;
    private String birth;
    private String solar;
    private String height;
    private String weight;

}
