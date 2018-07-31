import com.xiaomudi.mybatis.bean.Employee;
import com.xiaomudi.mybatis.mapper.EmployeeMapper;
import lombok.ToString;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

/**
 * @authon:刘超
 * @classname:
 * @description:
 * @date:2018/7/26 下午1:38
 */
public class MyBatisTest {
    SqlSession sqlSession;
    @BeforeEach
    public void beforeEach() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        /**
         * 1.根据配置文件创建一个SqlSessionFactory对象
         * @throws Exception
         */
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        /**
         * 2.获取sqlSession实例，该实例可以执行已经映射的sql语句
         */
        sqlSession = sqlSessionFactory.openSession();
    }
    @AfterEach
    public void afterEach(){
        sqlSession.close();
    }

    /**
     * selectOne()方法
     * @throws Exception
     */
    @Test
    public void testSelectOneByXML() throws Exception{
        Employee employee = sqlSession.selectOne("com.xiaomudi.mybatis.mapper.EmployeeMapper.getEmpById",1);
        System.out.println(employee);
    }

    /**
     * Mapper接口动态绑定xml文件
     */
    @Test
    public void testEmployeeMapper(){
        //会为接口自动地创建一个代理对象，代理对象去执行CRUD操作
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        System.out.println(employeeMapper.getEmpById(1));
    }
}