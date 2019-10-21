package th.co.nuttida.tellermgmt.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.nuttida.tellermgmt.domain.LogBook;

@Repository
public interface LogBookRepository extends JpaRepository<LogBook, Long> {

	@Override
	List<LogBook> findAll();

	@Query(value = "SELECT * FROM logbook WHERE logbook.logbook_id = :logbook_id", nativeQuery = true)
	LogBook findById(@Param("logbook_id") int id);

	@Query(value = "SELECT * FROM logbook WHERE logbook.teller_id = :teller_id", nativeQuery = true)
	List<LogBook> ByTellerId(@Param("teller_id") String tellerId);
}
