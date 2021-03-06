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

'Для проверки отдельно (все в комментах)'
not_run: WebUI.callTestCase(findTestCase('Администратор/Авторизация админ'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка пользователи'
not_run: WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/span users'))

'Ввод в поиск Тарасов'
not_run: WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/input__Tarasov'), 'Test')

WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/edit user'))

'Поле ввода Команда'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/team edit'))

WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/uxl team'))

'Изменить пароль'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/input__password'), 0)

'Изменить пароль'
WebUI.setEncryptedText(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/input__password'), 'XD0KJMxWAaMdre7dpgZZ4A==')

WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/button_save edit'), 0)

'Сохранить изменения'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/button_save edit'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/alert edit'), 'Пользователь сохранен')

'Нажать кнопку редактирование'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/button_edit2'))

'Нажать кнопку закрыть'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/button_close edit'), 0)

'Нажать кнопку закрыть'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/button_close edit'))

'Подтвердить закрытие'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/button__close edit 2'))

'Поиск пользователя'
WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/input__test user'), 'test')

'Открыть пользователя'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/div_User Test'), 0)

'Открыть пользователя'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/div_User Test'))

'Кнопка удалить '
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/button_'))

'Подтверждение удаления'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/button_delete2'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/alert delete'), 'Пользователь удалён')

