package com.pixelweb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pixelweb.model.Feedback;

@Component
public class FeedbackDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addFeedback(Feedback fb) {
		System.out.println("in feedback" +fb);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(fb);
	}
	@Transactional
	public List<Feedback> getFeedbacks() {
				
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Feedback");
		List<Feedback> l = (List<Feedback>)q.list();
		System.out.println(l);
		return l;
	}
	@Transactional
	public List<Feedback> getDatas() {
				
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Feedback where name = :name");
		q.setParameter("name", "shresta");
		List<Feedback> l = (List<Feedback>)q.list();
		System.out.println(l);
		return l;
	}
}
