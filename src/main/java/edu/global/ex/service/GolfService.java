package edu.global.ex.service;

import edu.global.ex.vo.GolfVO.*;

import java.util.List;

public interface GolfService {

    List<TeacherVO> teacherList();
    List<MemberVO> memberList();
    List<SalesVO> salesList();
    List<ApplyVO> applyData();

    void register(ClassVO classVO);
}
