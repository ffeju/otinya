package kcp.otinya.oa.plan.server.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import kcp.otinya.oa.plan.domain.po.PlanPO;
import kcp.otinya.oa.plan.mapper.PlanMapper;
import org.springframework.stereotype.Component;

@Component
public class PlanService extends ServiceImpl<PlanMapper, PlanPO> {
}
