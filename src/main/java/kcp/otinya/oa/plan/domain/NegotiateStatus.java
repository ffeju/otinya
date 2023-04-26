package kcp.otinya.oa.plan.domain;


import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 协商状态
 */
@Getter
@AllArgsConstructor
public enum NegotiateStatus {
    ERROR(0,"异常"),
    DRAFT(1,"无投票"),
    VOTE(1,"发起投票"),
    NEGOTIATE(2,"协商中"),
    RESOLUTION(3,"表决通过");

    @EnumValue
    private int code;
    private String desc;
}
