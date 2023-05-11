package OneTool.testsuite;


import lombok.Getter;
import lombok.extern.log4j.Log4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.io.StringReader;
import java.util.Properties;
import java.util.Set;

@Log4j
public class OneToolConfiguration {

    private static Properties properties = null;

    private static final Logger logger = Logger.getLogger(OneToolConfiguration.class);

    public static String getProperty(final String property) {
        String propertyValue = properties.getProperty(property);
        return propertyValue == null ? null : propertyValue.trim();
    }


    //------------------------------------------------------------------


    private static final String TEST_UMGEBUNG = "TestUmgebung";
    private static final String OVERWRITE_PROPERTIES = "OVERWRITE_PROPERTIES";
    private static final String CUCUMBER_STAGE_PROPERTIES = "CUCUMBER_STAGE_PROPERTIES";
    private static final Integer OSS_TEST_RUNS_PER_CUSTOMER = 3;

    public static String DB_URL = "jdbc:oracle:thin:@localhost:1521:aax2mm";
    public static String AAX2MM_USER = "aax2mm";
    public static String AAX2MM_PASSWORD = "aax2mm";
    public static String AAX2BMM_USER = "aax2bmm";
    public static String AAX2BMM_PASSWORD = "aax2bmm";
    public static String AAX2USAGE_USER = "aax2usage";
    public static String AAX2USAGE_PASSWORD = "aax2usage";
    public static String RANGE_START = "oss.simOrder.%s.imsi.rangeStart";
    public static String RANGE_END = "oss.simOrder.%s.imsi.rangeEnd";

    @Getter
    private static String environment;

    @Getter
    private static String overwriteProperties;

    static {
        try {

            properties = new Properties();

            String testsuiteProps = System.getenv(CUCUMBER_STAGE_PROPERTIES);
            String propertyName;

            overwriteProperties = System.getenv(OVERWRITE_PROPERTIES);
            if (overwriteProperties != null) {
                log.info("Important Note: External test configuration properties have been defined. Ignoring the TEST_UMGEBUNG variable and loading the external test configuration properties...");
                properties.load(new StringReader(overwriteProperties));
                log.info("External test configuration properties have been loaded successfully");
            } else {
                log.info("Loading test configuration properties...");
                environment = System.getenv(TEST_UMGEBUNG);

                if (environment == null) {
                    propertyName = "/testsuite_configuration.properties";
                    environment = "LOCAL";
                } else {
                    propertyName = "/testsuite_configuration_" + environment + ".properties";
                }


            }


            DB_URL = properties.getProperty("db.url");

            if (properties.getProperty("db.password.mm") != null) {
                AAX2MM_PASSWORD = properties.getProperty("db.password.mm");
            }
            if (properties.getProperty("db.password.bmm") != null) {
                AAX2BMM_PASSWORD = properties.getProperty("db.password.bmm");
            }
            if (properties.getProperty("db.password.usage") != null) {
                AAX2USAGE_PASSWORD = properties.getProperty("db.password.usage");
            }

        } catch (Exception e) {
            logger.error("Problem loading Properties", e);
        }
    }

    public static String getPlatformType() {
        return properties.getProperty("platform.type");
    }

    public static String getSeleniumServerMode() {
        return properties.getProperty("selenium.mode");
    }


    public static String getPropertyWithItosFallback(String configPropertyName, String fallBackItosName) {
        String configValue = OneToolConfiguration.getProperty(configPropertyName);


        return configValue == null ? null : configValue.trim();
    }

    public static String getPropertyWithItosFallback(String configPropertyName, String object, String fallBackItosName) {
        String configValue = OneToolConfiguration.getProperty(configPropertyName);


        return configValue == null ? null : configValue.trim();
    }

    public static String getPropertyWithItosFallback(String configPropertyName, long client, String fallBackItosName) {
        String configValue = OneToolConfiguration.getProperty(configPropertyName);


        return configValue == null ? null : configValue.trim();
    }

    public static String getPropertyWithValueFallback(String configPropertyName, String regularValue) {
        String configValue = OneToolConfiguration.getProperty(configPropertyName);

        return configValue = (StringUtils.isEmpty(configValue)) ? regularValue : configValue;
    }

    public static String getSeleniumServer() {
        if (getSeleniumServerMode() == null || getSeleniumServerMode().equals("local")) {
            return "127.0.0.1";
        }

        return properties.getProperty("selenium.url");
    }

    public static Set<String> propertyNames() {
        return properties.stringPropertyNames();
    }

    public static int getCustomerValidityPeriod() {
        String days = getPropertyWithValueFallback("ftp.efb.cleanup.days", "14").trim();
        return Integer.parseInt(days);
    }

    public static int getOssCustomerTestRunCount() {
        String days = getPropertyWithValueFallback("oss.simOrder.testRunsPerCustomer", OSS_TEST_RUNS_PER_CUSTOMER.toString());
        return Integer.parseInt(days);
    }


}
