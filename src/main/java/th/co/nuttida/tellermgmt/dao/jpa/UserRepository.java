package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import th.co.nuttida.tellermgmt.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT * FROM user")
	List<User> findAll();

	User findByUsername(String username);

	@Query(value = "SELECT * FROM user JOIN role ON role.user_id = user.user_id WHERE user.user_id = :id", nativeQuery = true)
	User findById(@Param("id") int id);

	@Query(value = "SELECT COUNT(id) as count_id FROM user JOIN role ON role.user_id = user.user_id WHERE user.user_id = :id", nativeQuery = true)
	int countUser(@Param("id") int id);

	@Modifying
	@Transactional
	@Query(value = "DELETE user WHERE user_id = :id", nativeQuery = true)
	void delete(@Param("id") int id);

}
