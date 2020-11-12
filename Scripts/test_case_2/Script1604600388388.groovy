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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('test_case_1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('test_case_3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('test_case_4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/button_Configure'))

WebUI.callTestCase(findTestCase('screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/div_Devices on any WI-FI network'))

WebUI.click(findTestObject('Object Repository/li_Devices on same WI-FI network'))

WebUI.click(findTestObject('Object Repository/div_First-Time Passcode'))

WebUI.click(findTestObject('Object Repository/li_None'))

WebUI.click(findTestObject('Object Repository/span_This is supported only for tvOS 11.2 a_83f1fb'))

WebUI.click(findTestObject('Object Repository/button_Save'))

WebUI.click(findTestObject('Object Repository/div_Profile created successfully'))

