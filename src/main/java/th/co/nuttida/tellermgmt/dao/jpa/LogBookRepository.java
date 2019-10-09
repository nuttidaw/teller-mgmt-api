package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.controller.LogBook;

@Repository
public interface LogBookRepository extends JpaRepository<LogBook, Integer>, JpaSpecificationExecutor<LogBook> {

	@Override
	List<LogBook> findAll();
	
	@Query("SELECT r FROM logbook r WHERE r.logbook_id = :logbook_id")
	LogBook findOneById(@Param("logbook_id") String id);
}
