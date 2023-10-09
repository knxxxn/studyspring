package studyspring.studyspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import studyspring.studyspring.repository.JdbcMemberRepository;
import studyspring.studyspring.repository.MemberRepository;
import studyspring.studyspring.repository.MemoryMemberRepository;
import studyspring.studyspring.service.MemberService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository()); //memberRepository 사용
    }

    @Bean
    public MemberRepository memberRepository() {

        return new JdbcMemberRepository(dataSource);
    }
}
