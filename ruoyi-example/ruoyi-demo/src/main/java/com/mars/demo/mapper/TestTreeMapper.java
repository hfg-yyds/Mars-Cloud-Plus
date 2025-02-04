package com.mars.demo.mapper;

import com.mars.common.mybatis.annotation.DataColumn;
import com.mars.common.mybatis.annotation.DataPermission;
import com.mars.common.mybatis.core.mapper.BaseMapperPlus;
import com.mars.demo.domain.TestTree;
import com.mars.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author Lion Li
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTreeMapper, TestTree, TestTreeVo> {

}
