package kcp.otinya.oa.plan.domain;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 计划状态
 */
@Getter
@AllArgsConstructor
public enum PlanStatus {
    ERROR(0,"异常"),
    DRAFT(1,"草稿"),
    ASSIGNMENT(2,"未分配"),
    REJECT(3,"驳回"),
    SCHEDULE(4,"待排期"),
    TODO(5,"待执行"),
    EXECUTE(6,"执行中"),
    FINISH(7,"执行完成");

    @EnumValue
    private int code;
    private String desc;
}
