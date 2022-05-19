package kr.co.eis.api.soccer.domains;

import com.sun.istack.NotNull;
import lombok.*;
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
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "schedules")
public class Schedule {
    @Id @Column(name = "sche_date") @GeneratedValue
    private long sche_date;
    @Column private @NotNull String stadiumid;
    @Column private @NotNull String gubun;
    @Column private @NotNull String hometeamid;
    @Column private @NotNull String awayteamid;
    @Column private @NotNull String homescore;
    @Column private @NotNull String awayscore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id")
    Stadium stadium;
}
