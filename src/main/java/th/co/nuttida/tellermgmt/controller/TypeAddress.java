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
@Table(name = "type_address")
public class TypeAddress implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_address_id")
	private Integer typeAddressId;

	@Basic(optional = false)
	@Column(name = "type_address_name")
	private String typeAddressName;

	public TypeAddress() {
	}

	public TypeAddress(Integer TypeAddressId) {
		this.typeAddressId = TypeAddressId;
	}

	public TypeAddress(Integer TypeAddressId, String TypeAddressName) {
		this.typeAddressId = TypeAddressId;
		this.typeAddressName = TypeAddressName;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeAddressId != null ? typeAddressId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof TypeAddress)) {
			return false;
		}
		TypeAddress other = (TypeAddress) object;
		if ((this.typeAddressId == null && other.typeAddressId != null)
				|| (this.typeAddressId != null && !this.typeAddressId.equals(other.typeAddressId))) {
			return false;
		}
		return true;
	}

}
