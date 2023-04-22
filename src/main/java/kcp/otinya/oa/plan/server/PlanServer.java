package kcp.otinya.oa.plan.server;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import kcp.otinya.oa.plan.domain.dto.PlanDTO;
import kcp.otinya.oa.plan.domain.po.PlanPO;
import kcp.otinya.oa.plan.domain.vo.PlanVO;
import kcp.otinya.oa.plan.server.service.PlanService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 计划服务层
 */
@Service
public class PlanServer {

    @Autowired
    private PlanService plantService;

    /**
     * 新增计划.
     *
     * @param plant 计划信息
     */
    public void addPlant(PlanDTO plant){
        PlanPO plantPO = new PlanPO();
        BeanUtils.copyProperties(plant,plantPO);
        plantService.save(plantPO);
    }

    /**
     *
     * 通过id查询数据.
     *
     * @param id 计划id
     * @return 计划概要信息
     * @throws Exception 当数据异常时抛出
     */
    public PlanDTO queryPlantById(String id) throws Exception {
        LambdaQueryWrapper<PlanPO> query = new LambdaQueryWrapper<>();
        query.eq(PlanPO::getId,id);
        List<PlanPO> poResult = plantService.list(query);
        if(CollectionUtils.isEmpty(poResult) || poResult.size() != 1)
            throw new Exception("palnt query error,mutil info for an id!");
        PlanDTO result = new PlanDTO();
        BeanUtils.copyProperties(poResult.get(0),result);
        return result;
    }


    /**
     * 分页查询
     *
     * @param plantVO
     * @return
     */
    public PlanVO queryPage(PlanVO plantVO){
        LambdaQueryWrapper<PlanPO> query = new LambdaQueryWrapper<>();
        if(StringUtils.isNotBlank(plantVO.getNameFuzzy()))
            query.like(PlanPO::getName,"%"+plantVO.getNameFuzzy()+"%");
        return plantService.page(plantVO,query);
    }

}
