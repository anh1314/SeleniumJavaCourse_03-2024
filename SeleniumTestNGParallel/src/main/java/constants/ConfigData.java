package constants;

import helpers.PropertiesHelper;

public class ConfigData {
//    public static String URL = "https://crm.anhtester.com/admin/authentication";
//    public static String Email ="admin@example.com";
//    public static String Password ="123456";
    static {
        PropertiesHelper.loadAllFiles();
}

    public static String URL = PropertiesHelper.getValue("url");
    public static String Email = PropertiesHelper.getValue("email");
    public static String Password = PropertiesHelper.getValue("password");
}
