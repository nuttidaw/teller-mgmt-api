package th.co.nuttida.tellermgmt.controller;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "teller")
public class Teller implements Serializable {

	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
	@Column(name = "teller_id")
	private String tellerId;

	@Basic(optional = false)
	@Column(name = "teller_address")
	private String tellerAddress;

	@Basic(optional = false)
	@Column(name = "latitude")
	private String latitude;

	@Basic(optional = false)
	@Column(name = "longitude")
	private String longitude;

	@Column(name = "serial")
	private String serial;

	@Column(name = "contract_no")
	private String contractNo;

	@Column(name = "tel_teller_address")
	private String telTellerAddress;

	@Column(name = "branch")
	private String branch;

	@Column(name = "gprs_company")
	private String gprsCompany;

	@OneToOne(mappedBy = "district_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private District district;

	@OneToOne(mappedBy = "version_teller_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private VersionTeller versionTeller;

	@OneToOne(mappedBy = "type_address_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private TypeAddress typeAddress;

	@OneToOne(mappedBy = "teller_details_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private TellerDetails tellerDetails;

	public Teller() {
		super();
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tellerId != null ? tellerId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Teller)) {
			return false;
		}
		Teller other = (Teller) object;
		if ((this.tellerId == null && other.tellerId != null)
				|| (this.tellerId != null && !this.tellerId.equals(other.tellerId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Teller [tellerId=" + tellerId + ", tellerAddress=" + tellerAddress + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", serial=" + serial + ", contractNo=" + contractNo
				+ ", telTellerAddress=" + telTellerAddress + ", branch=" + branch + ", gprsCompany=" + gprsCompany
				+ ", district=" + district + ", versionTeller=" + versionTeller + ", typeAddress=" + typeAddress
				+ ", tellerDetails=" + tellerDetails + "]";
	}

}
