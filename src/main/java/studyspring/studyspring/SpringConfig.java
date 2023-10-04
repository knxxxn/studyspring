package studyspring.studyspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import studyspring.studyspring.repository.MemberRepository;
import studyspring.studyspring.repository.MemoryMemberRepository;
import studyspring.studyspring.service.MemberService;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository()); //memberRepository 사용
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
