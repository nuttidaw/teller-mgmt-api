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
@Table(name = "province")
public class Province implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "province_id")
	private Integer provinceId;

	@Column(name = "province_name_thai")
	private String provinceNameThai;

	@Column(name = "province_name_eng")
	private String provinceNameEng;

	public Province() {
	}

	public Province(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public Province(Integer provinceId, String provinceNameThai, String provinceNameEng) {
		this.provinceId = provinceId;
		this.provinceNameThai = provinceNameThai;
		this.provinceNameEng = provinceNameEng;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (provinceId != null ? provinceId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Province)) {
			return false;
		}
		Province other = (Province) object;
		if ((this.provinceId == null && other.provinceId != null)
				|| (this.provinceId != null && !this.provinceId.equals(other.provinceId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Province [provinceId=" + provinceId + ", provinceNameThai=" + provinceNameThai + ", provinceNameEng="
				+ provinceNameEng + "]";
	}

}