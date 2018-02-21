package boot.start.repository.registration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import boot.start.domain.registration.DisplayDataElement;

@Service
public interface DisplayDataElementServices extends JpaRepository<DisplayDataElement, Integer> {

}
