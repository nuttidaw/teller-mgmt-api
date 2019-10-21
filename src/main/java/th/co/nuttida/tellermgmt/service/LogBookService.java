package th.co.nuttida.tellermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.nuttida.tellermgmt.dao.jpa.LogBookRepository;
import th.co.nuttida.tellermgmt.domain.LogBook;

@Service
@Transactional
public class LogBookService {

	@Autowired
	private LogBookRepository logBookRepository;

	public LogBook createLogBook(LogBook logBook) {
		logBook.setLogBookId(logBook.getLogBookId());
		logBook.setTellerId(logBook.getTellerId());
		logBook.setDateTime(logBook.getDateTime());
		logBook.setProblem(logBook.getProblem());
		logBook.setSolution(logBook.getSolution());
		logBook.setUsername(logBook.getUsername());
		return logBookRepository.save(logBook);
	}

	public List<LogBook> findAll() {
		return logBookRepository.findAll();
	}

	public LogBook findLogBookById(int id) {
		LogBook found = logBookRepository.findById(id);
		return found;
	}

	public List<LogBook> findLogBookByTellerId(String tellerId) {
		return logBookRepository.ByTellerId(tellerId);
	}

	public LogBook addLogBook(LogBook logBook) {
		return logBookRepository.save(logBook);
	}

}
