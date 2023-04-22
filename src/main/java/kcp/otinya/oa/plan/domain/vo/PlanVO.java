package kcp.otinya.oa.plan.domain.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import kcp.otinya.oa.plan.domain.po.PlanPO;
import lombok.Data;

@Data
public class PlanVO extends Page<PlanPO> {

    /**
     * 名称模糊
     */
    String nameFuzzy;

}
