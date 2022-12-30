package edu.global.ex.service;



import edu.global.ex.vo.ShoppingVO.MemberVO;
import edu.global.ex.vo.ShoppingVO.SalesVO;

import java.util.List;

public interface ShoppingService {

    List<MemberVO> memberList();
    List<SalesVO> salesList();
    String listCustno();
    void addMember(MemberVO memberVO);
    MemberVO content(String custno);

    void crystal(MemberVO memberVO);
}
