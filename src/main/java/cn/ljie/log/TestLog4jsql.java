package cn.ljie.log;


import org.apache.log4j.Logger;

public class TestLog4jsql {
    private static Logger logger = Logger.getLogger("log4jdemo");

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++)
            logger.debug("RollingFileAppenderTest:" + i);
    }
    /*haha*/
}
