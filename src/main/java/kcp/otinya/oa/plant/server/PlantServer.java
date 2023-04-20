package kcp.otinya.oa.plant.server;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import kcp.otinya.oa.plant.domain.dto.PlantDTO;
import kcp.otinya.oa.plant.domain.po.PlantPO;
import kcp.otinya.oa.plant.domain.vo.PlantVO;
import kcp.otinya.oa.plant.server.service.PlantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 计划服务层
 */
@Service
public class PlantServer {

    @Autowired
    private PlantService plantService;

    /**
     * 新增计划.
     *
     * @param plant 计划信息
     */
    public void addPlant(PlantDTO plant){
        PlantPO plantPO = new PlantPO();
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
    public PlantDTO queryPlantById(String id) throws Exception {
        LambdaQueryWrapper<PlantPO> query = new LambdaQueryWrapper<>();
        query.eq(PlantPO::getId,id);
        List<PlantPO> poResult = plantService.list(query);
        if(CollectionUtils.isEmpty(poResult) || poResult.size() != 1)
            throw new Exception("palnt query error,mutil info for an id!");
        PlantDTO result = new PlantDTO();
        BeanUtils.copyProperties(poResult.get(0),result);
        return result;
    }


    /**
     * 分页查询
     *
     * @param plantVO
     * @return
     */
    public PlantVO queryPage(PlantVO plantVO){
        LambdaQueryWrapper<PlantPO> query = new LambdaQueryWrapper<>();
        if(StringUtils.isNotBlank(plantVO.getNameFuzzy()))
            query.like(PlantPO::getName,"%"+plantVO.getNameFuzzy()+"%");
        return plantService.page(plantVO,query);
    }

}
