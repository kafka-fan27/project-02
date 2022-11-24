package com.ruoyi.docManager.mapper;

import java.util.List;
import com.ruoyi.docManager.domain.DocManager;
import org.apache.ibatis.annotations.Mapper;

/**
 * 公文签收Mapper接口
 * 
 * @author kafka
 * @date 2022-11-23
 */

public interface DocManagerMapper 
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
     * 删除公文签收
     * 
     * @param id 公文签收主键
     * @return 结果
     */
    public int deleteDocManagerById(Long id);

    /**
     * 批量删除公文签收
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDocManagerByIds(String[] ids);
}
