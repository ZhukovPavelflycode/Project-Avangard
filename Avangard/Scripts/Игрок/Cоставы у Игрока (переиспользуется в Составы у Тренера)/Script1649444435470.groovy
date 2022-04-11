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

WebUI.callTestCase(findTestCase('Игрок/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка Состав'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Составы)/span_'))

WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Составы)/ganin player'), GlobalVariable.player_for_test_1)

WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Составы)/bulavchuk player'), 
    'Булавчук')

WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Составы)/Kocubailo  palyer'), 
    'Коцюбайло')

WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Составы)/leuka palayer'), 'Леука')

'Вкладка Главная'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Составы)/home palyer ganin'))

'Ганин'
WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Составы)/div_88 Ganin'), 0)

'Ганин'
WebUI.verifyElementVisible(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Составы)/div_88 Ganin'))

'Балавчку'
WebUI.verifyElementVisible(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Составы)/div_13 Balavchuk'))

'Коцюбайло'
WebUI.verifyElementVisible(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Составы)/div_86 Kosubailo'))

'Леука'
WebUI.verifyElementVisible(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Составы)/div_78 Leyka'))

WebUI.closeBrowser()

