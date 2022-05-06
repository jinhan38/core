package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService ;

    @BeforeEach
    public void beforeEach() {
        memberService = new AppConfig().memberService();
    }
    @Test
    void join() {

        //give
        Member member = new Member(1L, "jinhan", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(member.getId());


        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }

    @Test
    void findMember() {

        //give

        //when

        //then
    }
}