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

//	@Query("SELECT * FROM user")
	List<User> findAll();

	@Query(value = "FROM user u WHERE u.username = :username", nativeQuery = true)
	User findByUsername(@Param("username") String username);

	@Query(value = "FROM user u WHERE u.user_id = :user_id", nativeQuery = true)
	User findById(@Param("user_id") int userId);

//	@Query(value = "SELECT COUNT(id) as count_id FROM user WHERE user_id = :user_id", nativeQuery = true)
//	int countUser(@Param("user_id") int userId);

	@Modifying
	@Transactional
	@Query(value = "DELETE user WHERE user_id = :user_id", nativeQuery = true)
	void delete(@Param("user_id") int userId);

}
