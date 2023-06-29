package hrmlogin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {

	@Keyword(keywordObject='HRM_Login')
	def static Hellomsg(String v) {
		println("Hi "+v)
	}
	@Keyword
	def OpenBrowser() {
		WebUI.openBrowser('')
	}
	@Keyword
	def login() {
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
		WebUI.setText(findTestObject('Object Repository/ScriptMode/UserName'), 'Admin')
		WebUI.setEncryptedText(findTestObject('Object Repository/ScriptMode/Password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/ScriptMode/Page_OrangeHRM/Login_Button'))

	}

}
