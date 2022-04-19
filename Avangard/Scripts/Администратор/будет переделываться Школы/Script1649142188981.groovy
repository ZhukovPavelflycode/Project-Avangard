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

'авторизация'
WebUI.callTestCase(findTestCase('Администратор/Авторизация админ'), [:], FailureHandling.STOP_ON_FAILURE)

'переход на вкладу школы'
WebUI.click(findTestObject('admin/school/schools/schools'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '43.jpg')

'выбор Академия "Авангард" и переход к расписанию школы\r\n'
WebUI.click(findTestObject('admin/school/Page_/div_'))

'переход на вкладку игроков'
WebUI.scrollToElement(findTestObject('admin/school/Page_/players'), 0)

'переход на вкладку игроков'
WebUI.click(findTestObject('admin/school/Page_/players'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '44.jpg')

'переход на вкладку команд'
WebUI.click(findTestObject('admin/school/Page_/team'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '45.jpg')

'выбр команды ОМСКИЕ ЯСТРЕБЫ \r\n'
WebUI.click(findTestObject('admin/school/Page_/omsk'))

'переход на вкладку редактирование '
WebUI.click(findTestObject('admin/school/Page_/edit'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '47.jpg')

'переход на вкладку все игроки\r\n'
WebUI.click(findTestObject('admin/school/Page_/allplayer'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '48.jpg')

'переход на вкладку занятие команды\r\n'
WebUI.click(findTestObject('admin/school/Page_/groups'))

WebUI.click(findTestObject('manager/schools/overlay'), FailureHandling.CONTINUE_ON_FAILURE)

'переход на главную \r\n'
WebUI.click(findTestObject('admin/school/Page_/root'))

'конец теста'
WebUI.closeBrowser()

