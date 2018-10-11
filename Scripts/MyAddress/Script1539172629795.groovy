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

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/span_My addresses'))

WebUI.click(findTestObject('Object Repository/Page_Addresses - My Store/i_Add a new address_icon-chevr'))

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input_Company_company'), 'Psiog')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__address1'), 'No 24 Hussain Maistry Street')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__city'), 'Chennai')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Address - My Store/select_-AlabamaAlaskaArizonaAr'), '39', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__postcode'), '10001')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone'), '9962321440')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone_mobile'), '9962321440')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__alias'), 'My address US')

WebUI.click(findTestObject('Object Repository/Page_Address - My Store/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Addresses - My Store/span_Delete'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_Identity - My Store/span_Back to your account'))

