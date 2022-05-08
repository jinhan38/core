package hello.core.order;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberMemoryRepository;
import hello.core.member.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    @DisplayName("orderServiceImpleTest")
    void createOrder(){
        MemberRepository memberRepository = new MemberMemoryRepository();
        memberRepository.save(new Member(1L,"jinhan", Grade.VIP));
        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "aaa", 10000);
        System.out.println("order = " + order);

    }
    
}