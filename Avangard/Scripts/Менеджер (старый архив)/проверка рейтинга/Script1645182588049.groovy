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

WebUI.callTestCase(findTestCase('Менеджер (старый архив)/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('manager/raiting/Page_/raiting'))

WebUI.setText(findTestObject('manager/raiting/Page_/input__react-select-3-input'), 'ака')

WebUI.sendKeys(findTestObject('manager/raiting/Page_/input__react-select-3-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('manager/raiting/Page_/div_ _1'))

WebUI.setText(findTestObject('manager/raiting/Page_/input__react-select-4-input'), 'ом')

WebUI.sendKeys(findTestObject('manager/raiting/Page_/input__react-select-4-input'), Keys.chord(Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('manager/raiting/Page_/span_'))

WebUI.verifyElementVisible(findTestObject('manager/raiting/Page_/div_7912.329122.307132.149842.019951.717861_97b24c'))

WebUI.verifyElementClickable(findTestObject('manager/raiting/Page_/span__1'))

WebUI.takeScreenshot('managerr.jpg')

WebUI.click(findTestObject('manager/raiting/Page_/p_1'))

WebUI.takeScreenshot('managerrar.jpg')

WebUI.click(findTestObject('manager/raiting/Page_/div_'))

WebUI.takeScreenshot('managerrarp.jpg')

WebUI.click(findTestObject('manager/raiting/Page_/div_ _1_2'))

WebUI.takeScreenshot('managerraro.jpg')

WebUI.click(findTestObject('manager/raiting/Page_/div_ _1_2_3'))

WebUI.click(findTestObject('manager/alhimov/Page_/root'))

WebUI.closeBrowser()

