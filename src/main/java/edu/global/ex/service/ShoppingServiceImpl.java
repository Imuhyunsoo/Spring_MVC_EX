package edu.global.ex.service;

import edu.global.ex.mapper.ShoppingMapper;
import edu.global.ex.vo.ShoppingVO.MemberVO;
import edu.global.ex.vo.ShoppingVO.SalesVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    private ShoppingMapper shoppingMapper;

    @Override
    public List<MemberVO> memberList() {

        log.info("memberList() ..");

        return shoppingMapper.getMemberList();
    }

    @Override
    public List<SalesVO> salesList() {

        log.info("salesList() ..");

        return shoppingMapper.getSalesList();
    }

    @Override
    public String listCustno() {

        log.info("listCustno() ..");

        return shoppingMapper.getCustno();
    }

    @Override
    public void addMember(MemberVO memberVO) {

        log.info("addMember");

        shoppingMapper.insertMember(memberVO);
    }

    @Override
    public MemberVO content(String custno) {

        log.info("content() ..");

        return shoppingMapper.getContent(custno);
    }

    @Override
    public void crystal(MemberVO memberVO) {

        log.info("crystal() ..");

        shoppingMapper.updateContent(memberVO);
    }
}
