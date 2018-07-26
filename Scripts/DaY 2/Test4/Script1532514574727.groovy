import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Object Repository/Test4/Page_OrangeHRM/input_txtUsername (1)'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Test4/Page_OrangeHRM/input_txtPassword (1)'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Test4/Page_OrangeHRM/input_Submit (1)'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/dashboard')

WebUI.click(findTestObject('Object Repository/Test4/Page_OrangeHRM/font_Admin'))

WebUI.click(findTestObject('Object Repository/Test4/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('Object Repository/Test4/Page_OrangeHRM/font_To say goodbye'))

WebUI.click(findTestObject('Object Repository/Test4/Page_OrangeHRM/font_Time'))

WebUI.click(findTestObject('Object Repository/Test4/Page_OrangeHRM/font_Recruiting'))

WebUI.click(findTestObject('Object Repository/Test4/Page_OrangeHRM/font_Performance'))

