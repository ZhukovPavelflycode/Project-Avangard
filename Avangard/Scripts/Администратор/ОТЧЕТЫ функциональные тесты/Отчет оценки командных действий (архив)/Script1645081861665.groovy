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

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/rep'))

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/odl'))

WebUI.verifyTextPresent('ОЦЕНКА ДЕЙСТВИЙ КОМАНДЫ ПО ЛИНИЯМ', false)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '19.jpg')

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/div_ 11'))

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/div_'))

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/div_ 222'))

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/div_ 333'))

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/div_ 444'))

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/div_02.02.21   -'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '20.jpg')

WebUI.verifyTextPresent('Коэффициент надежности', true)

WebUI.verifyTextPresent('Заблокированные броски', true)

WebUI.verifyTextPresent('Броски в створ из опасной зоны', true)

WebUI.scrollToElement(findTestObject('Object Repository/okd/New Folder/Page_/button_  1'), 0)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '21.jpg')

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/button_  1'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '22.jpg')

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/div_  _sidebar__overlay sidebar__overlay_visible'))

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/button_  2'))

WebUI.click(findTestObject('Object Repository/okd/New Folder/Page_/div_  _sidebar__overlay sidebar__overlay_visible'))

WebUI.click(findTestObject('Object Repository/admin/franch/Page_/root'))

WebUI.closeBrowser()

