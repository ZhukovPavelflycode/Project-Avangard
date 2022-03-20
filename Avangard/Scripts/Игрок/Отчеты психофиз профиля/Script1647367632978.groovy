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

'Вкладка отчеты'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/report'))

'Психологический отчет'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/psixolog'))

if (WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/div_ganin'), 'Ганин Данила', 
    FailureHandling.OPTIONAL) == true) {
    'Дата отчета'
    WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/div_burger date'))

    'Дата отчета 30.06'
    WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/div_30.06.2021'))
} else {
    WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/div_date report'))

    WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/div_26.08.2021'))
}

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/div_ganin'), 
    'Ганин Данила')

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/reaction easy'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/reaction easy'), 'Реакция на простой стимул')

WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/reaction hard'), 'Реакция на сложный стимул')

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/button burg date (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/tab'))

if (WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/div_ganin'), 'Ганин Данила', 
    FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/div_sezon'))

    WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/div_21-22'))
} else {
    WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/div_sezon'))

    WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/div_20-21'))
}

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/xarakteristika'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/xarakteristika'), 'Экстраверсия')

WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/xarakteristika 2'), 
    'Спонтанность')

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (отчеты)/home g (1)'))

WebUI.closeBrowser()

