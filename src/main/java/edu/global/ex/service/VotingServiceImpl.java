package edu.global.ex.service;

import edu.global.ex.mapper.VotingMapper;
import edu.global.ex.vo.VotingVO.CandidateVO;
import edu.global.ex.vo.VotingVO.RankVO;
import edu.global.ex.vo.VotingVO.VoterVO;
import edu.global.ex.vo.VotingVO.VotingVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class VotingServiceImpl implements VotingService {

    @Autowired
    private VotingMapper votingMapper;

    @Override
    public List<CandidateVO> candidateList() {

        log.info("candidateList() ..");

        return votingMapper.getCandidateList();
    }

    @Override
    public List<VoterVO> voterList() {

        log.info("voterList() ..");

        return votingMapper.getVoterList();
    }

    @Override
    public List<RankVO> ranking() {

        log.info("ranking() ..");

        return votingMapper.getRanking();
    }

    @Override
    public List<String> candidateNum() {

        log.info("candidateNum() ..");

        return votingMapper.getCandidateNum();
    }

    @Override
    public void addVoter(VotingVO votingVO) {

        log.info("addVoter() ..");

        votingMapper.insertVote(votingVO);
    }
}
