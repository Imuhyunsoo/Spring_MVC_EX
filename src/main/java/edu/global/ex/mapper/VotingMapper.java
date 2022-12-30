package edu.global.ex.mapper;

import edu.global.ex.vo.VotingVO.CandidateVO;
import edu.global.ex.vo.VotingVO.RankVO;
import edu.global.ex.vo.VotingVO.VoterVO;
import edu.global.ex.vo.VotingVO.VotingVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VotingMapper {

    List<CandidateVO> getCandidateList();

    List<VoterVO> getVoterList();

    List<RankVO> getRanking();

    List<String> getCandidateNum();

    void insertVote(VotingVO votingVO);
}
