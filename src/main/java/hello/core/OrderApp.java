package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {


    public static void main(String[] args) {


        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();


        //give
        Member member = new Member(1L, "jinhan", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(member.getId());

        Order order = orderService.createOrder(findMember.getId(), "itemAA", 15000);
        System.out.println("order = " + order);


        //then

    }
}
