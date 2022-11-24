package com.ruoyi.docManager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.docManager.mapper.DocManagerMapper;
import com.ruoyi.docManager.domain.DocManager;
import com.ruoyi.docManager.service.IDocManagerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 公文签收Service业务层处理
 * 
 * @author kafka
 * @date 2022-11-23
 */
@Service
public class DocManagerServiceImpl implements IDocManagerService 
{
    @Autowired
    private DocManagerMapper docManagerMapper;

    /**
     * 查询公文签收
     * 
     * @param id 公文签收主键
     * @return 公文签收
     */
    @Override
    public DocManager selectDocManagerById(Long id)
    {
        return docManagerMapper.selectDocManagerById(id);
    }

    /**
     * 查询公文签收列表
     * 
     * @param docManager 公文签收
     * @return 公文签收
     */
    @Override
    public List<DocManager> selectDocManagerList(DocManager docManager)
    {
        return docManagerMapper.selectDocManagerList(docManager);
    }

    /**
     * 新增公文签收
     * 
     * @param docManager 公文签收
     * @return 结果
     */
    @Override
    public int insertDocManager(DocManager docManager)
    {
        return docManagerMapper.insertDocManager(docManager);
    }

    /**
     * 修改公文签收
     * 
     * @param docManager 公文签收
     * @return 结果
     */
    @Override
    public int updateDocManager(DocManager docManager)
    {
        return docManagerMapper.updateDocManager(docManager);
    }

    /**
     * 批量删除公文签收
     * 
     * @param ids 需要删除的公文签收主键
     * @return 结果
     */
    @Override
    public int deleteDocManagerByIds(String ids)
    {
        return docManagerMapper.deleteDocManagerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除公文签收信息
     * 
     * @param id 公文签收主键
     * @return 结果
     */
    @Override
    public int deleteDocManagerById(Long id)
    {
        return docManagerMapper.deleteDocManagerById(id);
    }
}
