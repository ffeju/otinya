package kcp.otinya.oa.plant.server.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import kcp.otinya.oa.plant.domain.po.PlantPO;
import kcp.otinya.oa.plant.mapper.PlantMapper;
import org.springframework.stereotype.Component;

@Component
public class PlantService extends ServiceImpl<PlantMapper, PlantPO> {
}
