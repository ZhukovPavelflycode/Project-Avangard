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

WebUI.callTestCase(findTestCase('Администратор/Авторизация админ'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка Отчеты'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Сase (Игровая статистика)/report'))

'Выбор отчета психологич профиля'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/psyxofiz report'))

'Проверка то что точно тот отчет был открыт'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/verif report H'), 
    'ОТЧЕТ ПСИХОЛОГИЧЕСКОГО ПРОФИЛЯ')

WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/school psixolog'))

'Поле ввода Школа'
WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/input__school  report psixolog'), 
    '"Авангард" Академия')

WebUI.sendKeys(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/input__school  report psixolog'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/team psixolog'))

'Поле ввода Команда'
WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/input__team report psoxolog'), 
    GlobalVariable.school)

WebUI.sendKeys(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/input__team report psoxolog'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/player psixolog'))

'Поле ввода Игрок'
WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/input__player psixolog'), 
    GlobalVariable.player_for_test)

WebUI.sendKeys(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/input__player psixolog'), 
    Keys.chord(Keys.ENTER))

'Выбор даты отчета'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/date report'))

'1 позиция даты'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/date report 1 pozition'))

'Проверка что график отображается'
WebUI.verifyElementVisible(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/canvas'))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/reaction psixolog'), 
    0)

'Проверка нижних данных'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/reaction psixolog'), 
    'Реакция на простой стимул')

'Сролл до даты отчета'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/verif report H'), 
    0)

'Кнопка индивидально-топологичесикй'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/button topologiches'))

'Если игрок Власенко то'
if (WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/player topolog psixolog'), 
    'Власенко Дмитрий', FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/div_20-21'))

    'Сезон выбирает 20-21'
    WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/input__swzon psixolog'), 
        '20-21')

    WebUI.sendKeys(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/input__swzon psixolog'), 
        Keys.chord(Keys.ENTER))
} else {
    WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/div_20-21'))

    'Иначе 21-22 для Ганина'
    WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/input__swzon psixolog'), 
        '21-22')

    WebUI.sendKeys(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/input__swzon psixolog'), 
        Keys.chord(Keys.ENTER))
}

'Видимость графика на вкладке индивидуально-топологический'
WebUI.verifyElementVisible(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/canvas_1'))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/exstraversi'), 
    0)

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Отчет психологического профиля)/exstraversi'), 
    'Экстраверсия')

WebUI.closeBrowser()

