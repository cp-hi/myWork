package com.lifeshs.product.service.common;

public interface IAppVersion {

    /**
     *  查询app版本
     *  @param
     *  @return
     */
    Integer queryAppVersion(String appName, Integer version);

    /**
     *  查询ios版本
     *  @author yuhang.weng
     *	@DateTime 2017年4月7日 下午2:31:42
     *
     *  @return
     */
    String queryIOSPublicVersion();

    String queryManagerIOSPublicVersion();
}
