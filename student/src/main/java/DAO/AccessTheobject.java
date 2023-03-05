package DAO;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.StudentTable;

public class AccessTheobject {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void insert(StudentTable s)
	{
		et.begin();
		em.persist(s);
		et.commit();
	}
	
	
	public String hob (String[] s)
	{
		String str="";
		
		for (int i = 0; i < s.length; i++) {
			if(i<s.length-1)
			str=str+s[i]+" " ;
			
			else
				str=str+s[i];
			
		}
		
		return str;
		
	}
	
	public int age(Date dob)
	{
		LocalDate current= LocalDate.now();
		LocalDate d=dob.toLocalDate();
		Period age1= Period.between(d, current);
		return age1.getYears();
		
	}

}
