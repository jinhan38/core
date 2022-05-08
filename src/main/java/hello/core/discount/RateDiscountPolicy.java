package hello.core.discount;


import hello.core.annotation.MainDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Primary는 SpringBean 등록 시 우선권을 갖도록 해준다
//Qualifier는 특정 문자열로 지정한 SpringBean을 등록하도록 해준다.
//@MainDiscountPolicy annotation은 Qualifier를 커스텀으로 만들어준 것
@Component
@Primary
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;


    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
