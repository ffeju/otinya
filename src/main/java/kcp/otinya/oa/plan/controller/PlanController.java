package kcp.otinya.oa.plan.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kcp.otinya.oa.plan.domain.dto.PlanDTO;
import kcp.otinya.oa.plan.domain.vo.PlanVO;
import kcp.otinya.oa.plan.server.PlanServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plant")
@Tag(name = "计划控制层",description = "计划事项的控制层接口")
public class PlanController {

    @Autowired
    private PlanServer plantServer;

    /**
     * 新增
     */
    @PostMapping
    @Operation(summary = "新增计划")
    public void add(@RequestBody PlanDTO plant){
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
    public void update(@RequestBody PlanDTO plantDTO){

    }

    /**
     * 查询
     */
    @PostMapping("/page")
    @Operation(summary = "分页查询计划")
    public PlanVO queryPage(@RequestBody PlanVO plant){
        return plantServer.queryPage(plant);
    }

}
