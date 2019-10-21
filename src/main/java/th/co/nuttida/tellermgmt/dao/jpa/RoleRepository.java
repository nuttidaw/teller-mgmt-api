package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
//	@Override
//	List<Role> findAll();
//
//	@Query("SELECT * FROM role WHERE role.role_id = :role_id")
//	Role findById(@Param("role_id") String id);
}
