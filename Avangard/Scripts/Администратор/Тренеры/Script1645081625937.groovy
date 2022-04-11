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

'авторизация\r\n'
WebUI.callTestCase(findTestCase('Администратор/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'переход на вкладку тренеры\r\n'
WebUI.click(findTestObject('Object Repository/admin/teachers/Page_/teach'))

'профиль тренера Агеев '
WebUI.click(findTestObject('Object Repository/admin/teachers/Page_/span_'))

WebUI.verifyTextPresent('ПРОФИЛЬ ПРЕПОДАВАТЕЛЯ', false)

'переход на вкладку карьера '
WebUI.click(findTestObject('Object Repository/admin/teachers/Page_/career'))

WebUI.verifyTextPresent('КАРЬЕРА ТРЕНЕРА', false)

not_run: WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '42.jpg')

'кнопка сохранить ( без редактирования) '
WebUI.click(findTestObject('Object Repository/admin/teachers/Page_/button_'))

WebUI.verifyTextPresent('Пользователь сохранен', false)

'переход на главную '
WebUI.click(findTestObject('Object Repository/admin/teachers/Page_/root'))

'конец теста\r\n'
WebUI.closeBrowser()

