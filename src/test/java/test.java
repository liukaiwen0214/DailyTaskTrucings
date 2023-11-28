
import com.imax.mapper.StudentInfoMapper;
import com.imax.mapper.UserGoAshoreMapper;
import com.imax.pojo.StudentInfoTable;
import com.imax.service.impl.StudentInfoServiceImpl;
import com.imax.service.impl.UserGoAshoreImpl;
import com.imax.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class test {
    @Test
    public void Test1() throws IOException {
        Date date = new Date();
        date.getTime();
        StudentInfoTable studentInfoTable = new StudentInfoTable("0012","s","f",date,"s");
        String[] strings = {"0010","0011","0012"};
        int i = new StudentInfoServiceImpl().delStudent(strings);
        if (i>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
}
