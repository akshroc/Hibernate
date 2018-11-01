package org.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.dto.ApplicationDTO;
import org.hibernate.util.HibernateUtil;

public class ApplicationDAO {

	private SessionFactory factory = HibernateUtil.getSession();

	public void saveData(ApplicationDTO dto) {
		Transaction transaction = null;
		try (Session session = factory.openSession();) {
			transaction = session.beginTransaction();
			session.save(dto);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	public ApplicationDTO getById(int primaryKey) {
		ApplicationDTO applicationDTO = null;
		try (Session session = factory.openSession();) {
			applicationDTO = session.get(ApplicationDTO.class, new Integer(primaryKey));
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return applicationDTO;
	}

	public void updateById(String appName, long phoneNum, int primaryKey) {
		ApplicationDTO dto = null;
		Transaction transaction = null;
		try (Session session = factory.openSession();) {
			transaction = session.beginTransaction();
			dto = session.get(ApplicationDTO.class, new Integer(primaryKey));
			dto.setAppName(appName);
			dto.setPhoneNum(phoneNum);
			session.update(dto);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	public void deleteById(int primaryKey) {
		Transaction transaction = null;
		ApplicationDTO dto = null;
		try (Session session = factory.openSession();) {
			transaction = session.beginTransaction();
			dto = session.get(ApplicationDTO.class, new Integer(primaryKey));
			session.delete(dto);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

}
