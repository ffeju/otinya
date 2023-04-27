package kcp.otinya.oa.plan.domain.vo;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 计划投票请求对象.
 */
public class PlanVoitRequestVO {

    /**
     * 选举时间段信息
     */
    class VoitPeriod{

        /**
         * 起始时间
         */
        private LocalDateTime startTime;

        /**
         * 结束时间
         */
        private LocalDateTime endTime;

        /**
         * 优先级，当优先级为-1时认为所有优先级平级
         */
        private Integer priority;

    }

    private String planId;

    List<VoitPeriod> periodList;

}
