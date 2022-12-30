package edu.global.ex.mapper.controller;

import edu.global.ex.service.GolfService;
import edu.global.ex.vo.GolfVO.ClassVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/golf")
public class GolfController {

    @Autowired
    private GolfService golfService;

    @GetMapping("/")
    public String index() {

        log.info("index() ..");

        return "golf/index";
    }

    @GetMapping("/teacher")
    public String teacher(Model model) {

        log.info("teacher() ..");

        model.addAttribute("teachers", golfService.teacherList());

        return "golf/teacher";
    }

    @GetMapping("/member")
    public String member(Model model) {

        log.info("member() ..");

        model.addAttribute("members", golfService.memberList());

        return "golf/member";
    }

    @GetMapping("/sales")
    public String sales(Model model) {

        log.info("sales() ..");

        model.addAttribute("salesList", golfService.salesList());

        return "golf/sales";
    }

    @GetMapping("/applyform")
    public String applyform(Model model) {

        log.info("applyform() ..");

        model.addAttribute("list", golfService.applyData());

        return "golf/applyform";
    }

    @PostMapping("/apply")
    public String apply(ClassVO classVO) {

        log.info("register() ..");

        golfService.register(classVO);

        return "redirect:/";
    }
}
