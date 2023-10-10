package studyspring.studyspring.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import studyspring.studyspring.domain.Member;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member,
        Long>, MemberRepository  {
    Optional<Member> findByName(String name);


}
