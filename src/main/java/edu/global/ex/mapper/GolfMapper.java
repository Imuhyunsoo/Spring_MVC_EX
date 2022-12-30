package edu.global.ex.mapper;

import edu.global.ex.vo.GolfVO.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GolfMapper {

    List<TeacherVO> getTeacherList();
    List<MemberVO> getMemberList();
    List<SalesVO> getSalesList();

    List<ApplyVO> getApplyData();

    void insert(ClassVO classVO);
    void update(ClassVO classVO);
}
