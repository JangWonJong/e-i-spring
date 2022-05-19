package kr.co.eis.api.soccer.domains;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName: kr.co.eis.api.soccer.domains
 * fileName   : Team
 * author     : Jangwonjong
 * date       : 2022-05-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-09     Jangwonjong       최초 생성
 */
@Builder @Getter @AllArgsConstructor @NoArgsConstructor
@Component
@Entity
@Table(name = "teams")
public class Team {
    @Id @Column(name = "team_id") @GeneratedValue
    private long teamid;
    @Column String stadiumid;
    @Column private @NotNull String region;
    @Column private @NotNull String teamname;
    @Column private @NotNull String eteamname;
    @Column private @NotNull String origyyyy;
    @Column private @NotNull String zipcode1;
    @Column private @NotNull String zipcode2;
    @Column private @NotNull String address;
    @Column private @NotNull String ddd;
    @Column private @NotNull String tel;
    @Column private @NotNull String fax;
    @Column private @NotNull String homepage;
    @Column private @NotNull String owner;

    @OneToMany(mappedBy = "team")
    List<Player> players = new ArrayList<>();
}
