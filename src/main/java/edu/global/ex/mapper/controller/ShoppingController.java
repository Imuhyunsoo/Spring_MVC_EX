package edu.global.ex.mapper.controller;

import edu.global.ex.service.ShoppingService;
import edu.global.ex.vo.ShoppingVO.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/shopping")
public class ShoppingController {

    @Autowired
    private ShoppingService shoppingService;

    @GetMapping("/")
    public String index() {

        log.info("index() ..");

        return "shopping/index";
    }

    @GetMapping("/list")
    public String list(Model model) {

        log.info("list() ..");

        model.addAttribute("members", shoppingService.memberList());

        return "shopping/list";
    }

    @GetMapping("/sales")
    public String sales(Model model) {

        log.info("sales() ..");

        model.addAttribute("salesList", shoppingService.salesList());

        return "shopping/sales";
    }

    @GetMapping("/registration")
    public String registration(Model model) {

        log.info("registration() ..");

        model.addAttribute("custno", shoppingService.listCustno());

        return "shopping/registration";
    }

    @PostMapping("/insert")
    public String insert(MemberVO memberVO) {

        log.info("insert() ..");

        shoppingService.addMember(memberVO);

        return "redirect:list";
    }

    @GetMapping("/content")
    public String content(MemberVO memberVO, Model model) {

        log.info("content() ..");

        String custno = memberVO.getCustno();

        System.out.println(custno);

        model.addAttribute("content", shoppingService.content(custno));

        return "shopping/content";
    }

    @PostMapping("/update")
    public String update(MemberVO memberVO) {

        log.info("update() ..");

        shoppingService.crystal(memberVO);

        return "redirect:list";
    }
}
