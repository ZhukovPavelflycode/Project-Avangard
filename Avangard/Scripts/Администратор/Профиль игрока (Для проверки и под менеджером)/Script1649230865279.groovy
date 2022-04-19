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

not_run: WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/role admin'), 
    'Администратор')

'Авторизация'
WebUI.callTestCase(findTestCase('Администратор/Авторизация админ'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/role admin'), 0)

if (WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/role admin'), 'Администратор', 
    FailureHandling.OPTIONAL) == true) {
    'Переход на вкладку Игроки'
    WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/students'))

    WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/input'), GlobalVariable.player_for_test_1)

    'Выбор игрока'
    WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/player profile'))

    WebUI.disableSmartWait()

    'Проверки для АДМИНА'
    while (WebUI.verifyElementVisible(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/editProfile'), 
        FailureHandling.OPTIONAL) == true) {
        WebUI.enableSmartWait()

        'Редактирование профиля '
        WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/editProfile'))

        'Скролл к номеру телефона\r\n'
        WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/input__phone'), 
            0)

        'Очистка поля номера телефона'
        WebUI.clearText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/input__phone'), 
            FailureHandling.STOP_ON_FAILURE)

        'Ввод номера телефона\r\n'
        WebUI.setText(findTestObject('admin/students/Page_/input__phone'), '8 (953) 456-78-91')

        WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/Save_button_'), 
            0)

        'Сохранение изменений'
        WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/Save_button_'))

        WebUI.verifyTextPresent('Пользователь сохранен', false)

        'Архивация игрока'
        WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/arch_button'))

        'Кнопка Архиваровать'
        WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/confirm_arch_button'))

        'Подтверждение архивации'
        WebUI.verifyTextPresent('Пользователь сохранен', false)

        'Вкладка Игроки'
        WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/students'))

        'Вкладка Архивированные игроки'
        WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/arch_player'))

        WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/global_player'), 
            0)

        WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/global_player'))

        'Проверка что номер сохранился'
        WebUI.verifyElementText(findTestObject('Object Repository/admin/students/Page_/verif number save'), '8 (953) 456-78-91')

        'Редактировать профиль'
        WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/editProfile'))

        'Возврат из архива'
        WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/recovery_player'))

        'Подтверждение восстановления'
        WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/confirm_recovery'))

        WebUI.verifyTextPresent('Пользователь сохранен', false)
    }
}

'Переход на вкладку Игроки'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/students'))

WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/input__school'), '"Авангард" Академия')

WebUI.sendKeys(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/input__school'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/input'), GlobalVariable.player_for_test_1)

'Выбор игрока'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/player profile'))

'Проверка вкладки Основные'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/personal date'), 'ЛИЧНЫЕ ДАННЫЕ')

'Вкладка представители'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/button_predstaviteli'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/string family'), 'СЕМЬЯ')

'Вкладка Статусы'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/button_status'))

'Вкладка Игры'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/button_game'))

'Проверка что звено есть'
WebUI.verifyElementPresent(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/zveno 1 verif'), 0)

WebUI.verifyElementPresent(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/game spisok'), 0)

'Вкладка Рейтинг '
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/button_rank'))

'Проверка отображения рейтинга'
WebUI.verifyElementPresent(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/canvas'), 0)

'Вкладка Статистика'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/button_stat'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/div_math'), 'Матчи')

'Вкладка Оценка игр'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/button_game grade'))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/attack in grade'), 0)

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/attack in grade'), 'АТАКУЮЩИЕ ДЕЙСТВИЯ')

WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/strelka'), 0)

'Стрелка вбок'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/strelka'))

'Вкладка Оценка навыков'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/button_grade naviki'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/div_1 etap1'), 'Этап №1')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Профиль игрока)/div_speed'), 'Ускорение')

WebUI.closeBrowser()

