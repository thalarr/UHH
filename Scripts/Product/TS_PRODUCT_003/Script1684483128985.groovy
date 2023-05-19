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

WebUI.callTestCase(findTestCase('Login/TS_LOGIN_001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/p_Product'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/button_New Product'))

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/input_Product Name_name'), 
    'Blue Band Cake and Cookie Margarine')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/input_Price_Price'), 
    'IDR 96,100')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/input_Spesification_specification'), 
    '1 Kg')

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/input_Select Branch_branch'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/li_UHH Pasar Rebo, Jakarta Timur'))

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/input_Discount_discount'), 
    '2')

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/li_Physical'))

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/input_Stock_stock'), 
    '50')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/textarea_Blue Band Cake  Cookie Tin 1kgBlue_3f1a97'), 
    'Blue Band Cake & Cookie Tin 1kg\n\nBlue Band Cake and Cookie Margarine Kaleng 1kg. Spesial untuk kue, Blue Band Cake & Cookie merupakan perpaduan sempurna antara margarin dan mentega untuk memberikan aroma harum, rasa, dan tekstur lembut mentega. Tersedia dalam kemasan sachet 200 gram, dan tin 1 kg juga 2 kg. Dengan takaran yang pas, kue hasil olahan menggunakan Blue Band Cake & Cookie akan menjadi renyah dengan tekstur, rasa, dan aroma yang sempurna. Nutrisi yang terkandung juga memberikan gizi pada hasil panggangan kue. Margarin lezat beraroma butter.\n\nIngredients:\nMinyak nabati, air, garam, perisa alami butter (mengandung susu, antioksidan dl-alfa tokoferol), pengemulsi nabati monodigliserida (mengandung antioksidan alfa tokoferol, askorbil palmitat), pengawet kalium sorbat, pengatur keasaman (trinatrium sitrat, asam sitrat), perisa sintetik mentega, antioksidan (BHA & BHT), pewarna alami karoten CI 40800 (mengandung antioksidan dl-alfa tokoferol), sekuestran kalsium dinatrium EDTA.\n\n*PENTING! Diwajibkan pembeli merekam video saat pembukaan paket. Tanpa adanya bukti video, akan sangat sulit untuk kami memproses keluhan Anda.')

WebUI.click(findTestObject('Page_UHH Back Office/product/create/Page_UHH Back Office/div_Drop file or click to upload'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('Page_UHH Back Office/product/create/Page_UHH Back Office/div_Drop file or click to upload'), 
    'D:\\\\blueband.jpeg')

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/span_Create New Product'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/product/create/Page_UHH Back Office/body_0superadminsuperadminDashboardProductB_b2a51f'))

