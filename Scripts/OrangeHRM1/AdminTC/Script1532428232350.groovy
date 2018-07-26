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

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_txtUsername (1)'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_txtPassword (1)'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Submit (1)'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Employee List'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_AllSalesAdministrationI'), '7', true)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__search'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/td_Finance'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_AllSalesAdministrationI'), '6', true)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__search'))

WebUI.verifyElementText(findTestObject('Page_OrangeHRM/td_No Records Found'), 'No Records Found')

