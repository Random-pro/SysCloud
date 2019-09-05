package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysRole;
import com.ruoyi.system.domain.TestLib;

import java.util.List;

/**
 * 角色表 数据层
 * 
 * @author ruoyi
 */
public interface TestLibMapper
{
    /**
     * 根据条件分页查询角色数据
     * 
     * @param role 角色信息
     * @return 角色数据集合信息
     */
    public List<TestLib> selectLibByEvalId(Long evaluationId);

}
