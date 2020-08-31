package com.si56baqi.feign;

import com.common.vo.SysResult;
import com.si56baqi.pojo.Cart;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value="jt-cart-provider",fallback = CartFeignFallback.class)
public interface CartFeign {
    public SysResult mycart(Long userId);
    public SysResult save(Cart cart);
    public SysResult update(Cart cart);
    public SysResult delete(Cart cart);
}
