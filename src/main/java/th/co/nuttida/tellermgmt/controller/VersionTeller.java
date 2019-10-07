package th.co.nuttida.tellermgmt.controller;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "version_teller")
public class VersionTeller implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "version_teller_id")
	private Integer versionTellerId;

	@Basic(optional = false)
	@Column(name = "version_teller_name")
	private String versionTellerName;

	@OneToOne(mappedBy = "brand_teller_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private BrandTeller brandTeller;

	@OneToOne(mappedBy = "type_teller_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private TypeTeller typeTeller;

	public VersionTeller() {
		super();
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (versionTellerId != null ? versionTellerId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof VersionTeller)) {
			return false;
		}
		VersionTeller other = (VersionTeller) object;
		if ((this.versionTellerId == null && other.versionTellerId != null)
				|| (this.versionTellerId != null && !this.versionTellerId.equals(other.versionTellerId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "VersionTeller [versionTellerId=" + versionTellerId + ", versionTellerName=" + versionTellerName
				+ ", brandTeller=" + brandTeller + ", typeTeller=" + typeTeller + "]";
	}

}
