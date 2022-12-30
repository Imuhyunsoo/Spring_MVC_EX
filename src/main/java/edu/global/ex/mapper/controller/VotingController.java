package edu.global.ex.mapper.controller;

import edu.global.ex.service.VotingService;
import edu.global.ex.vo.VotingVO.VoterVO;
import edu.global.ex.vo.VotingVO.VotingVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/voting")
public class VotingController {

    @Autowired
    private VotingService votingService;

    @GetMapping("/")
    public String index() {

        log.info("index() ..");

        return "voting/index";
    }

    @GetMapping("list")
    public String list(Model model) {

        log.info("list() ..");

        model.addAttribute("candidateList", votingService.candidateList());

        return "voting/list";
    }

    @GetMapping("/inquiry")
    public String inquiry(Model model) {

        log.info("inquiry");

        model.addAttribute("voterList", votingService.voterList());

        return "voting/inquiry";
    }

    @GetMapping("/rank")
    public String rank(Model model) {

        log.info("rank() ..");

        model.addAttribute("rankList", votingService.ranking());

        return "voting/rank";
    }

    @GetMapping("/voting")
    public String voting(Model model) {

        log.info("voting() ..");

        model.addAttribute("candidateNums", votingService.candidateNum());

        return "voting/voting";
    }

    @PostMapping("/insert")
    public String insert(VotingVO votingVO) {

        log.info("insert() ..");

        votingService.addVoter(votingVO);

        return "redirect:inquiry";
    }
}
