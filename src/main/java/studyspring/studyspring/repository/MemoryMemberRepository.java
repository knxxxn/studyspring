package studyspring.studyspring.repository;

import studyspring.studyspring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L; //키값 생성

    @Override
    public Member save(Member member) { //어디에 저장될지
        member.setId(++sequence); //시퀀스 추가
        store.put(member.getId(), member); //store에 넣기
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) { //store에서 꺼내오기
        return Optional.ofNullable(store.get(id)); //값이 없을 때 null로 반환
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny(); //map에서 이름 찾기 없으면 null 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());

    }

    public void clearStore() {
        store.clear();
    }

}
