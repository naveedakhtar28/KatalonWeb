import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/span_My personal information'))

WebUI.setText(findTestObject('Object Repository/Page_Identity - My Store/input_Last name_lastname'), 'Akhtar')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Identity - My Store/input_Current Password_old_pas'), 'Cis9L3+y/Hajq9w3CmdXtA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Identity - My Store/input_New Password_passwd'), 'Cis9L3+y/Hajq9w3CmdXtA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Identity - My Store/input_Confirmation_confirmatio'), 'Cis9L3+y/Hajq9w3CmdXtA==')

WebUI.click(findTestObject('Object Repository/Page_Identity - My Store/span_Save'))

WebUI.verifyElementText(findTestObject('Page_Identity - My Store/p_Your personal information ha'), 'Your personal information has been successfully updated.')

WebUI.click(findTestObject('Object Repository/Page_Identity - My Store/span_Back to your account'))

def login(def username, def password) {
    WebUI.setText(findTestObject('AutomationPractice/Page_Login - My Store/input_Email address_email'), username)

    WebUI.setEncryptedText(findTestObject('Object Repository/AutomationPractice/Page_Login - My Store/input_Password_passwd'), 
        password)
}

