package Bai32_Log4j2;

import org.testng.annotations.Test;
import utils.LogUtils;

public class demoWriteLog {

    @Test
    public void writeLogToFile(){
        LogUtils.info("Log 1 \n");
    }

    @Test
    public void writeLogToFile2(){
        LogUtils.info( "Log 2");
    }
}
