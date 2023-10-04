package studyspring.studyspring.controller;

import studyspring.studyspring.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class MemberController {
    private final MemberService memberService;
    //@Autowired private final MemberService memberService; = 필드 주입
    @Autowired
    public MemberController(MemberService memberService) { //생성자 주입
        this.memberService = memberService;
    }
}
