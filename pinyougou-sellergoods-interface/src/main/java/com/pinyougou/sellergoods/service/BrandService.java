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

	public List<TbBrand> findAll();
	
	/**
	 * 品牌分页
	 * @param pageNum	当前页码
	 * @param pageSize	当前页面大小
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
}
