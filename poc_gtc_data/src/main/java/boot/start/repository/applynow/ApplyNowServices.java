package boot.start.repository.applynow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import boot.start.domain.applynow.ApplyNow;

/**
 * apply now service for CURD operations by JPA repository
 * @author nitin
 */
@Service
public interface ApplyNowServices extends JpaRepository<ApplyNow, Integer> {

	public ApplyNow findByName(String name);
}
