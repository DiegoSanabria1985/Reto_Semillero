package com.farmatodo.app.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//libreria de appium
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {

    //elemento que llama librerias de appium
    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver appium(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "sdk gphone64_x86_64");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "12");
            capabilities.setCapability("appPackage", "com.farmatodo.app");
            capabilities.setCapability("appActivity", "com.imaginamos.farmatodo.ui.activities.main.ActivityMain");
            capabilities.setCapability("noReset", "true");
            //url pagina que vamos a automatizar la conexión de apiumm
            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new AppiumAndroidDriver();
    }
    // metodo para llmara compendio de metodos
    public AppiumDriver<MobileElement> on(){
        return driver;
    }


}
