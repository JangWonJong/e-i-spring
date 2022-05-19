package kr.co.eis.api.board.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: kr.co.eis.api.domains
 * fileName   : Board
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
@Table(name = "articles1")
public class Article1 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column private String projects;
    @Column private String startDate;
    @Column private String status;
    @Column private String team;
    @Column private String progress;
    @Column private String action;
}