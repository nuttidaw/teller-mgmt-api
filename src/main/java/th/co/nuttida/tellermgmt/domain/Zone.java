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
@Table(name = "zone")
public class Zone implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "zone_id")
	private Integer zoneId;

	@Column(name = "zone_name")
	private String zoneName;

	public Zone() {
	}

	public Zone(Integer zoneId) {
		this.zoneId = zoneId;
	}

	public Zone(Integer zoneId, String zoneName) {
		this.zoneId = zoneId;
		this.zoneName = zoneName;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (zoneId != null ? zoneId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Zone)) {
			return false;
		}
		Zone other = (Zone) object;
		if ((this.zoneId == null && other.zoneId != null)
				|| (this.zoneId != null && !this.zoneId.equals(other.zoneId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Zone [zoneId=" + zoneId + ", zoneName=" + zoneName + "]";
	}

}
