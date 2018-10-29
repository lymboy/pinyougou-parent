package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	List<TbBrand> findAll();
	
	/**
	 * 品牌分页
	 * @param pageNum	当前页码
	 * @param pageSize	当前页面大小
	 * @return
	 */
	PageResult findPage(int pageNum, int pageSize);

    /**
     * 增加商品
     * @param brand
     */
    void add(TbBrand brand);

    /**
     * 根据id查找商品
     * @param id
     * @return
     */
    TbBrand findOne(Long id);

    /**
     * 更新修改商品
     * @param brand
     */
    void update(TbBrand brand);

    /**
     * 批量删除商品
     * @param ids
     */
    void delete(Long[] ids);

    /**
     * 查找商品
     * @return
     */
    PageResult findPage(TbBrand brand, int pageNum, int pageSize);
}
