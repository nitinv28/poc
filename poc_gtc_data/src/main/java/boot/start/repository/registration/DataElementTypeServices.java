package boot.start.repository.registration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import boot.start.domain.registration.DataElementType;

@Service
public interface DataElementTypeServices extends JpaRepository<DataElementType, Integer> {

}
