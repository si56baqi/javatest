package com.si56baqi.feign;

import com.common.vo.SysResult;
import com.si56baqi.pojo.Cart;

public class CartFeignFallback implements CartFeign{
    @Override
    public SysResult mycart(Long userId) {
        return SysResult.build(400, "mycart error.");
    }
    @Override
    public SysResult save(Cart cart) {
        return SysResult.build(400, "save error.");
    }
    @Override
    public SysResult update(Cart cart) {
        return SysResult.build(400, "update error.");
    }
    @Override
    public SysResult delete(Cart cart) {
        return SysResult.build(400, "delete error.");
    }

}
