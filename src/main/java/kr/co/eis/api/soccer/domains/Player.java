package kr.co.eis.api.soccer.domains;

import com.sun.istack.NotNull;
import lombok.*;
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
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "players")
public class Player {
    @Id @Column(name = "player_id")
    @GeneratedValue private long player_id;
    @Column private String playerName;
    @Column private String teamid;
    @Column private @NotNull String eplayername;
    @Column private @NotNull String nickname;
    @Column private @NotNull String joinyyyy;
    @Column private @NotNull String position;
    @Column private @NotNull String backno;
    @Column private @NotNull String nation;
    @Column private @NotNull String birth;
    @Column private @NotNull String solar;
    @Column private @NotNull String height;
    @Column private @NotNull String weight;

    @ManyToOne
    @JoinColumn(name = "team_id")
    Team team;
}
