package com.ruoyi.docManager.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.docManager.domain.DocManager;
import com.ruoyi.docManager.service.IDocManagerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 公文签收Controller
 * 
 * @author kafka
 * @date 2022-11-23
 */
@Controller
@RequestMapping("/docManager/manager")
public class DocManagerController extends BaseController
{
    private String prefix = "docManager/manager";

    @Autowired
    private IDocManagerService docManagerService;

    @RequiresPermissions("docManager:manager:view")
    @GetMapping()
    public String manager()
    {
        return prefix + "/manager";
    }

    /**
     * 查询公文签收列表
     */
    @RequiresPermissions("docManager:manager:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DocManager docManager)
    {
        startPage();
        List<DocManager> list = docManagerService.selectDocManagerList(docManager);
        System.out.println(list);
        return getDataTable(list);
    }

    /**
     * 导出公文签收列表
     */
    @RequiresPermissions("docManager:manager:export")
    @Log(title = "公文签收", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DocManager docManager)
    {
        List<DocManager> list = docManagerService.selectDocManagerList(docManager);
        ExcelUtil<DocManager> util = new ExcelUtil<DocManager>(DocManager.class);
        return util.exportExcel(list, "公文签收数据");
    }

    /**
     * 新增公文签收
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存公文签收
     */
    @RequiresPermissions("docManager:manager:add")
    @Log(title = "公文签收", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DocManager docManager)
    {
        return toAjax(docManagerService.insertDocManager(docManager));
    }

    /**
     * 修改公文签收
     */
    @RequiresPermissions("docManager:manager:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DocManager docManager = docManagerService.selectDocManagerById(id);
        mmap.put("docManager", docManager);
        return prefix + "/edit";
    }

    /**
     * 修改保存公文签收
     */
    @RequiresPermissions("docManager:manager:edit")
    @Log(title = "公文签收", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DocManager docManager)
    {
        return toAjax(docManagerService.updateDocManager(docManager));
    }

    /**
     * 删除公文签收
     */
    @RequiresPermissions("docManager:manager:remove")
    @Log(title = "公文签收", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(docManagerService.deleteDocManagerByIds(ids));
    }

    /*
    * 转发测试
    *
    * */

    @GetMapping("/sendDoc")
    public String sendDoc(){
        return "ok!";
    }
}
