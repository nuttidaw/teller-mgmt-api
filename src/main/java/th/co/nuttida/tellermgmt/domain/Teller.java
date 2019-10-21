package th.co.nuttida.tellermgmt.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "teller")
public class Teller implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teller_id")
	private Integer tellerId;

	@Column(name = "teller_no")
	private String tellerNo;

	@Column(name = "teller_address")
	private String tellerAddress;

	@Column(name = "latitude")
	private String latitude;

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

	@Column(name = "district_id")
	private int districtId;

	@Column(name = "version_teller_id")
	private int versionTellerId;

	@Column(name = "type_address_id")
	private int typeAddressId;

	@Column(name = "teller_details_id")
	private int tellerDetailsId;

	// @OneToOne(mappedBy = "district_id", cascade = CascadeType.ALL, fetch =
	// FetchType.EAGER)
	// private District district;
	//
	// @OneToOne(mappedBy = "version_teller_id", cascade = CascadeType.ALL,
	// fetch = FetchType.EAGER)
	// private VersionTeller versionTeller;
	//
	// @OneToOne(mappedBy = "type_address_id", cascade = CascadeType.ALL, fetch
	// = FetchType.EAGER)
	// private TypeAddress typeAddress;
	//
	// @OneToOne(mappedBy = "teller_details_id", cascade = CascadeType.ALL,
	// fetch = FetchType.EAGER)
	// private TellerDetails tellerDetails;

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
				+ ", districtId=" + districtId + ", versionTellerId=" + versionTellerId + ", typeAddressId="
				+ typeAddressId + ", tellerDetailsId=" + tellerDetailsId + "]";
	}

	public Integer getTellerId() {
		return tellerId;
	}

	public void setTellerId(Integer tellerId) {
		this.tellerId = tellerId;
	}

	public String getTellerAddress() {
		return tellerAddress;
	}

	public void setTellerAddress(String tellerAddress) {
		this.tellerAddress = tellerAddress;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getTelTellerAddress() {
		return telTellerAddress;
	}

	public void setTelTellerAddress(String telTellerAddress) {
		this.telTellerAddress = telTellerAddress;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getGprsCompany() {
		return gprsCompany;
	}

	public void setGprsCompany(String gprsCompany) {
		this.gprsCompany = gprsCompany;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getVersionTellerId() {
		return versionTellerId;
	}

	public void setVersionTellerId(int versionTellerId) {
		this.versionTellerId = versionTellerId;
	}

	public int getTypeAddressId() {
		return typeAddressId;
	}

	public void setTypeAddressId(int typeAddressId) {
		this.typeAddressId = typeAddressId;
	}

	public int getTellerDetailsId() {
		return tellerDetailsId;
	}

	public void setTellerDetailsId(int tellerDetailsId) {
		this.tellerDetailsId = tellerDetailsId;
	}

}
