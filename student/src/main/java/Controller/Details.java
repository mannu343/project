package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AccessTheobject;
import DTO.StudentTable;

@WebServlet("/save")
public class Details extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long smob=Long.parseLong(req.getParameter("mob"));
		String sname=req.getParameter("name");
		Date sdob=Date.valueOf(req.getParameter("dob"));
		String sads=req.getParameter("ads");
		String scon=req.getParameter("contry");
		String sgen=req.getParameter("gen");
		String[] shob=req.getParameterValues("hobies");
		
		StudentTable sc=new StudentTable();
		AccessTheobject ac= new AccessTheobject();
		
		PrintWriter out= resp.getWriter();
		
		
		sc.setS_mob(smob);
		sc.setS_name(sname);
		sc.setS_dob(sdob);
		sc.setS_adress(sads);
		sc.setS_Contry(scon);
		sc.setS_gender(sgen);
		sc.setS_hobies(ac.hob(shob));
		
		ac.insert(sc);
		
		out.print("inserted\n");
		out.print("Age="+ac.age(sdob));
		
		
		
	}

}
