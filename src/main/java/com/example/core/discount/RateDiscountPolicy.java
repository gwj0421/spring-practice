package com.example.core.discount;

import com.example.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RateDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(Member member, int price) {
        return 0;
    }
}
