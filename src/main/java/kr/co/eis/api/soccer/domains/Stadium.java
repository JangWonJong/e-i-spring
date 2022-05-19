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
 * fileName   : Stadium
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
@Entity @Eager
@Table(name = "stadiums")
public class Stadium {
    @Id @Column(name = "stadium_id") @GeneratedValue
    private long stadium_id;
    @Column private @NotNull String stadiumname;
    @Column private @NotNull String hometeamid;
    @Column private @NotNull String seatcount;
    @Column private @NotNull String address;
    @Column private @NotNull String ddd;
    @Column private @NotNull String tel;

    @OneToMany(mappedBy = "stadium")
    List<Schedule> schedules = new ArrayList<>();

}
