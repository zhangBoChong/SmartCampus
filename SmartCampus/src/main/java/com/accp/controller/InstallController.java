package com.accp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.accp.domain.Affiche;
import com.accp.domain.Authority;
import com.accp.domain.Button;
import com.accp.domain.Buttonmiddle;
import com.accp.domain.Clazz;
import com.accp.domain.ClazzStudent;
import com.accp.domain.Grade;
import com.accp.domain.Img;
import com.accp.domain.ImgChildren;
import com.accp.domain.Login;
import com.accp.domain.Module;
import com.accp.domain.PageBean;
import com.accp.domain.Post;
import com.accp.domain.Role;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;
import com.accp.service.AfficheService;
import com.accp.service.AuthorityService;
import com.accp.service.ButtonService;
import com.accp.service.ButtonmiddleService;
import com.accp.service.ClazzService;
import com.accp.service.ClazzStudentService;
import com.accp.service.GradeService;
import com.accp.service.ImgChildrenService;
import com.accp.service.ImgService;
import com.accp.service.InformationService;
import com.accp.service.LoginService;
import com.accp.service.ModuleMiddleService;
import com.accp.service.ModuleService;
import com.accp.service.PostService;
import com.accp.service.RoleService;
import com.accp.service.StaffService;
import com.accp.service.StudentinfoService;

/**
 * wzr:
 * ddd:ddd为1717班  S1
 * ccc:ccc1716班  S2
 * 111:111 1716班 S2
 * @author Administrator
 *
 */

@Controller
public class InstallController {
	
	@Autowired
	ModuleService moduleService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	ModuleMiddleService moduleMiddleService;
	
	@Autowired
	PostService postService;
	
	@Autowired
	AuthorityService authorityService;
	
	@Autowired
	ClazzService clazzService;
	
	@Autowired
	GradeService gradeService;
	
	@Autowired
	AfficheService afficheService;
	
	@Autowired
	StaffService staffService;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	StudentinfoService studentinfoService;
	
	@Autowired
	ClazzStudentService clazzStudentService;
	
	@Autowired
	ImgService imgService;
	
	@Autowired
	ImgChildrenService imgChildrenService;
	
	@Autowired
	InformationService informationService;
	
	@Autowired
	ButtonService buttonService;
	
	@Autowired
	ButtonmiddleService buttonmiddleService;
	
	
	
	//查询学生在读状态
	@RequestMapping(value="/queryBysidthree",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Studentinfo> queryBysidthree(Integer sid){
		List<Studentinfo> sssss = studentinfoService.queryBysidnnn(sid);
		/*System.out.println(sid);
		System.out.println(sssss);*/
		return sssss;
	}
	
	
	//修改角色的按钮权限(是否禁用)
	@RequestMapping(value="/updatebuttonstatus")
	@ResponseBody
	public int updatebuttonstatus(Integer buttonstatus,Integer brid) {
		//System.out.println(brid);
		int count = buttonmiddleService.updatebuttonstatus(buttonstatus, brid);
		//System.out.println(count);
		return count;
	}
	
	
	//按角色id查询按钮中间表的按钮状态
	@RequestMapping(value="/selectbuttonmiddleone",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Button> selectbuttonmiddleone(Integer roleId) {
		List<Button> buttonList12 = buttonService.selectbuttonmiddleone(roleId);
		return buttonList12;
	}
	
	
	//查询按钮是否禁用
	@RequestMapping(value="/querybuttonmiddle",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Buttonmiddle> querybuttonmiddle(HttpSession session,Integer buttonid){
		Login l67 = (Login)session.getAttribute("u");
		List<Buttonmiddle> ButtonmiddleList1 = buttonmiddleService.querybuttonmiddle(buttonid, l67.getRoleId(), 1);
		if(ButtonmiddleList1==null) {
			buttonmiddleService.insertbuttonmiddle(buttonid, l67.getRoleId(), 1);
		}
		//System.out.println(l67.getRoleId());
		//System.out.println(ButtonmiddleList1);
		if(buttonid==2) {
			List<Buttonmiddle> ButtonmiddleList2 = buttonmiddleService.querybuttonmiddle(buttonid, l67.getRoleId(), 1);
			return ButtonmiddleList2;
		}
		if(buttonid==8) {
			List<Buttonmiddle> ButtonmiddleList8 = buttonmiddleService.querybuttonmiddle(buttonid, l67.getRoleId(), 1);
			return ButtonmiddleList8;
		}
		if(buttonid==10) {
			List<Buttonmiddle> ButtonmiddleList10 = buttonmiddleService.querybuttonmiddle(buttonid, l67.getRoleId(), 1);
			return ButtonmiddleList10;
		}
		if(buttonid==9) {
			List<Buttonmiddle> ButtonmiddleList9 = buttonmiddleService.querybuttonmiddle(buttonid, l67.getRoleId(), 1);
			return ButtonmiddleList9;
		}
		if(buttonid==11) {
			List<Buttonmiddle> ButtonmiddleList11 = buttonmiddleService.querybuttonmiddle(buttonid, l67.getRoleId(), 1);
			return ButtonmiddleList11;
		}
		return ButtonmiddleList1;
	}
	
	
	//查询权限页面的角色选中的按钮权限
	@RequestMapping(value="/querybuttonmiddle1",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Buttonmiddle> querybuttonmiddle1(HttpSession session,Integer buttonid){
		Login l68 = (Login)session.getAttribute("u");
		List<Buttonmiddle> buttonmiddleList3 = buttonmiddleService.querybuttonmiddle(buttonid, l68.getRoleId(), 1);
		//System.out.println(buttonmiddleList3);
		return buttonmiddleList3;
	}
	
	
	//查询所有未删除的按钮
	@RequestMapping(value="/querybutton1",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Button> querybutton1(){
		List<Button> buttonList1 = buttonService.querybutton1(1);
		return buttonList1;
	}
	
	
	//按moduleId查询子级模块
	@RequestMapping(value="/selectbymoduleId",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Module> selectbymoduleId(Integer moduleId) {
		List<Module> modulechilederList = moduleService.selectparentIdbyzero(moduleId);
		return modulechilederList;
	}
	
	
	//查询parentId为0的模块
	@RequestMapping(value="/selectparentIdbyzero",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Module> selectparentIdbyzero(){
		List<Module> parentIdbyzeroList = moduleService.selectparentIdbyzero(0);
		//System.out.println(parentIdbyzeroList);
		return parentIdbyzeroList;
	}
	
	
	//添加职位
	@RequestMapping(value="/insertpost",produces="application/json;charset=UTF-8")
	@ResponseBody
	public int insertpost(@RequestBody List<Post> postName_val) {
		List<Post> postLists = new ArrayList<>();
		for(Post pt :  postName_val) {
			Post ps = new Post();
			ps.setPostName(pt.getPostName());
			postLists.add(ps);
		}
		int count = postService.insertpost(postLists);
		return count;
	}
	
	
	//添加角色
	@RequestMapping(value="/insertrole",produces="application/json;charset=UTF-8")
	@ResponseBody
	public int insertrole(@RequestBody List<Role> roleName_val) {
		/*System.out.println("进");
		System.out.println(roleName_val);*/
		List<Role> roleLists = new ArrayList<>();
		for(Role r:roleName_val) {
			Role rl = new Role();
			rl.setRoleName(r.getRoleName());
			roleLists.add(rl);
		}
		//System.out.println("roleLists:"+roleLists);
		int count = roleService.insertrole(roleLists);
		return count;
	}
	
	//修改学生账户密码
	//修改学生状态
	@RequestMapping(value="/updatestudentpwd",produces="application/json;charset=UTF-8")
	@ResponseBody
	public int updatestudentpwd(String pwd,Integer peopleId,Integer type,Integer status) {
		int count = 0 ;
		count = loginService.updatestudentpwd(pwd, peopleId, type);
		count = studentinfoService.updatestudentstatus(status, peopleId);
		return count;
	}
	
	
	//修改员工表的职位id,任职状态,
	//修改login表(员工)的登录密码
	@RequestMapping(value="/updateuserinformation",produces="application/json;charset=UTF-8")
	@ResponseBody
	public int updateuserinformation(Integer postId,Integer status,Integer tid,String pwd,Integer roleId) {
		int count = 0;
		count = staffService.updatestaff(postId,roleId, status, tid);
		count = loginService.updatestaffpwd(pwd, roleId, tid);
		return count;
	}
	
	
	//查询未读消息
	@RequestMapping("/selectcountinformation_fetch")
	public String selectcountinformation_fetch(Model model) {
		model.addAttribute("countinformation_fetch",informationService.selectcountinformation_fetch());
		//System.out.println(informationService.selectcountinformation_fetch());
		return "nav";
	}
	
	//修改消息状态
	@RequestMapping(value="/updateinformation_fetch",produces="application/json;charset=UTF-8")
	@ResponseBody
	public int updateinformation_fetch(Integer information_id) {
		int count = informationService.updateinformation_fetch(information_id);
		return count;
	}
	
	//查询收到的公告
	@RequestMapping("/selectgonggao")
	@ResponseBody 
	public List<Affiche> selectgonggao(HttpSession session,Model model,Integer id,Date startime,Date endtime,String affiche_title,String affiche_sendee,Integer affiche_id) {
		Login us = (Login)session.getAttribute("u");
		List<Affiche> ffList = null;
		//判断登录人员类型-1为学生
		if(us.getType()==-1) {
			Studentinfo st = studentinfoService.queryBysid(us.getPeopleId());
			ClazzStudent cs1 = clazzStudentService.clazz_studentBysid(st.getSid());
			Clazz cl1 = clazzService.clazzBycid(cs1.getCid());
			if(id==-10 || id==null) {
				ffList = afficheService.cx_Affiche(startime, endtime, affiche_title, cl1.getCname(),affiche_id);
			}else if(id==-20 && id!=null) {
				Grade gr = gradeService.selectBygid(cl1.getBid());
				ffList = afficheService.cx_Affiche(startime, endtime, affiche_title, gr.getGname(),affiche_id);
				//C:\Users\Administrator\AppData\Local\Temp\tomcat-docbase.2512878834254468116.8080\img\wzr\
			}else if(id==-30 && id!=null) {
				ffList = afficheService.cx_Affiche(startime, endtime, affiche_title, "全校公告",affiche_id);
			}
		}
		/*System.out.println(ffList);*/
		return ffList;
	}
	
	//按affiche_id查询公告内容
	@RequestMapping("/gonggao1")
	@ResponseBody
	public List<Affiche> gonggao1(HttpSession session,Model model,Integer id,Date startime,Date endtime,String affiche_title,String affiche_sendee,Integer affiche_id) {
		Login us = (Login)session.getAttribute("u");
		List<Affiche> ssList = null;
		//判断登录人员类型-1为学生
		if(us.getType()==-1) {
			Studentinfo st = studentinfoService.queryBysid(us.getPeopleId());
			ClazzStudent cs1 = clazzStudentService.clazz_studentBysid(st.getSid());
			Clazz cl1 = clazzService.clazzBycid(cs1.getCid());
			if(id==-10) {
				ssList = afficheService.cx_Affiche(startime, endtime, affiche_title, cl1.getCname(),affiche_id);
			}else if(id==-20 && id!=null) {
				Grade gr = gradeService.selectBygid(cl1.getBid());
				ssList = afficheService.cx_Affiche(startime, endtime, affiche_title, gr.getGname(),affiche_id);
				//C:\Users\Administrator\AppData\Local\Temp\tomcat-docbase.2512878834254468116.8080\img\wzr\
			}else if(id==-30 && id!=null) {
				ssList = afficheService.cx_Affiche(startime, endtime, affiche_title, "全校公告",affiche_id);
			}
		}
		/*System.out.println(ssList);
		System.out.println(affiche_id);*/
		return ssList;
	}
	
	
	//查询公告图片
	@RequestMapping("/cxggtu")
	@ResponseBody
	public List<ImgChildren> cxggtu(Integer img_id){
		//System.out.println(img_id);
		List<ImgChildren> imList = null;
		if(img_id != null) {
		Img im = imgService.selectImgid(img_id);
		imList = imgChildrenService.selectImg_children(im.getImg_id());
		}
		//System.out.println(imList);
		return imList;
	}
	
	//按sid查询登录账户信息
	@RequestMapping(value="/querysid1",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Login> querysid1(Integer sid,Integer type){
		List<Login> ssidList = loginService.querypeopleId(sid, type);
		//System.out.println(ssidList);
		return ssidList;
	}
	
	
	@RequestMapping(value="/querypeopleId",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Login> querypeopleId(Integer tid,Integer type){
		List<Login> tidLists = loginService.querypeopleId(tid, type);
		return tidLists;
	}
	
	//按tid查询
	@RequestMapping(value="/queryBytid",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Staff> queryBytid(Integer tid){
		List<Staff> tidList = staffService.queryBytid1(tid);
		return tidList;
	}
	
	//按postId查询职位名称
	@RequestMapping(value="/selectPostId",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Post> selectPostId(Integer postId){
		//System.out.println(postId);
		List<Post> PostList = postService.selectPostId(postId);
		return PostList;
	}
	
	
	//修改职位
	@RequestMapping(value="/updatePost",produces="application/json;charset=UTF-8")
	@ResponseBody
	public int updatePost(Integer postId,String postName){
		int count = postService.updatePost(postName, postId);
		return count;
	}
	
	/**

     * 多文件具体上传时间，主要是使用了MultipartHttpServletRequest和MultipartFile

     * @param request

     * @return
     * method=RequestMethod.POST

     */
    @RequestMapping(value="/batch/upload",produces="application/json;charset=UTF-8") 
    @ResponseBody 
    public String handleFileUpload(HttpSession session,HttpServletRequest request,ImgChildren ic,
    		String affiche_title,String affiche_content,String affiche_sendee){ 
    	Login lll = (Login)session.getAttribute("u");
        List<MultipartFile> files =((MultipartHttpServletRequest)request).getFiles("file");
        MultipartFile file = null;
      /*  BufferedOutputStream stream = null;*/
        FileOutputStream os=null;
        String realPath = request.getSession().getServletContext().getRealPath("img/wzr/");
        File pathFile = new File(realPath);
        if(!pathFile.exists()){
            pathFile.mkdirs(); //目录不存在,则创建目录
        }
        System.out.println("服务器："+realPath);
        String filePaths=realPath;
        int count2=0;
        if(lll.getType()!=-1 && lll.getType()!=-2) {
        	if(affiche_sendee != null) {
		        imgService.inserttp(1);
		        count2 = imgService.selectimg_id1();
        	}else {
            	return "公告接收对象不能为空！";
            }
        }
        for (int i =0; i< files.size(); ++i) { 
            file = files.get(i); 
            if (!file.isEmpty()) { 
            	 int pre = (int) System.currentTimeMillis();
                try { 
                    /*byte[] bytes = file.getBytes(); */
                    /*stream = 
                            new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename()))); 
                    stream.write(bytes);*/
                	
                   /* String filePath = ResourceUtils.getURL("classpath:").getPath() + "img/wzr/";
                    System.out.println("文件路径"+filePath);*/
                	if(lll.getType()!=-1 && lll.getType()!=-2) {
                		//System.out.println("进..................");
                	Long da=new Date(pre).getTime();
                    //拿到输出流，同时重命名上传的文件
                     os = new FileOutputStream(filePaths+"/"+ da+ file.getOriginalFilename());
                    //拿到上传文件的输入流
                    FileInputStream in = (FileInputStream) file.getInputStream();

                    //以写字节的方式写文件
                    int b = 0;
                    while((b=in.read()) != -1){
                        os.write(b);
                    }
                    os.flush();
                    os.close();
                    in.close();
                    /*int finaltime = (int) */System.currentTimeMillis();
                    /*System.out.println(finaltime - pre);*/
                    ic.setImg_id(count2);
                    ic.setDelete_id(1);
                   String imgChildren = da+file.getOriginalFilename();
                   if(affiche_sendee != null) {
                    ic.setImg_path(imgChildren);
                    System.out.println(imgChildren);
                    imgChildrenService.inserttpc(ic);
                    }else {
                    	return "公告接收对象不能为空！";
                    }
                    /*stream.close(); */
                	}
                } catch (Exception e) { 
                    os =  null;
                    return "你上传失败" + i + " =>" + e.getMessage(); 
                } 
            } else { 
                /*return "你上传成功" + i + "张。"; */
            } 
        } 
        if(lll.getType()!=-1 && lll.getType()!=-2) {
        	List<Affiche> afficheList = new ArrayList<>();
        	String[] cnames = affiche_sendee.split(",");
        	for(int t=0;t<cnames.length;t++) {
        		Affiche aff = new Affiche();
		        aff.setImg_id(count2);
		        aff.setDelete_id(1);
		        aff.setU_id(lll.getPeopleId());
		        aff.setAffiche_time(new Date());
		        aff.setAffiche_title(affiche_title);
		        aff.setAffiche_sendee(cnames[t]);
		        aff.setAffiche_content(affiche_content);
		        afficheList.add(aff);
        	}
	        afficheService.insertgg(afficheList);
        }
        if(lll.getType() != -3) {
        	return "您无权限发布";
        }
        return "发布成功"; 
    }
	
	
	//查询公告接收对象
	@RequestMapping(value="/selectgg",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Clazz> selectgg(Integer id) {
		List<Clazz> clzList=null;
		if(id==1) {
			clzList=clazzService.selectClazz();
		}
		return clzList;
	}
	@RequestMapping(value="/selectgg1",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Grade> selectgg1(Integer id) {
		List<Grade> graList=null;
		if(id==2) {
			graList = gradeService.selectGrade();
		}
		return graList;
	}
	@RequestMapping(value="/selectgg2",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Module> selectgg2(Integer id) {
		List<Module> moduleList=null;
		if(id==3) {
			moduleList = moduleService.selectModule();
		}
		return moduleList;
	}
	@RequestMapping(value="/selectgg3",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Authority> selectgg3(Integer id) {
		List<Authority> ttList=null;
		if(id==0) {
			ttList = authorityService.queryAuthority();
		}
		return ttList;
	}
	
	//去nav.html
	@RequestMapping("/toNav")
	public String toNav() {
		return "nav";
	}
	
	//去nav.html
	@RequestMapping("/NewFile")
	public String NewFile() {
		return "NewFile";
	}
	
	//去index.html
	@RequestMapping("/toIndex")
	public String toIndex() {
		return "index";
	}
	
	//去table.html
	@RequestMapping("/toTable")
	public String toTable() {
		return "table";
	}
	
	//去form.html
	@RequestMapping("/toForm")
	public String toForm() {
		return "form";
	}
	
	//去wzr/wzr_draft.html
	@RequestMapping("/towzr_draft")
	public String towzr_draft() {
		return "wzr/wzr_draft";
	}
	
	//去wzr/wzr_information.html
	@RequestMapping("/towzr_information")
	public String towzr_information() {
		return "wzr/wzr_information";
	}
	
	//去wzr/wzr_ListAffiche.html
	@RequestMapping("/towzr_ListAffiche")
	public String towzr_ListAffiche() {
		return "wzr/wzr_ListAffiche";
	}
	
	//去wzr/wzr_manage.html
	@RequestMapping("/towzr_manage")
	public String towzr_manage(HttpSession session) {
		Login l70 = (Login)session.getAttribute("u");
		if(l70.getType()==-3 && l70.getRoleId()==8 || l70.getRoleId()==9) {
			return "wzr/wzr_manage";
		}else {
			return "wzr/quanxian";
		}
	}
	
	//去wzr/wzr_PublishAffiche.html
	@RequestMapping("/towzr_PublishAffiche")
	public String towzr_PublishAffiche(HttpSession session) {
		Login l72 = (Login)session.getAttribute("u");
		if(l72.getType()==-3) {
			return "wzr/wzr_PublishAffiche";
		}else {
			return "wzr/quanxian";
		}
	}
	
	//去wzr/wzr_UserManage.html
	@RequestMapping("/towzr_UserManage")
	public String towzr_UserManage(HttpSession session) {
		Login l71 = (Login)session.getAttribute("u");
		if(l71.getType()==-3) {
			return "wzr/wzr_UserManage";
		}else {
			return "wzr/quanxian";
		}
	}
	
	
	//按roleId查询角色名称
	@RequestMapping(value="/queryByroleId",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Role> queryByroleId(Model model,Integer roleId) {
		/*System.out.println("jin...."+roleId);*/
		List<Role> roleList1 = roleService.queryByroleId(roleId);
		/*System.out.println(roleList1);*/
		return roleList1;
	}
	
	//修改角色
	@RequestMapping(value="/updateRole",produces="application/json;charset=UTF-8")
	@ResponseBody
	public int updateRole(String roleName,Integer roleId) {
		/*System.out.println(roleId);
		System.out.println(roleName);*/
		int count = roleService.updateRole(roleName, roleId);
		return count;
	}
	
	//查询角色下拉框
	@RequestMapping("/queryRole")
	public String queryRole(HttpSession session,Model model) {
		Login l69 = (Login)session.getAttribute("u");
		/*model.addAttribute("roleList", roleService.queryRole());
		model.addAttribute("postList", postService.selectPost());
		model.addAttribute("authorityList", authorityService.queryAuthority());*/
		if(l69.getType()==-3 && l69.getRoleId()==8 || l69.getRoleId()==9) {
			return "wzr/wzr_authority";
		}else {
			return "wzr/quanxian";
		}
	}
	
	
	//查询所有角色
	@RequestMapping(value="/queryRole1",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public List<Role> queryRole1(){
		List<Role> roList = roleService.queryRole();
		return roList;
	}
	
	
	//查询所有角色
	@RequestMapping(value="/selectPost",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public List<Post> selectPost() {
		List<Post> poList = postService.selectPost();
		/*System.out.println(poList);*/
		return poList;
	}
	
	//查询所有权限
	@RequestMapping("/queryAuthority")
	@ResponseBody
	public List<Authority> queryAuthority(){
		List<Authority> authorityList1 = authorityService.queryAuthority();
		/*System.out.println(authorityList1);*/
		return authorityList1;
	}
	
	//分页查询角色表
	@RequestMapping(value = "/rolePage",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public PageBean<Role> rolePage(int page){
		return roleService.rolePage(page);
	}
	
	//删除角色
	@RequestMapping(value = "/deleteRole",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public int deleteRole(Integer roleId) {
		int count = roleService.deleteRole(roleId);
		return count;
	}
	
	
	//分页查询职位表
	@RequestMapping(value="/queryPost",produces="application/json;charset=UTF-8")
	@ResponseBody
	public PageBean<Post> queryPost(int page1){
		return postService.queryPost(page1);
	}
	
	//删除职位
	@RequestMapping(value="/deletePost",produces="application/json;charset=UTF-8")
	@ResponseBody
	public int deletePost(Integer postId) {
		/*System.out.println(postId);*/
		int count = postService.deletePost(postId);
		return count;
	}
	
}
