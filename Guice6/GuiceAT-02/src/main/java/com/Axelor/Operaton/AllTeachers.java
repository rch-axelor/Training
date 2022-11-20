package com.Axelor.Operaton;

import java.util.List;

import javax.persistence.EntityManager;

import com.Axelor.Teachers.Teacher;
import com.google.inject.Inject;
import com.google.inject.persist.Transactional;


public class AllTeachers {

	@Inject
	private EntityManager em;
	
	@Transactional
	public void insert(Teacher t)
	{
		em.persist(t);
	}
	
	@Transactional
	public void updateName(int id, String name)
	{
		Teacher teacher = em.find(Teacher.class, id);
        System.out.println(teacher.getTname());
        teacher.setTname(name);
        em.persist(teacher);
	}
	
	@Transactional
	public void updatesubject(int id, String sub)
	{
		Teacher teacher = em.find(Teacher.class, id);
        System.out.println(teacher.getTname());
        teacher.setTname(sub);
        em.persist(teacher);
	}
	
	@Transactional
	public void delete(int id)
	{
		Teacher teacher = em.find(Teacher.class, id);
        System.out.println(teacher.getTname());
        em.remove(teacher);
	}
	
	@Transactional
	public List<Teacher> read()
	{
       java.util.List<Teacher> l= em.createQuery("select t from teacher t").getResultList();
	return  l;
	}
}
