package kr.co.eis.api.soccer.repositories;

import kr.co.eis.api.soccer.domains.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.eis.api.soccer.repositories
 * fileName   : ScheduleRepository
 * author     : Jangwonjong
 * date       : 2022-05-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-09     Jangwonjong       최초 생성
 */
@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
