package edu.global.ex.service;

import edu.global.ex.mapper.GolfMapper;
import edu.global.ex.vo.GolfVO.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class GolfServiceImpl implements GolfService {

    @Autowired
    private GolfMapper golfMapper;

    @Override
    public List<TeacherVO> teacherList() {

        log.info("teacherList() ..");

        return golfMapper.getTeacherList();
    }

    @Override
    public List<MemberVO> memberList() {

        log.info("memberList() ..");

        return golfMapper.getMemberList();
    }

    @Override
    public List<SalesVO> salesList() {

        log.info("salesList() ..");

        return golfMapper.getSalesList();
    }

    @Override
    public List<ApplyVO> applyData() {

        log.info("applyData() ..");

        return golfMapper.getApplyData();
    }

    @Override
    public void register(ClassVO classVO) {

        log.info("register() ..");

        golfMapper.insert(classVO);
        golfMapper.update(classVO);

    }
}
