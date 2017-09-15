package cn.edu.swpu.cins.learnSomethings.springShangguigu;

import java.util.Properties;

/**
 * Created by miaomiao on 17-9-15.
 */
public class DataSource {

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties='" + properties + '\'' +
                '}';
    }
}
