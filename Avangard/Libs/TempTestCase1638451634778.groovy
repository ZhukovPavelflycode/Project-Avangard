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


RunConfiguration.setExecutionSettingFile('C:\\Users\\savin\\AppData\\Local\\Temp\\Katalon\\20211202_162714\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.click(findTestObject(\'Page_/schedule\'))\n\nWebUI.click(findTestObject(\'Page_/add\'))\n\nWebUI.click(findTestObject(\'Page_/tip\'))\n\nWebUI.click(findTestObject(\'Page_/HomeGame\'))\n\nWebUI.click(findTestObject(\'Page_/timeStart\'))\n\nWebUI.click(findTestObject(\'Page_/li_400\'))\n\nWebUI.click(findTestObject(\'Page_/timeEnd\'))\n\nWebUI.click(findTestObject(\'Page_/li_600\'))\n\nWebUI.click(findTestObject(\'Page_/chool\'))\n\nWebUI.click(findTestObject(\'Page_/OMSK\'))\n\nWebUI.click(findTestObject(\'Page_/team\'))\n\nWebUI.click(findTestObject(\'Page_/versus\'))\n\nWebUI.setText(findTestObject(\'Page_/input__rival\'), \'\u0430\u0432\u0442\u043E\u0442\u0435\u0441\u0442\u044B\')\n\nWebUI.click(findTestObject(\'Page_/players\'))\n\nWebUI.setText(findTestObject(\'Page_/input__react-select-54-input\'), \'\u0432\u043B\u0430\u0441\u0435\u043D\u043A\u043E\')\n\nWebUI.click(findTestObject(\'Page_/div_\'))\n\nWebUI.click(findTestObject(\'Page_/place\'))\n\nWebUI.click(findTestObject(\'Page_/arena\'))\n\nWebUI.rightClick(findTestObject(\'Page_/players\'))\n\nWebUI.click(findTestObject(\'Page_/tip\'))\n\nWebUI.click(findTestObject(\'Page_/rooms\'))\n\nWebUI.click(findTestObject(\'Page_/div_101\'))\n\nWebUI.click(findTestObject(\'Page_/button_\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

