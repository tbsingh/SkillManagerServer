package com.tssa.smp.domain.repo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tssa.smp.domain.hibernate.QuestionCategory;
import com.tssa.smp.domain.hibernate.QuestionExt;
import com.tssa.smp.domain.hibernate.QuestionType;
import com.tssa.smp.util.QType;

public class HibernateQuestionRepository extends HibernateDaoSupport implements QuestionRepository {

	@SuppressWarnings("unchecked")
	@Override
	public List<QuestionExt> getQuestionList() {
		//return getHibernateTemplate().findByNamedQuery("question.listAll");
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from QuestionExt");
		return query.list();
	}

	@Override
	public List<QuestionCategory> getQuestionCategories() {
		//return getHibernateTemplate().findByNamedQuery("question.category.listAll");
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from QuestionCategory");
		return query.list();
	}

	@Override
	public QuestionExt getQuestion(int qNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionType> getQuestionTypes() {
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from QuestionType");
		return query.list();
	}

	@Override
	public List<Integer> getQuestionIds(String qtype) {
		//Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(QuestionExt.class);
		//Projection projection =Projections.projectionList().add(Projections.property("id"), "id");
		//criteria.setProjection(projection);
		//criteria.setResultTransformer(Transformers.aliasToBean(QuestionExt.class));
		String hql = "SELECT qq.qNo FROM QuestionExt as qq " +
					 "JOIN qq.questionType as qt WHERE qt.name = :qtype";
		List result = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql).setParameter("qtype", qtype).list();
		return result;
	}
	@Override
	public List getQuestion(String qtype, String qNo) {
		String hql = "FROM QuestionExt as qq " +
					 "JOIN qq.questionType as qt WHERE qt.name = :qtype AND qq.qNo = :qNo";
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter("qtype", qtype);
		query.setParameter("qNo", Integer.parseInt(qNo));
		List list = query.list();
		return list;
	}

	@Override
	public List getQuestionCategory(String cid) {
		String hql = "FROM QuestionCategory as qc " +
		 			 "WHERE qc.id = :cid";
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter("cid", Long.parseLong(cid));
		List list = query.list();
		return list;
	}

}
