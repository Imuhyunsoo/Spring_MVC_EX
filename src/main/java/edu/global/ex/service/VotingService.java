package edu.global.ex.service;

import edu.global.ex.vo.VotingVO.CandidateVO;
import edu.global.ex.vo.VotingVO.RankVO;
import edu.global.ex.vo.VotingVO.VoterVO;
import edu.global.ex.vo.VotingVO.VotingVO;

import java.util.List;

public interface VotingService {

    List<CandidateVO> candidateList();

    List<VoterVO> voterList();

    List<RankVO> ranking();

    List<String> candidateNum();

    void addVoter(VotingVO votingVO);
}
