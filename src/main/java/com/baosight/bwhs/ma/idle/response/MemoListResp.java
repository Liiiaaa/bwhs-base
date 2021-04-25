package com.baosight.bwhs.ma.idle.response;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel
@Data
public class MemoListResp {
    /**
     * 已办
     */

    Page<MemoResp> memoDid;
    /**
     * 未办
     */
    Page<MemoResp> memoUndid;
}
