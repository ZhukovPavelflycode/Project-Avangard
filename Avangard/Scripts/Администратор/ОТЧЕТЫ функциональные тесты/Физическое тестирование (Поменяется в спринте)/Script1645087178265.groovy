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

WebUI.callTestCase(findTestCase('Администратор/Отчет для тк'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/phys'))

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/school'))

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/div_'))

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/div_31.07.2020'))

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/div_31.12.2020'))

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/team'))

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/oya'))

WebUI.verifyTextPresent('Жим штанги лежа', true)

WebUI.verifyTextPresent('Подтягивание из виса на перекладине', true)

WebUI.verifyTextPresent('Уголок из виса на турнике', true)

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/individ'))

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/school'))

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/div_   . _1'))

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/team'))

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/omsk'))

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/div_ (1)'))

WebUI.setText(findTestObject('Object Repository/admin/phyz/Page_/input__react-select-9-input'), GlobalVariable.player_for_test)

WebUI.sendKeys(findTestObject('Object Repository/admin/phyz/Page_/input__react-select-9-input'), Keys.chord(Keys.ENTER))

WebUI.verifyTextPresent('Прыжок в высоту', true)

WebUI.verifyTextPresent('Челночный бег 5-10-5 \\(сек\\)', true)

WebUI.verifyTextPresent('СРЕДНЯЯ ОЦЕНКА', true)

WebUI.verifyTextPresent('Список навыков и характеристики', true)

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/home'))

WebUI.scrollToElement(findTestObject('Object Repository/admin/phyz/Page_/exit'), 0)

WebUI.click(findTestObject('Object Repository/admin/phyz/Page_/exit'))

WebUI.closeBrowser()

