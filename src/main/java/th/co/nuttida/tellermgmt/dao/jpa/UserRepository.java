package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.controller.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

	@Override
	List<User> findAll();

	User findByUsername(String username);

	User findByEmail(String email);

	@Override
	void delete(User user);

}
