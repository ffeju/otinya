package kcp.otinya.oa.plant.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import kcp.otinya.oa.plant.domain.dto.PlantDTO;
import kcp.otinya.oa.plant.domain.vo.PlantVO;
import kcp.otinya.oa.plant.server.PlantServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plant")
@Tag(name = "计划控制层",description = "计划事项的控制层接口")
public class PlantController {

    @Autowired
    private PlantServer plantServer;

    /**
     * 新增
     */
    @PostMapping
    @Operation(summary = "新增计划")
    public void add(@RequestBody PlantDTO plant){
        plantServer.addPlant(plant);
    }

    /**
     * 删除
     */
    @DeleteMapping
    @Operation(summary = "删除计划")
    public void remove(@RequestParam String id){

    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @Operation(summary = "更新计划概要")
    public void update(@RequestBody PlantDTO plantDTO){

    }

    /**
     * 查询
     */
    @PostMapping("/page")
    @Operation(summary = "分页查询计划")
    public PlantVO queryPage(@RequestBody PlantVO plant){
        return plantServer.queryPage(plant);
    }

}
