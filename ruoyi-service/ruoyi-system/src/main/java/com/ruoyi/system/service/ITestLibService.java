package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysRole;
import com.ruoyi.system.domain.SysUserRole;
import com.ruoyi.system.domain.TestLib;

import java.util.List;
import java.util.Set;

/**
 * 角色业务层
 * 
 * @author ruoyi
 */
public interface ITestLibService
{
    public List<TestLib> selectLibByEvalId(Long evaluationId);
}
