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
@Table(name = "district")
public class District implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "district_id")
	private Integer districtId;

	@Column(name = "district_name_thai")
	private String districtNameThai;

	@Column(name = "district_name_eng")
	private String districtNameEng;

	@Column(name = "province_id")
	private Integer provinceId;

	@Column(name = "zone_id")
	private Integer zoneId;

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

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getDistrictNameThai() {
		return districtNameThai;
	}

	public void setDistrictNameThai(String districtNameThai) {
		this.districtNameThai = districtNameThai;
	}

	public String getDistrictNameEng() {
		return districtNameEng;
	}

	public void setDistrictNameEng(String districtNameEng) {
		this.districtNameEng = districtNameEng;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public int getZoneId() {
		return zoneId;
	}

	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}

	@Override
	public String toString() {
		return "District [districtId=" + districtId + ", districtNameThai=" + districtNameThai + ", districtNameEng="
				+ districtNameEng + ", provinceId=" + provinceId + ", zoneId=" + zoneId + "]";
	}

}
