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

'переход на вкладку оценка командных действий'
WebUI.click(findTestObject('Object Repository/admin/okd/Page_/OKD'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '32.jpg')

'выбор школы\r\n'
WebUI.click(findTestObject('Object Repository/admin/okd/Page_/div_ 11'))

WebUI.click(findTestObject('Object Repository/admin/okd/Page_/div_'))

'выбор команды'
WebUI.click(findTestObject('Object Repository/admin/okd/Page_/div_ 2222'))

WebUI.click(findTestObject('Object Repository/admin/okd/Page_/div_3333'))

'выбор матча\r\n'
WebUI.setText(findTestObject('Object Repository/admin/okd/Page_/div_ 4444'), GlobalVariable.school_1)

'выбор матча\r\n'
WebUI.sendKeys(findTestObject('Object Repository/admin/okd/Page_/div_ 4444'), Keys.chord(Keys.ENTER))

WebUI.verifyTextPresent('Силовой прием', false)

WebUI.verifyTextPresent('Заблокированные броски', false)

WebUI.verifyTextPresent('Временные отрезки когда пропускает', false)

WebUI.verifyTextPresent('Коэффициент надежности', false)

WebUI.verifyTextPresent('Заблокированные броски', false)

WebUI.verifyTextPresent('Броски в створ из опасной зоны', false)

WebUI.verifyTextPresent('Средняя длина смены', false)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '31.jpg')

'переход на главную \r\n'
WebUI.click(findTestObject('Object Repository/admin/school/Page_/root'))

'конец теста'
WebUI.closeBrowser()

