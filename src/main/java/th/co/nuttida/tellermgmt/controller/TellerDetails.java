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
@Table(name = "teller_details")
public class TellerDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teller_details_id")
	private Integer tellerDetailsId;

	@Basic(optional = false)
	@Column(name = "ip_address")
	private String ipAddress;

	@Basic(optional = false)
	@Column(name = "ip_gateway")
	private String ipGateway;

	@Basic(optional = false)
	@Column(name = "service_port")
	private String servicePort;

	@Basic(optional = false)
	@Column(name = "local_port")
	private String localPort;

	@Column(name = "index_master_key")
	private String indexMasterKey;

	public TellerDetails() {
	}

	public TellerDetails(Integer tellerDetailsId) {
		this.tellerDetailsId = tellerDetailsId;
	}

	public TellerDetails(Integer tellerDetailsId, String ipAddress, String ipGateway, String servicePort,
			String localPort, String indexMasterKey) {
		this.tellerDetailsId = tellerDetailsId;
		this.ipAddress = ipAddress;
		this.ipGateway = ipGateway;
		this.servicePort = servicePort;
		this.localPort = localPort;
		this.indexMasterKey = indexMasterKey;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tellerDetailsId != null ? tellerDetailsId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof TellerDetails)) {
			return false;
		}
		TellerDetails other = (TellerDetails) object;
		if ((this.tellerDetailsId == null && other.tellerDetailsId != null)
				|| (this.tellerDetailsId != null && !this.tellerDetailsId.equals(other.tellerDetailsId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "TellerDetails [tellerDetailsId=" + tellerDetailsId + ", ipAddress=" + ipAddress + ", ipGateway="
				+ ipGateway + ", servicePort=" + servicePort + ", localPort=" + localPort + ", indexMasterKey="
				+ indexMasterKey + "]";
	}

}
