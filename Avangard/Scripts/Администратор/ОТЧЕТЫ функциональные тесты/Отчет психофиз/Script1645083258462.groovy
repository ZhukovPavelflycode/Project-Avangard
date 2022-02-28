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

'Выбор отчета психофиз'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/psyxofiz report'))

WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/header report'), 
    'ОТЧЕТ ПСИХОЛОГИЧЕСКОГО ПРОФИЛЯ')

'заполнение фильтров'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/scool'))

'заполнение фильтров'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/div_'))

'заполнение фильтров'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/team'))

'заполнение фильтров'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/oya'))

'заполнение фильтров'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/input__ganin'), GlobalVariable.player_for_test)

'заполнение фильтров'
WebUI.sendKeys(findTestObject('Object Repository/admin/Global player'), Keys.chord(Keys.ENTER))

'заполнение дата отчета'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/date'))

'14.01.2021'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/date 14 01'))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Психофиз)/reaction easy1'), 0)

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Психофиз)/reaction easy1'), 'Реакция на простой стимул')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Психофиз)/reaction hard1'), 'Реакция на сложный стимул')

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/season (1)'), 
    0)

'Нажать на вкладку индивидуально-тополигический'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/topologic'))

'Нажимаю на поле сезон'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/season (1)'))

'Выбираю сезон'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/21-22'))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Психофиз)/exstraversi'), 0)

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Психофиз)/exstraversi'), 'Экстраверсия')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Психофиз)/spontannost'), 'Спонтанность')

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Психофиз)/home'))

WebUI.closeBrowser()

