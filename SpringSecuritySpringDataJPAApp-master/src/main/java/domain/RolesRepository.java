package domain;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends CrudRepository<Role, Long> {
	
	@Query("select r.authority from Role r" +
            " where r.user.username=?1")
    List<String> findByUserName(String username);
	
}