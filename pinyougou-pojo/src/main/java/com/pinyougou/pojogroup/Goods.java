package com.pinyougou.pojogroup;

import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsDesc;
import com.pinyougou.pojo.TbItem;

import java.io.Serializable;
import java.util.List;

public class Goods implements Serializable {
    // 商品SPU
    private TbGoods tbGoods;
    // 商品扩展
    private TbGoodsDesc tbGoodsDesc;
    // 商品SKU
    private List<TbItem> tbItems;

    public TbGoods getTbGoods() {
        return tbGoods;
    }

    public void setTbGoods(TbGoods tbGoods) {
        this.tbGoods = tbGoods;
    }

    public TbGoodsDesc getTbGoodsDesc() {
        return tbGoodsDesc;
    }

    public void setTbGoodsDesc(TbGoodsDesc tbGoodsDesc) {
        this.tbGoodsDesc = tbGoodsDesc;
    }

    public List<TbItem> getTbItems() {
        return tbItems;
    }

    public void setTbItems(List<TbItem> tbItems) {
        this.tbItems = tbItems;
    }

    @Override
    public String toString() {
        return "Goods{" + "tbGoods=" + tbGoods + ", tbGoodsDesc=" + tbGoodsDesc + ", tbItems=" + tbItems + '}';
    }
}
