package th.co.nuttida.tellermgmt.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "logbook")
public class LogBook implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "logbook_id")
	private Integer logBookId;

	@Column(name = "date_time")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+7:00")
	private Date dateTime;

	@Column(name = "problem")
	private String problem;

	@Column(name = "solution")
	private String solution;

	@Column(name = "username")
	private String username;

	@Column(name = "teller_id")
	private String tellerId;

	public LogBook() {
		super();
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (logBookId != null ? logBookId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof LogBook)) {
			return false;
		}
		LogBook other = (LogBook) object;
		if ((this.logBookId == null && other.logBookId != null)
				|| (this.logBookId != null && !this.logBookId.equals(other.logBookId))) {
			return false;
		}
		return true;
	}

	public Integer getLogBookId() {
		return logBookId;
	}

	public void setLogBookId(Integer logBookId) {
		this.logBookId = logBookId;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTellerId() {
		return tellerId;
	}

	public void setTellerId(String tellerId) {
		this.tellerId = tellerId;
	}

	@Override
	public String toString() {
		return "LogBook [logBookId=" + logBookId + ", dateTime=" + dateTime + ", problem=" + problem + ", solution="
				+ solution + ", username=" + username + "]";
	}

}
