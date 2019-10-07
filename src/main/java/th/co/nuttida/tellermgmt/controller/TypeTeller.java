package th.co.nuttida.tellermgmt.controller;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "type_teller")
public class TypeTeller implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_teller_id")
	private Integer typeTellerId;

	@Basic(optional = false)
	@Column(name = "type_teller_name")
	private String typeTellerName;

	public TypeTeller() {
	}

	public TypeTeller(Integer typeTellerId) {
		this.typeTellerId = typeTellerId;
	}

	public TypeTeller(Integer typeTellerId, String typeTellerName) {
		this.typeTellerId = typeTellerId;
		this.typeTellerName = typeTellerName;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeTellerId != null ? typeTellerId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof TypeTeller)) {
			return false;
		}
		TypeTeller other = (TypeTeller) object;
		if ((this.typeTellerId == null && other.typeTellerId != null)
				|| (this.typeTellerId != null && !this.typeTellerId.equals(other.typeTellerId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "TypeTeller [typeTellerId=" + typeTellerId + ", typeTellerName=" + typeTellerName + "]";
	}

}
