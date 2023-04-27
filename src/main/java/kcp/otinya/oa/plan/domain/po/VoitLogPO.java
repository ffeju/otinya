package kcp.otinya.oa.plan.domain.po;

import kcp.otinya.oa.common.BasePO;

import java.time.LocalDateTime;

/**
 * 投票日志（该记录并不是存粹记录，最后一次记录可能发生变更）
 */
public class VoitLogPO extends BasePO {

    private String id;

    private String plantId;

    private String serialNumber;

    private String userId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Integer priority;

    /**
     * 当系统自动计算时可发现的最优时间段.
     */
    private Boolean best;

}
