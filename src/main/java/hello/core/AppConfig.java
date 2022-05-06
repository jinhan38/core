package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberMemoryRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {


    public MemberService memberService() {
        return new MemberServiceImpl(getMemoryRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(getMemoryRepository(), discountPolicy());
    }

    private MemberMemoryRepository getMemoryRepository() {
        return new MemberMemoryRepository();
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
