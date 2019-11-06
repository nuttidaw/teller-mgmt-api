package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

//	@Query("SELECT * FROM role")
	List<Role> findAll();

	@Query(value = "FROM role u WHERE u.role_id = :role_id", nativeQuery = true)
	Role findById(@Param("role_id") int roleId);
}
