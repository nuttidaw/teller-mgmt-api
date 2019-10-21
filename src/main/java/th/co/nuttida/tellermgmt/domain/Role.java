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
@Table(name = "role")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private Integer roleId;

	
	@Column(name = "role_name")
	private String roleName;

	public Role() {
	}

	public Role(Integer roleId) {
		this.roleId = roleId;
	}

	public Role(Integer roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (roleId != null ? roleId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Role)) {
			return false;
		}
		Role other = (Role) object;
		if ((this.roleId == null && other.roleId != null)
				|| (this.roleId != null && !this.roleId.equals(other.roleId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + "]";
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}