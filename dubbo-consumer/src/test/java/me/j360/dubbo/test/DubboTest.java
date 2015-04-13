package me.j360.dubbo.test;

import me.j360.base.service.memcached.SpyMemcachedClient;
import me.j360.base.test.SpringTransactionalTestCase;
import me.j360.dubbo.api.TestRegistryService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.annotation.Resource;

/**
 * Created with j360 -> me.j360.web.test.base.
 * User: min_xu
 * Date: 2015-03-12
 * Time: 11:30
 * 说明：
 */
@TransactionConfiguration(defaultRollback=true)
@ContextConfiguration(locations = {"/applicationContext.xml" })
public class DubboTest extends SpringTransactionalTestCase {
    @Resource
    private TestRegistryService testRegistryService;

    @Test
    public void normal() {
        testRegistryService.hello("hello dubbo");
    }
}
