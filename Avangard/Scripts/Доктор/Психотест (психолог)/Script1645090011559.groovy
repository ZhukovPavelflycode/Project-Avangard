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

WebUI.openBrowser('')

WebUI.maximizeWindow()

'адрес сайта '
WebUI.navigateToUrl('https://stars-stage.hawk.ru:8080/')

WebUI.setText(findTestObject('Avangard New/Object (Психолог)/login (Логин Психолог)'), 'psychoTEST@mail.ru')

WebUI.setText(findTestObject('Avangard New/Object (Психолог)/password (Пароль Психолог)'), 'psychoTEST@mail.ru', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/vrach/psychotest/Page_/go'))

WebUI.click(findTestObject('Object Repository/vrach/psychotest/Page_/psychotest'))

WebUI.verifyTextPresent('Психологический профиль', false)

WebUI.click(findTestObject('Object Repository/vrach/psychotest/Page_/school'))

WebUI.click(findTestObject('Object Repository/vrach/psychotest/Page_/avanguard'))

WebUI.click(findTestObject('Object Repository/vrach/psychotest/Page_/team'))

WebUI.click(findTestObject('Object Repository/vrach/psychotest/Page_/varteam'))

WebUI.click(findTestObject('Object Repository/vrach/psychotest/Page_/player'))

WebUI.click(findTestObject('Object Repository/vrach/psychotest/Page_/varplayer'))

WebUI.click(findTestObject('Object Repository/vrach/psychotest/Page_/date'))

WebUI.click(findTestObject('Object Repository/vrach/psychotest/Page_/enter_date'))

WebUI.verifyTextPresent('Реакция на простой стимул', false)

WebUI.scrollToElement(findTestObject('Object Repository/vrach/psychotest/Page_/thinking'), 0)

WebUI.setText(findTestObject('Object Repository/vrach/psychotest/Page_/thinking'), '9')

WebUI.click(findTestObject('Object Repository/vrach/psychotest/Page_/button_save'))

