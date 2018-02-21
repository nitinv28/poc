package boot.start.repository.applynow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import boot.start.domain.applynow.ApplyNow;
import boot.start.domain.applynow.ApplyNowMap;

@Service
public interface ApplyNowMapServices extends JpaRepository<ApplyNowMap, Integer> { 

}
