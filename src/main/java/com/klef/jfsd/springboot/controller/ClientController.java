package com.klef.jfsd.springboot.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Course;
import com.klef.jfsd.springboot.model.CourseAllocation;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.model.Schedule;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.model.Trainer;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.FacultyService;
import com.klef.jfsd.springboot.service.StudentService;
import com.klef.jfsd.springboot.service.TrainerService;

@Controller
public class ClientController
{
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private FacultyService facultyService;
	
	@Autowired
	private TrainerService trainerService;
	
	
	
	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
		ModelAndView mv = new ModelAndView("adminlogin");
			
		return mv;
	}
	@GetMapping("/adminlogout")
	public ModelAndView adminlogoutdemo()
	{
		ModelAndView mv = new ModelAndView("adminlogin");
		
		return mv;
	}
	@GetMapping("/counav")
	public ModelAndView admincoursedemo()
	{
		List<Course> courselist=adminService.viewallCourses();
		   ModelAndView mv=new ModelAndView("counav");

		   mv.addObject("courselist",courselist);
		   
		return mv;
	}
	@GetMapping("/courseallocation")
	public ModelAndView admincourseallocationdemo()
	{
		List<Course> courselist=adminService.viewallCourses();
		 List<Trainer> trainerlist=adminService.viewallTrainer();
		 ModelAndView mv = new ModelAndView("courseallocation");
		 mv.addObject("courselist",courselist);
		   mv.addObject("trainerlist",trainerlist);
		
		return mv;
	}
	@PostMapping("/allocatecourse")
	public String allocatecourse(HttpServletRequest request)
	{
		int tid=Integer.parseInt(request.getParameter("trainer_id"));
		int cid=Integer.parseInt(request.getParameter("course_id"));
		System.out.println(tid+","+cid);
		CourseAllocation ca = new CourseAllocation();
		ca.setCourse_id(cid);
		ca.setTrainer_id(tid);
		adminService.allocatecourse(ca);
		return "redirect:courseallocation";
	}
	
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv = new ModelAndView("adminhome");
		long fcount = adminService.facultycount();
		long scount = adminService.studentcount();
		long tcount = adminService.trainercount();
		long ccount = adminService.coursecount();
		mv.addObject("fcount",fcount);
		mv.addObject("scount", scount);
		mv.addObject("tcount", tcount);
		mv.addObject("ccount", ccount);
		return mv;
	}
	@GetMapping("/profile")
	public ModelAndView adminprofiledemo()
	{
		ModelAndView mv = new ModelAndView("profile");
			
		List<Trainer> tralist = adminService.viewallTrainer();
		mv.addObject("tralist",tralist);
		
		return mv;
	}
	@GetMapping("/stunav")
	public ModelAndView adminstudemo()
	{
		ModelAndView mv = new ModelAndView("stunav");
		List<Student> stulist = adminService.viewallstudents();
		mv.addObject("stulist",stulist);
		return mv;
	}
	@GetMapping("/tranav")
	public ModelAndView admintrademo()
	{
		ModelAndView mv = new ModelAndView("tranav");
		

		List<Trainer> tralist = adminService.viewallTrainer();
		mv.addObject("tralist",tralist);
		return mv;
	}
	@GetMapping("/facnav")
	public ModelAndView adminfacdemo()
	{
		ModelAndView mv = new ModelAndView("facnav");
		List<Faculty> faclist = adminService.viewallfaculty();
		mv.addObject("faclist",faclist);
		return mv;
	}
	
	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String auname = request.getParameter("auname");
		String apwd = request.getParameter("apwd");
		long fcount = adminService.facultycount();
		long scount = adminService.studentcount();
		long tcount = adminService.trainercount();
		long ccount = adminService.coursecount();
		mv.addObject("fcount",fcount);
		mv.addObject("scount", scount);
		mv.addObject("tcount", tcount);
		mv.addObject("ccount", ccount);
		Admin admin = adminService.checkadminlogin(auname, apwd);
		
		if(admin!=null)
		{
			
			HttpSession session = request.getSession();
			
			session.setAttribute("auname", auname);
			
			mv.setViewName("adminhome");
		}
		else
		{
			mv.setViewName("adminlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	@GetMapping("/studentreg")
	public ModelAndView studentregdemo()
	{
		ModelAndView mv = new ModelAndView("stureg", "stu",new Student());
		return mv;
	}
	@PostMapping("/addstudent")
	public String addstudentdemo(@ModelAttribute("stu") Student student)
	{
		studentService.addstudent(student);
		return "redirect:stunav";
	}
	@GetMapping("/coursereg")
	public ModelAndView courseregdemo()
	{
		ModelAndView mv = new ModelAndView("courseregistration", "course",new Course());
		return mv;
	}
	@PostMapping("/addcourse")
	public String addcoursedemo(@ModelAttribute("course") Course course)
	{
		adminService.addCourse(course);
		return "redirect:counav";
	}
	@GetMapping("/studentlogin")
	public ModelAndView studentlogindemo()
	{
		ModelAndView mv = new ModelAndView("studentlogin");
		
		return mv;
	}
	@PostMapping("/checkstudentlogin")
	public ModelAndView checkstudentlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String suname = request.getParameter("suname");
		String spwd = request.getParameter("spwd");
		
		Student student = studentService.checkstudentlogin(suname, spwd);
		
		if(student!=null)
		{
			
			HttpSession session = request.getSession();
			
			session.setAttribute("suname", suname);
			
			mv.setViewName("studenthome");
		}
		else
		{
			mv.setViewName("studentlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}

	@GetMapping("/facultyreg")
	public ModelAndView facultyregdemo()
	{
		ModelAndView mv = new ModelAndView("facreg", "fac",new Faculty());
		return mv;
	}
	@PostMapping("/addfaculty")
	public String addfacultydemo(@ModelAttribute("fac") Faculty faculty)
	{
		facultyService.addfaculty(faculty);
		return "redirect:facnav";
	}
	@GetMapping("/trainerreg")
	public ModelAndView trainerregdemo()
	{
		ModelAndView mv = new ModelAndView("trareg", "tra",new Trainer());
		return mv;
	}
	@PostMapping("/addtrainer")
	public String addtrainerdemo(@ModelAttribute("tra") Trainer trainer)
	{
		trainerService.addtrainer(trainer);
		return "redirect:tranav";
	}
	@GetMapping("/facultylogin")
	public ModelAndView facultylogindemo()
	{
		ModelAndView mv = new ModelAndView("facultylogin");
		
		return mv;
	}
	@PostMapping("/checkfacultylogin")
	public ModelAndView checkfacultylogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String funame = request.getParameter("funame");
		String fpwd = request.getParameter("fpwd");
		
		Faculty faculty = facultyService.checkfacultylogin(funame, fpwd);
		
		if(faculty!=null)
		{
			
			HttpSession session = request.getSession();
			
			session.setAttribute("funame", funame);
			
			mv.setViewName("facultyhome");
		}
		else
		{
			mv.setViewName("facultylogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	@GetMapping("/trainerlogin")
	public ModelAndView trainerlogindemo()
	{
		ModelAndView mv = new ModelAndView("trainerlogin");
		
		return mv;
	}
	@PostMapping("/checktrainerlogin")
	public ModelAndView checktrainerlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String tuname = request.getParameter("tuname");
		String tpwd = request.getParameter("tpwd");
		
		Trainer trainer = trainerService.checktrainerlogin(tuname, tpwd);
		
		if(trainer!=null)
		{
			
			HttpSession session = request.getSession();
			
			session.setAttribute("tuname", tuname);
			
			mv.setViewName("trainerhome");
		}
		else
		{
			mv.setViewName("trainerlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	@GetMapping("/admincpwd")
	public ModelAndView echangepwd(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String auname = (String) session.getAttribute("auname");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admincpwd");
		mv.addObject("auname",auname);
		
		return mv;
	}
	
	@PostMapping("/updateadminpwd")
	public ModelAndView updateemppwddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("profile");
		
		HttpSession session = request.getSession();
		
		String auname = (String) session.getAttribute("auname");
		
		String aoldpwd = request.getParameter("aopwd");
		String anewpwd = request.getParameter("anpwd");
		
		int n = adminService.changeadminpassword(aoldpwd, anewpwd, auname);
		
		if(n > 0)
		{
			
			mv.addObject("msg","Password Updated Successfully");
		}
		else
		{
			mv.addObject("msg","Old Password is Incorrect");
		}
		
		return mv;
	}
	@GetMapping("/viewallstu")
	public ModelAndView viewallstudemo()
	{
		ModelAndView mv = new ModelAndView("viewallstudents");
		
		List<Student> stulist = adminService.viewallstudents();
		mv.addObject("stulist",stulist);
		
		return mv;
	}
	@GetMapping("/viewallfac")
	public ModelAndView viewallfacdemo()
	{
		ModelAndView mv = new ModelAndView("viewallfaculty");
		
		List<Faculty> faclist = adminService.viewallfaculty();
		mv.addObject("faclist",faclist);
		
		return mv;
	}
	@GetMapping("/viewalltra")
	public ModelAndView viewalltrademo()
	{
		ModelAndView mv = new ModelAndView("viewalltrainer");
		
		List<Trainer> tralist = adminService.viewallTrainer();
		mv.addObject("tralist",tralist);
		
		return mv;
	}
	@GetMapping("/studenthome")
	public ModelAndView studenthomedemo()
	{
		ModelAndView mv = new ModelAndView("studenthome");
		
		return mv;
	}
	@GetMapping("/studentlogout")
	public ModelAndView studentlogoutdemo()
	{
		ModelAndView mv = new ModelAndView("studentlogin");
		
		return mv;
	}
	@GetMapping("/facultyhome")
	public ModelAndView facultyhomedemo()
	{
		ModelAndView mv = new ModelAndView("facultyhome");
		
		return mv;
	}
	@GetMapping("/facultylogout")
	public ModelAndView facultylogoutdemo()
	{
		ModelAndView mv = new ModelAndView("facultylogin");
		
		return mv;
	}
	@GetMapping("/trainerhome")
	public ModelAndView trainerhomedemo()
	{
		ModelAndView mv = new ModelAndView("trainerhome");
		
		return mv;
	}
	@GetMapping("/trainerlogout")
	public ModelAndView trainerlogoutdemo()
	{
		ModelAndView mv = new ModelAndView("trainerlogin");
		
		return mv;
	}
	@GetMapping("/deletestu")
	public String deletestudemo(@RequestParam("id") int eid)
	{
		adminService.deletestudent(eid);
		
		return "redirect:stunav";
	}
	
	@GetMapping("/viewstu")
	public ModelAndView viewemp(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String suname = (String) session.getAttribute("suname");
		
		Student stu =  studentService.viewstudent(suname);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewstudent");
		mv.addObject("stu",stu);
		
		return mv;
	}
	@GetMapping("/viewstubyid")
	public ModelAndView viewempbyiddemo(@RequestParam("id") int sid)
	{
		Student stu = adminService.viewstudentbyid(sid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewstudent");
		mv.addObject("stu",stu);
		
		return mv;
	}
	@GetMapping("/studentcpwd")
	public ModelAndView schangepwd(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String suname = (String) session.getAttribute("suname");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentcpwd");
		mv.addObject("suname",suname);
		
		return mv;
	}
	
	@PostMapping("/updatestudentpwd")
	public ModelAndView updatestudentpwddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentcpwd");
		
		HttpSession session = request.getSession();
		
		String suname = (String) session.getAttribute("suname");
		
		String soldpwd = request.getParameter("sopwd");
		String snewpwd = request.getParameter("snpwd");
		
		int n = studentService.changestudentpassword(soldpwd, snewpwd, suname);
		
		if(n > 0)
		{
			
			mv.addObject("msg","Password Updated Successfully");
		}
		else
		{
			mv.addObject("msg","Old Password is Incorrect");
		}
		
		return mv;
	}
	@GetMapping("/facultycpwd")
	public ModelAndView fchangepwd(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String funame = (String) session.getAttribute("funame");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("facultycpwd");
		mv.addObject("funame",funame);
		
		return mv;
	}
	
	@PostMapping("/updatefacultypwd")
	public ModelAndView updatefacultypwddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("facultycpwd");
		
		HttpSession session = request.getSession();
		
		String funame = (String) session.getAttribute("funame");
		
		String foldpwd = request.getParameter("fopwd");
		String fnewpwd = request.getParameter("fnpwd");
		
		int n = facultyService.changefacultypassword(foldpwd, fnewpwd, funame);
		
		if(n > 0)
		{
			
			mv.addObject("msg","Password Updated Successfully");
		}
		else
		{
			mv.addObject("msg","Old Password is Incorrect");
		}
		
		return mv;
	}
	@GetMapping("/deletefac")
	public String deletefacdemo(@RequestParam("id") int fid)
	{
		adminService.deletefaculty(fid);
		
		return "redirect:facnav";
	}
	
	@GetMapping("/viewfac")
	public ModelAndView viewfac(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String funame = (String) session.getAttribute("funame");
		
		Faculty fac =  facultyService.viewfaculty(funame);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewfaculty");
		mv.addObject("fac",fac);
		
		return mv;
	}
	@GetMapping("/viewfacbyid")
	public ModelAndView viewfacbyiddemo(@RequestParam("id") int fid)
	{
		Faculty fac = adminService.viewfacultybyid(fid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewfaculty");
		mv.addObject("fac",fac);
		
		return mv;
	}
	@GetMapping("/trainercpwd")
	public ModelAndView tchangepwd(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String tuname = (String) session.getAttribute("tuname");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("trainercpwd");
		mv.addObject("tuname",tuname);
		
		return mv;
	}
	
	@PostMapping("/updatetrainerpwd")
	public ModelAndView updatetrainerpwddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("trainercpwd");
		
		HttpSession session = request.getSession();
		
		String tuname = (String) session.getAttribute("tuname");
		
		String toldpwd = request.getParameter("topwd");
		String tnewpwd = request.getParameter("tnpwd");
		
		int n = trainerService.changetrainerpassword(toldpwd, tnewpwd, tuname);
		
		if(n > 0)
		{
			
			mv.addObject("msg","Password Updated Successfully");
		}
		else
		{
			mv.addObject("msg","Old Password is Incorrect");
		}
		
		return mv;
	}
	@GetMapping("/deletetra")
	public String deletetrademo(@RequestParam("id") int tid)
	{
		adminService.deletetrainer(tid);
		
		return "redirect:tranav";
	}
	
	@GetMapping("/viewtra")
	public ModelAndView viewtra(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String tuname = (String) session.getAttribute("tuname");
		
		Trainer tra =  trainerService.viewtrainer(tuname);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewtrainer");
		mv.addObject("tra",tra);
		
		return mv;
	}
	@GetMapping("/viewtrabyid")
	public ModelAndView viewtrabyiddemo(@RequestParam("id") int tid)
	{
		Trainer tra = adminService.viewtrainerbyid(tid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewtrainer");
		mv.addObject("tra",tra);
		
		return mv;
	}

	
	@GetMapping("/viewtracourse")
	public ModelAndView viewtrabyyiddemo(HttpServletRequest request)
	{
        HttpSession session = request.getSession();
        ModelAndView mv = new ModelAndView();
		String tuname = (String) session.getAttribute("tuname");
		Trainer tra = adminService.viewbyuname(tuname);
		int tid = tra.getId();
		System.out.println(tid);
		
        CourseAllocation ca = adminService.viewcoursebyid(tid);
        int cid = ca.getCourse_id();
		Course course = adminService.viewcoursesbyid(cid);
		mv.setViewName("viewtracourse");
		mv.addObject("c",course);
		mv.addObject("tid", tra);
		return mv;
	}
	
	@GetMapping("/addschedule")
	public ModelAndView scheduledemo(@RequestParam("id") int cid,@RequestParam("tid") int tid)
	{
		
		ModelAndView mv = new ModelAndView("traschedule", "sch",new Schedule());
		mv.addObject("cid", cid);
		mv.addObject("tid", tid);
		return mv;
	}
	@PostMapping("/submitschedule")
	public String adsscheduledemo(@ModelAttribute("sch") Schedule schedule)
	{
		trainerService.addSchedule(schedule);
		return "redirect:viewtracourse";
	}
	@GetMapping("/viewschedule")
	public ModelAndView viewschedules(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String tuname = (String) session.getAttribute("tuname");
		Trainer tra = adminService.viewbyuname(tuname);
		int tid = tra.getId();
		
		Schedule sch = trainerService.viewSchedule(tid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewcoursesch");
		mv.addObject("sch",sch);
		
		return mv;
	}

}
