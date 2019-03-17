package com.xworkz.web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.web.dto.RecipeDTO;

public class RecipeDAO {

	public RecipeDAO() {
		System.out.println("created........." + this.getClass().getSimpleName());
	}

	public boolean save(RecipeDTO dto) {
		System.out.println("invoked sava()..........." + dto);
		Boolean flag = true;
		Configuration config = null;
		SessionFactory sf = null;
		Session session = null;
		Transaction tx = null;

		try {
			config = new Configuration();
			config.configure();
			sf = config.buildSessionFactory();
			session = sf.openSession();
			session.save(dto);
			tx = session.beginTransaction();
			tx.commit();
			return flag = true;

		} catch (Exception e) {
			System.err.println("created exception.....");
			e.printStackTrace();
		} finally {
			session.close();
			sf.close();
		}
		return flag = false;

	}

	public RecipeDTO getById(int id) {
		System.out.println("invoked............ getById() with args:\t" + id);

		SessionFactory sf = null;
		Session session = null;
		try {
			sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			RecipeDTO dto = session.get(RecipeDTO.class, id);
			return dto;
		} catch (Exception e) {
			System.err.println("created exception....." + e.getMessage());
			e.printStackTrace();
		} finally {
			session.close();
			sf.close();
		}
		return null;

	}

	public RecipeDTO deleteById(int id) {
		System.out.println("invoked.............deleteById\t" + id);

		SessionFactory sf = null;
		Session session = null;
		Transaction tx = null;
		try {
			sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			RecipeDTO dto = session.get(RecipeDTO.class, id);
			System.out.println(dto);
			if (dto != null) {
				session.delete(dto);
				tx.commit();
				return dto;
			}

		} catch (Exception e) {
			System.out.println("exception created....");
			e.printStackTrace();
		} finally {
			sf.close();
			session.close();
		}
		return null;
	}

	public RecipeDTO updateById(int id,String name, String types, int price) {
		System.out.println("invoked.............deleteById\t" + id);

		SessionFactory sf = null;
		Session session = null;
		Transaction tx = null;
		try {
			sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			RecipeDTO dto = session.get(RecipeDTO.class, id);
			System.out.println(dto);
			if (dto != null) {
				System.out.println("data updating.............");
				dto.setName(name);
				dto.setTypes(types);
				dto.setPrice(price);
				session.update(dto);
				tx.commit();
				return dto;
			}

		} catch (Exception e) {

			System.out.println("exception created....");
			e.printStackTrace();
		} finally {
			sf.close();
			session.close();
		}
		return null;
	}

}
