package boot.start.repository.registration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import boot.start.domain.registration.DataElement;

@Service
public interface DataElementServices extends JpaRepository<DataElement, Integer>{

}
