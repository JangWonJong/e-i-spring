package kr.co.eis.api.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: kr.co.eis.api.soccer.domains
 * fileName   : Schedule
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
@Table(name = "schedule")
public class Schedule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String stadiumid;
    private String schedate;
    private String gubun;
    private String hometeamid;
    private String awayteamid;
    private String homescore;
    private String awayscore;

}
