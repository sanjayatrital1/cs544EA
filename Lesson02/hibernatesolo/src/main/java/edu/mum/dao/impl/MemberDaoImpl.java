package edu.mum.dao.impl;


import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import edu.mum.dao.MemberDao;
import edu.mum.domain.Member;


@Repository
public class MemberDaoImpl extends GenericDaoImpl<Member> implements MemberDao {

    public MemberDaoImpl() {
        super.setDaoType(Member.class);
    }

    public Member findByMemberNumber(Integer number) {

        Query query = sessionFactory.getCurrentSession().createQuery("SELECT m from Member m where m.memberNumber =:number");
        return (Member) query.setParameter("number", number).uniqueResult();


    }


}