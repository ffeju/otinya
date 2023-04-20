package kcp.otinya.oa.plant.domain.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import kcp.otinya.oa.plant.domain.po.PlantPO;
import lombok.Data;

@Data
public class PlantVO extends Page<PlantPO> {

    /**
     * 名称模糊
     */
    String nameFuzzy;

}
