package kcp.otinya.oa.plan.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kcp.otinya.oa.plan.domain.dto.PlanDTO;
import kcp.otinya.oa.plan.domain.vo.PlanVO;
import kcp.otinya.oa.plan.domain.vo.PlanVoitRequestVO;
import kcp.otinya.oa.plan.server.PlanServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plant")
@Tag(name = "计划控制层",description = "计划事项的控制层接口")
public class PlanController {

    @Autowired
    private PlanServer plantServer;

    /**
     * 新增计划.
     */
    @PostMapping
    @Operation(summary = "新增计划")
    public String add(@RequestBody PlanDTO plant){
        plantServer.addPlant(plant);
    }

    /**
     * 根据id删除计划.
     */
    @DeleteMapping
    @Operation(summary = "删除计划")
    public void remove(@RequestParam String id){

    }

    /**
     * 根据id修改计划.
     */
    @PostMapping("/update")
    @Operation(summary = "更新计划概要")
    public void update(@RequestBody PlanDTO plantDTO){

    }

    /**
     * 根据条件分页查询计划.
     */
    @PostMapping("/page")
    @Operation(summary = "分页查询计划")
    public PlanVO queryPage(@RequestBody PlanVO plant){
        return plantServer.queryPage(plant);
    }

    /**
     *
     * 通过pid查询直接下级计划.
     *
     * @param pId
     * @return
     */
    public List<PlanVO> queryByPid(@RequestParam String pId){

    }

    /**
     *
     * 向其他人指派计划.
     *
     * @param assignUserIdS
     * @param planId
     */
    public void assignPlan(List<String> assignUserIdS,String planId){

    }

    /**
     *
     * 向任务添加合作者.
     *
     * @param partnerIdS
     */
    public void addPartner(List<String> partnerIdS){

    }

    /**
     *
     * 计划投票.
     *
     * 每当进入一轮表决阶段时返回变更失败，否则可以重复进入该方法，相当于update
     *
     * @param planId
     * @param voitInfo
     */
    public void plantScheduleVoit(String planId, List<PlanVoitRequestVO> voitInfo){

    }

}
