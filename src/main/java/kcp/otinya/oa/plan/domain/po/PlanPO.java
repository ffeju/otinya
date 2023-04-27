package kcp.otinya.oa.plan.domain.po;

import com.baomidou.mybatisplus.annotation.*;
import kcp.otinya.oa.common.BasePO;
import kcp.otinya.oa.plan.domain.PlanStatus;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 计划表
 */
@Data
@Accessors(chain = true)
@TableName("PLAN")
public class PlanPO extends BasePO {

    /**
     * 主键id
     */
    @TableId(value = "ID",type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 父计划id，无父计划则为-1
     */
    @TableField(value = "PID")
    private String PId;

    /**
     * 名称
     */
    @TableField(value = "NAME")
    private String name;

    /**
     * 描述
     */
    @TableField(value = "DESC")
    private String desc;

    /**
     * 预计开始时间
     */
    @TableField(value = "ESTIMATE_START_TIME")
    private LocalDateTime estimateStartTime;

    /**
     * 预计结束时间
     */
    @TableField(value = "ESTIMATE_END_TIME")
    private LocalDateTime estimateEndTime;

    /**
     * 实际结束时间
     */
    @TableField(value = "END_TIME")
    private LocalDateTime endTime;

    /**
     * 是否超期
     */
    @TableField(value = "OVERDUE")
    private Boolean overdue;

    /**
     * 是否是多人模式
     */
    @TableField(value = "MULTI_PLAYER")
    private Boolean Multiplayer;

    /**
     * 决策超时时间
     */
    @TableField(value = "DECISION_TIME_OUT")
    private LocalDateTime decisionTimeOut;

    /**
     * 是否互斥模式
     */
    @TableField(value = "MUTUALLY_EXCLUSIVE")
    private Boolean mutuallyExclusive;

    /**
     * 计划状态
     */
    @TableField(value = "STATUS")
    private PlanStatus status;

}
