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

WebUI.navigateToUrl('https://uhh-dev.goorita.com/login')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/product/test/Page_UHH Back Office/input_Email_email'), 
    'superadmin@goorita.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_UHH Back Office/product/test/Page_UHH Back Office/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/test/Page_UHH Back Office/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/test/Page_UHH Back Office/div_Product'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/test/Page_UHH Back Office/button_New Product'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/test/Page_UHH Back Office/label_Drop file or click to upload'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/test/Page_UHH Back Office/div_Drop file or click to upload'))

