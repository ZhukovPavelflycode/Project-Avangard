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

WebUI.callTestCase(findTestCase('Менеджер (старый архив)/Все отчеты'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/OFP'))

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/div_31.07.2020'))

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/div_31.12.2020'))

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/school'))

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/div_ (1)'))

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/team'))

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/oya'))

WebUI.verifyTextPresent('Челночный бег', true)

WebUI.verifyTextPresent('Жим штанги лежа', true)

WebUI.verifyTextPresent('Список игроков', true)

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/individ'))

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/school'))

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/div_   . _1'))

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/team'))

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/oya1'))

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/player'))

WebUI.setText(findTestObject('Object Repository/manager/reports/phy/Page_/trikoz'), GlobalVariable.player_for_test)

WebUI.sendKeys(findTestObject('Object Repository/manager/reports/phy/Page_/trikoz'), Keys.chord(Keys.ENTER))

WebUI.verifyTextPresent('Список навыков и характеристики', true)

WebUI.verifyTextPresent('Прыжок в высоту', true)

WebUI.verifyTextPresent('FMS тест', true)

WebUI.click(findTestObject('Object Repository/manager/reports/phy/Page_/root'))

WebUI.closeBrowser()

