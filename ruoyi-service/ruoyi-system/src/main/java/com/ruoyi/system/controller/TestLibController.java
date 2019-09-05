package com.ruoyi.system.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.log.annotation.OperLog;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.system.domain.SysRole;
import com.ruoyi.system.domain.TestLib;
import com.ruoyi.system.service.ISysRoleService;
import com.ruoyi.system.service.ITestLibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 角色 提供者 在這裡
 * 
 * @author zmr
 * @date 2019-05-20
 */
@RestController
@RequestMapping("testLib")
public class TestLibController extends BaseController
{
    @Autowired
    private ITestLibService testLibService;

    /**
     * 查询角色
     */
    @GetMapping("get/{evaluationId}")
    public R get(@PathVariable("evaluationId") Long evaluationId)
    {
        return R.ok().put("rows",testLibService.selectLibByEvalId(evaluationId));
    }

    /**
     * 查询角色列表
     *//*
    @GetMapping("list")
    public R list(SysRole sysRole)
    {
        startPage();
        return result(sysRoleService.selectRoleList(sysRole));
    }

    @GetMapping("all")
    public R all()
    {
        return R.ok().put("rows", sysRoleService.selectRoleAll());
    }

    *//**
     * 新增保存角色
     *//*
    @PostMapping("save")
    @OperLog(title = "角色管理", businessType = BusinessType.INSERT)
    public R addSave(@RequestBody SysRole sysRole)
    {
        return toAjax(sysRoleService.insertRole(sysRole));
    }

    *//**
     * 修改保存角色
     *//*
    @OperLog(title = "角色管理", businessType = BusinessType.UPDATE)
    @PostMapping("update")
    public R editSave(@RequestBody SysRole sysRole)
    {
        return toAjax(sysRoleService.updateRole(sysRole));
    }

    *//**
     * 修改保存角色
     *//*
    @OperLog(title = "角色管理", businessType = BusinessType.UPDATE)
    @PostMapping("status")
    public R status(@RequestBody SysRole sysRole)
    {
        return toAjax(sysRoleService.changeStatus(sysRole));
    }

    *//**
     * 删除角色
     * @throws Exception 
     *//*
    @OperLog(title = "角色管理", businessType = BusinessType.DELETE)
    @PostMapping("remove")
    public R remove(String ids) throws Exception
    {
        return toAjax(sysRoleService.deleteRoleByIds(ids));
    }*/
}
