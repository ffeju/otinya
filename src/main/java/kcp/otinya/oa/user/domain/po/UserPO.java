package kcp.otinya.oa.user.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import kcp.otinya.oa.common.BasePO;
import lombok.Data;
import lombok.experimental.Accessors;

@TableName("USER")
@Data
@Accessors(chain = true)
public class UserPO extends BasePO {

    @TableId(value = "ID",type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "USER_NAME")
    private String userName;

    @TableId(value = "NICK_NAME")
    private String nickName;

}
