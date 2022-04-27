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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://jarjad.ru/compare-images/')

WebUI.maximizeWindow()

WebUI.uploadFileWithDragAndDrop(findTestObject('scr/Page_/firstscr'), 'C:\\scr\\14.jpg')

WebUI.uploadFileWithDragAndDrop(findTestObject('scr/Page_/secondscr'), 'C:\\scr1\\14.jpg')

WebUI.verifyElementText(findTestObject('scr/Page_/conclusion'), 'Изображения абсолютно одинаковые!')

WebUI.refresh()

WebUI.uploadFileWithDragAndDrop(findTestObject('scr/Page_/firstscr'), 'C:\\scr\\15.jpg')

WebUI.uploadFileWithDragAndDrop(findTestObject('scr/Page_/secondscr'), 'C:\\scr1\\15.jpg')

WebUI.verifyElementText(findTestObject('scr/Page_/conclusion'), 'Изображения абсолютно одинаковые!')

WebUI.refresh()

WebUI.uploadFileWithDragAndDrop(findTestObject('scr/Page_/firstscr'), 'C:\\scr\\16.jpg')

WebUI.uploadFileWithDragAndDrop(findTestObject('scr/Page_/secondscr'), 'C:\\scr1\\16.jpg')

WebUI.verifyElementText(findTestObject('scr/Page_/conclusion'), 'Изображения абсолютно одинаковые!')

WebUI.refresh()

WebUI.uploadFileWithDragAndDrop(findTestObject('scr/Page_/firstscr'), 'C:\\scr\\17.jpg')

WebUI.uploadFileWithDragAndDrop(findTestObject('scr/Page_/secondscr'), 'C:\\scr1\\17.jpg')

WebUI.verifyElementText(findTestObject('scr/Page_/conclusion'), 'Изображения абсолютно одинаковые!')

WebUI.refresh()

WebUI.uploadFileWithDragAndDrop(findTestObject('scr/Page_/firstscr'), 'C:\\scr\\18.jpg')

WebUI.uploadFileWithDragAndDrop(findTestObject('scr/Page_/secondscr'), 'C:\\scr1\\18.jpg')

WebUI.verifyElementText(findTestObject('scr/Page_/conclusion'), 'Изображения абсолютно одинаковые!')

