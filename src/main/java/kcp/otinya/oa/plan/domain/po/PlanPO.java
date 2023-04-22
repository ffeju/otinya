package kcp.otinya.oa.plan.domain.po;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;


/**
 * 计划表
 */
@Data
@Accessors(chain = true)
@TableName("PLAN")
public class PlanPO {

    @Getter
    @AllArgsConstructor
    public static enum STATUS{
        ERROR(0,"异常"),
        NORMAL(1,"正常"),
        OFF(2,"停用");
        @EnumValue
        private Integer code;
        private String desc;
    }

    /**
     * 主键id
     */
    @TableId(value = "ID",type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 名称
     */
    @TableField(value = "NAME")
    private String name;

    /**
     * 创建时间
     */
    @JsonFormat(timezone="GTM+8",pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    @TableField(value = "CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    @JsonFormat(timezone="GTM+8",pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    @TableField(value = "MODIFY_TIME")
    private LocalDateTime modifyTime;

    /**
     * 创建人id
     */
    @TableField(value = "CREATER_ID")
    private String createrId;

    /**
     * 修改人id
     */
    @TableField(value = "MODIFIER_ID")
    private String modifierId;

    /**
     * 是否为测试数据状态
     */
    @TableField(value = "IS_TEST")
    private Boolean isTest;

    /**
     * 计划状态
     */
    @TableField(value = "STATUS")
    private STATUS status;

}
