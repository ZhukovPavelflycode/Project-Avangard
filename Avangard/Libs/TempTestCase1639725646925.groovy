import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\savin\\AppData\\Local\\Temp\\Katalon\\Test Cases\\ADMIN\\\u041E\u0422\u0427\u0415\u0422\u042B \u0444\u0443\u043D\u043A\u0446\u0438\u043E\u043D\u0430\u043B\u044C\u043D\u044B\u0435 \u0442\u0435\u0441\u0442\u044B\\\u0424\u0418\u0417\u0418\u0427\u0415\u0421\u041A\u041E\u0415 \u0422\u0415\u0421\u0422\u0418\u0420\u041E\u0412\u0410\u041D\u0418\u0415\\20211217_102046\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/ADMIN/ОТЧЕТЫ функциональные тесты/ФИЗИЧЕСКОЕ ТЕСТИРОВАНИЕ', new TestCaseBinding('Test Cases/ADMIN/ОТЧЕТЫ функциональные тесты/ФИЗИЧЕСКОЕ ТЕСТИРОВАНИЕ',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
