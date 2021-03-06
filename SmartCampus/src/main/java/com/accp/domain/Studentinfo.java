package com.accp.domain;

import java.util.List;

public class Studentinfo {
    
    private Character character;
    
    private Integer status2;
    
    private Integer sid;

    private String sname;

    private Integer sex;

    private String phone;

    private String address;

    private Integer pid;

    private String education;

    private Integer characterid;

    private String snumber;

    private Integer status;

    private String headimg;
    
    private ClazzStudent clazzStudent;

    private Integer age;
    private Integer choice;
    

    public ClazzStudent getClazzStudent() {
		return clazzStudent;
	}

	public void setClazzStudent(ClazzStudent clazzStudent) {
		this.clazzStudent = clazzStudent;
	}

	public Integer getChoice() {
		return choice;
	}

	public void setChoice(Integer choice) {
		this.choice = choice;
	}

    
	private Parents pobj;
	
	private List<ClazzStudent> clsobj;
	
	private List<Havetask> examlist; 


	public Studentinfo() {
		super();
	}

	public Studentinfo(Integer sid, String sname, Integer sex, String phone, String address, Integer pid,
			String education, Integer characterid, String snumber, Integer status, String headimg, Integer age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.pid = pid;
		this.education = education;
		this.characterid = characterid;
		this.snumber = snumber;
		this.status = status;
		this.headimg = headimg;
		this.age = age;
	}

	public List<Havetask> getExamlist() {
		return examlist;
	}

	public void setExamlist(List<Havetask> examlist) {
		this.examlist = examlist;
	}

	public List<ClazzStudent> getClsobj() {
		return clsobj;
	}

	public void setClsobj(List<ClazzStudent> clsobj) {
		this.clsobj = clsobj;
	}

	public Parents getPobj() {
		return pobj;
	}

	public void setPobj(Parents pobj) {
		this.pobj = pobj;
	}

	public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Integer getCharacterid() {
        return characterid;
    }

    public void setCharacterid(Integer characterid) {
        this.characterid = characterid;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }
    
    public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Integer getStatus2() {
		return status2;
	}

	public void setStatus2(Integer status2) {
		this.status2 = status2;
	}
	
	
}