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
@Table(name = "branch_teller")
public class BrandTeller implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brand_teller_id")
	private Integer brandTellerId;

	@Basic(optional = false)
	@Column(name = "brand_teller_name")
	private String brandTellerName;

	public BrandTeller() {
	}

	public BrandTeller(Integer brandTellerId) {
		this.brandTellerId = brandTellerId;
	}

	public BrandTeller(Integer brandTellerId, String brandTellerName) {
		this.brandTellerId = brandTellerId;
		this.brandTellerName = brandTellerName;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (brandTellerId != null ? brandTellerId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof BrandTeller)) {
			return false;
		}
		BrandTeller other = (BrandTeller) object;
		if ((this.brandTellerId == null && other.brandTellerId != null)
				|| (this.brandTellerId != null && !this.brandTellerId.equals(other.brandTellerId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "BrandTeller [brandTellerId=" + brandTellerId + ", brandTellerName=" + brandTellerName + "]";
	}

}
