package com.ruoyi.docManager.service;

import java.util.List;
import com.ruoyi.docManager.domain.DocManager;

/**
 * 公文签收Service接口
 * 
 * @author kafka
 * @date 2022-11-23
 */
public interface IDocManagerService 
{
    /**
     * 查询公文签收
     * 
     * @param id 公文签收主键
     * @return 公文签收
     */
    public DocManager selectDocManagerById(Long id);

    /**
     * 查询公文签收列表
     * 
     * @param docManager 公文签收
     * @return 公文签收集合
     */
    public List<DocManager> selectDocManagerList(DocManager docManager);

    /**
     * 新增公文签收
     * 
     * @param docManager 公文签收
     * @return 结果
     */
    public int insertDocManager(DocManager docManager);

    /**
     * 修改公文签收
     * 
     * @param docManager 公文签收
     * @return 结果
     */
    public int updateDocManager(DocManager docManager);

    /**
     * 批量删除公文签收
     * 
     * @param ids 需要删除的公文签收主键集合
     * @return 结果
     */
    public int deleteDocManagerByIds(String ids);

    /**
     * 删除公文签收信息
     * 
     * @param id 公文签收主键
     * @return 结果
     */
    public int deleteDocManagerById(Long id);
}
