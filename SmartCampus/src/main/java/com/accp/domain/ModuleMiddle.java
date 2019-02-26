package com.accp.domain;

import java.util.List;

public class ModuleMiddle {
    private Integer mrId;

    private Integer moduleId;

    private Integer roleId;

    private Integer moduleZt;

    private Integer delete_id;
    
    public List<Module> list1;
    
	public List<Module> getList1() {
		return list1;
	}

	public void setList1(List<Module> list1) {
		this.list1 = list1;
	}

	public Integer getMrId() {
		return mrId;
	}

	public void setMrId(Integer mrId) {
		this.mrId = mrId;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getModuleZt() {
		return moduleZt;
	}

	public void setModuleZt(Integer moduleZt) {
		this.moduleZt = moduleZt;
	}

	public Integer getDelete_id() {
		return delete_id;
	}

	public void setDelete_id(Integer delete_id) {
		this.delete_id = delete_id;
	}
}