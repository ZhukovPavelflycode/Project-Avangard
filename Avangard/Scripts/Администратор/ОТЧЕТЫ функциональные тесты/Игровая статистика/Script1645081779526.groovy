import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Администратор/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'переход в отчеты'
WebUI.click(findTestObject('Object Repository/admin/reports/gamestat/reports/report'))

'выбор отчета'
WebUI.click(findTestObject('Object Repository/admin/reports/gamestat/Page_/stats_report'))

WebUI.verifyTextPresent('ИГРОВАЯ СТАТИСТИКА', true)

'выбор школы'
WebUI.click(findTestObject('Object Repository/admin/reports/gamestat/Page_/school'))

WebUI.click(findTestObject('Object Repository/admin/reports/gamestat/Page_/Academy'))

'выбор команды '
WebUI.click(findTestObject('Object Repository/admin/reports/gamestat/Page_/team'))

WebUI.click(findTestObject('Object Repository/admin/reports/gamestat/Page_/varteam'))

'выбор сезона'
WebUI.click(findTestObject('Object Repository/admin/reports/gamestat/Page_/choseSeason'))

WebUI.click(findTestObject('Object Repository/admin/reports/gamestat/Page_/div_21-22_1'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '10.jpg')

'проверки'
WebUI.verifyTextPresent('Матчи', true)

WebUI.verifyTextPresent('Смены', true)

WebUI.verifyTextPresent('Голы за', false)

WebUI.verifyTextPresent('Голы против', false)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '11.jpg')

WebUI.click(findTestObject('Object Repository/admin/reports/gamestat/Page_/root'))

WebUI.closeBrowser()

