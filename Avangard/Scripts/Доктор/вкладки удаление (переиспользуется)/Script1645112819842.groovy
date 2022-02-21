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

WebUI.callTestCase(findTestCase('Доктор/Авторизация врач'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/vra/Page_/school'))

WebUI.click(findTestObject('Object Repository/vra/Page_/var_school'))

WebUI.click(findTestObject('Object Repository/vra/Page_/team'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/doctor case (создание карточки и удаление)/Global school'))

WebUI.click(findTestObject('Object Repository/vra/Page_/p_1'))

WebUI.setText(findTestObject('Avangard New/Object (Доктор)/doctor case (создание карточки и удаление)/stady'), 'Допуск на игру')

WebUI.sendKeys(findTestObject('Avangard New/Object (Доктор)/doctor case (создание карточки и удаление)/stady'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/doctor case (создание карточки и удаление)/button_save'))

WebUI.click(findTestObject('Object Repository/vra/Page_/p_1'))

WebUI.click(findTestObject('Object Repository/vra/Page_/button_delete'))

WebUI.click(findTestObject('Object Repository/vra/Page_/confirm'))

WebUI.verifyTextPresent('Карточка успешно удалена', false)

WebUI.closeBrowser()

