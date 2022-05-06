package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용돼야 한다")
    void vip_o() {
        //given
        Member member = new Member(1L, "jinhan", Grade.VIP);
        //when
        int discount = rateDiscountPolicy.discount(member, 10000);
        System.out.println("discount = " + discount);

        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인을 적용하면 안된다.")
    void vip_x() {
        //given
        Member member = new Member(2L, "jinhan2", Grade.BASIC);
        //when
        int discount = rateDiscountPolicy.discount(member, 10000);
        System.out.println("discount = " + discount);

        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }
}