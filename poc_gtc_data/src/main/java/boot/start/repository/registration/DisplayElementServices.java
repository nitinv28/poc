package boot.start.repository.registration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import boot.start.domain.registration.DisplayElement;

@Service
public interface DisplayElementServices extends JpaRepository<DisplayElement, Integer> {

}
