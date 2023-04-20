package kcp.otinya.oa.plant.domain.dto;

import kcp.otinya.oa.plant.domain.po.PlantPO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PlantDTO {

    /**
     * 主键id
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * 创建人id
     */
    private String createrId;

    /**
     * 修改人id
     */
    private String modifierId;

    /**
     * 是否为测试数据状态
     */
    private Boolean isTest;

    /**
     * 计划状态
     */
    private PlantPO.STATUS status;

}
