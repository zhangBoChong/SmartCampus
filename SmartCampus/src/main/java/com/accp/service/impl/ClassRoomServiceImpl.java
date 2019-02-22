package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Classroom;
import com.accp.domain.Floor;
import com.accp.mapper.ClassroomMapper;
import com.accp.mapper.FloorMapper;
import com.accp.service.ClassRoomService;

@Service
@Transactional
public class ClassRoomServiceImpl implements ClassRoomService{
	@Autowired
	FloorMapper fmapper;
	@Autowired
	ClassroomMapper crmapper;
	
	@Override
	public List<Floor> floorall() {
		return fmapper.floorall();
	}
	@Override
	public Floor maxfloornumber() {
		return fmapper.maxfloornumber();
	}
	@Override
	public int floornumberinsert(Floor f) {
		return fmapper.floornumberinsert(f);
	}
	@Override
	public List<Classroom> classroominfo(Classroom r) {
		//查询教室信息
		System.out.println("impl-status-"+r.getStatus());
		List<Classroom> list=crmapper.classroominfo(r);
		for (Classroom c : list) {
			System.out.println(c.getClassroomname()+"--"+c.getStatus());
		}
		return list;
	}
	@Override
	public Classroom classroomnameEndByfid(Integer floorid) {
		// 根据楼层id查询该层最末一间教室名
		//根据楼层id查询教室数量
		int nub=crmapper.classroomnubByfid(floorid);
		if(nub<25) {
			Classroom room=crmapper.classroomnameEndByfid(floorid);
			if(room!=null) {
				int rname=Integer.parseInt(room.getClassroomname())+1;
				//System.out.println("教室名："+room.getClassroomname()+"--"+rname);
				room.setClassroomname(rname+"");
			}
			return room;
		}
		return null;
	}
	@Override
	public int classroominsert(Classroom record) {
		//教室新增
		return crmapper.classroominsert(record);
	}
	
	public int classroomeadd(Integer reviewnub,Integer machinenub,Integer croomnub,Integer fid) {
		//新增楼层同时新增多个教室  //Floor f=this.maxfloornumber();
		Floor fl=fmapper.floornubifexist(fid);
		if(fl==null) {
			Floor floor=new Floor();
			floor.setFloornumber(this.maxfloornumber().getFloornumber());
			int jg=this.floornumberinsert(floor);//楼层新增
			//System.out.println("-楼层新增jg-"+jg);
			fid=floor.getFloorid();
		}
		//System.out.println("楼层id:"+fid);
		//System.out.println("-自习室-"+reviewnub+"-机房-"+machinenub+"-教室-"+croomnub);
		String n="";
		int result=0;
		if(croomnub==null) {
			croomnub=0;
		}
		if(machinenub==null) {
			machinenub=0;
		}
		if(reviewnub==null) {
			reviewnub=0;
		}
		if(croomnub!=null) {
			for (int i = 0; i < croomnub; i++) {
				if((i+1)<10) {
					n="0";
				}
				int rxz1=this.classroominsert(new Classroom(fid+n+(i+1),fid,1));
				result+=rxz1;
			}
		}
		if(machinenub!=null) {
			for (int i = 0; i < machinenub; i++) {
				if((i+1+croomnub)<10) {
					n="0";
				}
				int rxz2=this.classroominsert(new Classroom(fid+n+(i+1+croomnub),fid,2));
				result+=rxz2;
			}
		}
		if(reviewnub!=null) {
			for (int i = 0; i < reviewnub; i++) {
				if((i+1+machinenub+croomnub)<10) {
					n="0";
				}
				int rxz3=this.classroominsert(new Classroom(fid+n+(i+1+machinenub+croomnub),fid,0));
				result+=rxz3;
			}
		}
		System.out.println("多个教室新增结果："+result);
		return result;
	}
	
	
	
	
}
