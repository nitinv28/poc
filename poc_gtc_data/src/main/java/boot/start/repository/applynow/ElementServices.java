package boot.start.repository.applynow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import boot.start.domain.applynow.Elements;



@Service
public interface ElementServices extends JpaRepository<Elements, Integer>{

}
