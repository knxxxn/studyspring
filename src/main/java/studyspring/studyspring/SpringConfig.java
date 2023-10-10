package studyspring.studyspring;

import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import studyspring.studyspring.aop.TimeTraceAop;
import studyspring.studyspring.repository.JdbcTemplateMemberRepository;
import studyspring.studyspring.repository.MemberRepository;
import studyspring.studyspring.service.MemberService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    //private final DataSource dataSource;
    //private final EntityManager em;
    //public SpringConfig(DataSource dataSource, EntityManager em) {
        //this.dataSource = dataSource;
        //this.em = em;
    //}
    //@Bean
    //public MemberService memberService() {
        //return new MemberService(memberRepository()); //memberRepository 사용
    //}

    //@Bean
    //public MemberRepository memberRepository() {
        //return new MemoryMemberRespository();

        //return new JdbcMemberRepository(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
    //}


    private final MemberRepository memberRepository;
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    //@Bean
    //public TimeTraceAop(){
        //return new TimeTraceAop();
    //}
}
