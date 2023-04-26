package kcp.otinya.oa.common;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class BasePO {
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
}
