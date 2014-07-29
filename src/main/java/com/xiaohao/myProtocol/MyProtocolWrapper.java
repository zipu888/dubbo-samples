package com.xiaohao.myProtocol;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Protocol;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * Created by xiaohao on 2014/7/29.
 */
public class MyProtocolWrapper implements Protocol {

    @Override
    public int getDefaultPort() {
        return 0;
    }

    @Override
    public <T> Exporter<T> export(Invoker<T> tInvoker) throws RpcException {
        return null;
    }

    @Override
    public <T> Invoker<T> refer(Class<T> tClass, URL url) throws RpcException {
        return null;
    }

    @Override
    public void destroy() {

    }
}
