package com.accp.domain;

import java.util.List;

public class Button {
    private Integer buttonid;

    private String buttonname;

    private Integer deleteid;

    private String buttonreserveone;

    private String buttonreservetwo;
    
    private List<Buttonmiddle> buttonList11;

    public List<Buttonmiddle> getButtonList11() {
		return buttonList11;
	}

	public void setButtonList11(List<Buttonmiddle> buttonList11) {
		this.buttonList11 = buttonList11;
	}

	public Integer getButtonid() {
        return buttonid;
    }

    public void setButtonid(Integer buttonid) {
        this.buttonid = buttonid;
    }

    public String getButtonname() {
        return buttonname;
    }

    public void setButtonname(String buttonname) {
        this.buttonname = buttonname;
    }

    public Integer getDeleteid() {
		return deleteid;
	}

	public void setDeleteid(Integer deleteid) {
		this.deleteid = deleteid;
	}

	public String getButtonreserveone() {
        return buttonreserveone;
    }

    public void setButtonreserveone(String buttonreserveone) {
        this.buttonreserveone = buttonreserveone;
    }

    public String getButtonreservetwo() {
        return buttonreservetwo;
    }

    public void setButtonreservetwo(String buttonreservetwo) {
        this.buttonreservetwo = buttonreservetwo;
    }
}