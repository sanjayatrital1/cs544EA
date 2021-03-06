package edu.mum.service.impl;

import java.util.List;

import edu.mum.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.mum.domain.Member;
import edu.mum.repository.MemberRepository;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void save(Member member) {
        memberRepository.save(member);
    }

    public List<Member> findAll() {
        return (List<Member>) memberRepository.findAll();
    }

    public Member findByMemberNumber(Integer memberId) {
        return memberRepository.findByMemberNumber(memberId);
    }


}
