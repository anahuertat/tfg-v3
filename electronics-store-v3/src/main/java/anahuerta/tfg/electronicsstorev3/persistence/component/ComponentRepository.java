package anahuerta.tfg.electronicsstorev3.persistence.component;

import anahuerta.tfg.electronicsstorev3.domain.Component;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends JpaRepository<Component, Integer>, ComponentRepositoryCustom{
	//get component
	Optional<Component> findById(Integer reference);
}
