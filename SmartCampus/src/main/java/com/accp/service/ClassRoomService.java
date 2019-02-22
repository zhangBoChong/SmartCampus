package com.accp.service;

import java.util.List;

import com.accp.domain.Classroom;
import com.accp.domain.Floor;

public interface ClassRoomService {
	public List<Floor> floorall();
	public Floor maxfloornumber();
	public int floornumberinsert(Floor record);
	public List<Classroom> classroominfo(Classroom record);
	public Classroom classroomnameEndByfid(Integer floorid);
	//int classroomnubByfid(Integer floorid);
	int classroominsert(Classroom record);
	public int classroomeadd(Integer reviewnub,Integer machinenub,Integer croomnub,Integer fid);
}
