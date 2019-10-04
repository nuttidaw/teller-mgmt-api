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
@Table(name = "district")
public class District implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "district_id")
	private Integer districtId;

	@Basic(optional = false)
	@Column(name = "district_name_thai")
	private String districtNameThai;

	@Basic(optional = false)
	@Column(name = "district_name_eng")
	private String districtNameEng;

	@OneToOne(mappedBy = "province", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Province province;

	@OneToOne(mappedBy = "zone", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Zone zone;

	public District() {
		super();
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (districtId != null ? districtId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof District)) {
			return false;
		}
		District other = (District) object;
		if ((this.districtId == null && other.districtId != null)
				|| (this.districtId != null && !this.districtId.equals(other.districtId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "District [districtId=" + districtId + ", districtNameThai=" + districtNameThai + ", districtNameEng="
				+ districtNameEng + ", province=" + province + ", zone=" + zone + "]";
	}

}
