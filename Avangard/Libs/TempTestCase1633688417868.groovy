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


RunConfiguration.setExecutionSettingFile('C:\\Users\\savin\\AppData\\Local\\Temp\\Katalon\\20211008_132017\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.click(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/add\'))\n\nWebUI.click(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/tip\'))\n\nWebUI.click(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/viezdnaya\'))\n\nWebUI.click(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/start_time\'))\n\nWebUI.click(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/li_500\'))\n\nWebUI.click(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/end_time\'))\n\nWebUI.click(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/li_1000\'))\n\nWebUI.click(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/school\'))\n\nWebUI.click(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/avangard\'))\n\nWebUI.click(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/chose_team\'))\n\nWebUI.setText(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/team\'), GlobalVariable.school)\n\nWebUI.sendKeys(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/team\'), Keys.chord(Keys.ENTER))\n\nWebUI.setText(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/versus\'), \'\u0430\u0432\u0442\u043E\u0442\u0435\u0441\u0442\')\n\nWebUI.click(findTestObject(\'Object Repository/\u0422\u0420\u0415\u041D\u0415\u0420/event/Page_/save\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

