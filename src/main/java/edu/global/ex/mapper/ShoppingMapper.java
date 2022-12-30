package edu.global.ex.mapper;

import edu.global.ex.vo.ShoppingVO.MemberVO;
import edu.global.ex.vo.ShoppingVO.SalesVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingMapper {

    List<MemberVO> getMemberList();
    List<SalesVO> getSalesList();
    String getCustno();
    void insertMember(MemberVO memberVO);

    MemberVO getContent(String custno);

    void updateContent(MemberVO memberVO);
}
