package com.Stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.PageFactory.*;
import com.qa.util.*;
import com.qa.factory.DriverFactory;



public class Array_SD extends TR_PF {
	
	Array_PO as = new Array_PO(DriverFactory.driver);
	TR_PF trpf = new TR_PF();
	String excelpath = ".\\src/test/resource/TestData/tryEditor.xlsx";
	String expectedcode;
	String actcode;
	String output;
	String result;
	
	@Given("user clicks on the dropdown in array module")
	public void user_clicks_on_the_dropdown_in_array_module() throws InterruptedException {
	 Loggerload.info("User in Array Module");	
	  as.dropdown();
	  as.array(); }

	@Given("user clicks on array in python submodule and user clicks on tryhere button")
	public void user_clicks_on_array_in_python_submodule_and_user_clicks_on_tryhere_button() throws InterruptedException {
	   as.Ain_pyth();
	   trpf.th();	}

	@When("user sends valid python code in try editor from excel sheet {string} and {int}")
	public void user_sends_valid_python_code_in_try_editor_from_excel_sheet_and(String SheetName, Integer int1) throws InvalidFormatException, IOException {
		trpf.clear1();
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData(excelpath, SheetName);
		String pycode = testdata.get(int1).get("testData"); 
		//String output= testdata.get(int1).get("output");
		System.out.println(pycode); 	
	as.ar_input(pycode);  }
	
	@Then("user clicks on run button and user get the output in the console")
 	public void user_clicks_on_run_button_and_user_get_the_output_in_the_console() {
    trpf.run();
    as.ar_output(); 
    DriverFactory.refresh(); }
    //trpf.clear1(); }

	@Given("user sends invalid syntax in try editor from excel sheet {string} and {int}")
	public void user_sends_invalid_syntax_in_try_editor_from_excel_sheet_and(String SheetName, Integer int1) throws InterruptedException, InvalidFormatException, IOException {
		trpf.clear1();
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData(excelpath, SheetName);
		String pycode = testdata.get(int1).get("testData");
		//System.out.println(pycode); 
		as.ar_input(pycode);  }
			
	@When("user clicks on run button")
	public void user_clicks_on_run_button() throws InterruptedException {
		trpf.run();	}

	@Then("user gets the alert message and navigates back")
	public void user_gets_the_alert_message_and_navigates_back() throws InterruptedException {
		DriverFactory.getAlertMsg();
		Thread.sleep(500);	
	    DriverFactory.navigateback();
	   Thread.sleep(500);	}

	@Given("user clicks on array using list submodule and user clicks on tryhere button")
	public void user_clicks_on_array_using_list_submodule_and_user_clicks_on_tryhere_button() throws InterruptedException {
		Thread.sleep(1000);
		as.ar_list();
	   trpf.th();	}

	@Then("user clicks on run button and capture the output in console")
	public void user_clicks_on_run_button_and_capture_the_output_in_console() throws InterruptedException {
	   trpf.run();
	   as.ar_output();	
	   DriverFactory.refresh();
	   Thread.sleep(1000); }

	@Given("user clicks on Basic operations in list and user clicks on tryhere button")
	public void user_clicks_on_basic_operations_in_list_and_user_clicks_on_tryhere_button() {
	   as.ar_oper();
	   trpf.th();	}

	//@When("user sends valid python code in try editor from sheet {string} and {int}")
	//public void user_sends_valid_python_code_in_try_editor_from_sheet_and(String string, Integer int1) {}
	   

	@Given("user clicks on Application of array and user clicks on tryhere button")
	public void user_clicks_on_application_of_array_and_user_clicks_on_tryhere_button() {
	   as.app_ar();
	   trpf.th();	}

	@Given("user clicks on Practice Question")
	public void user_clicks_on_practice_question() {
	   as.a_PQ();	}

	@When("user clicks on search the array and clear the try editor")
	public void user_clicks_on_search_the_array_and_clear_the_try_editor() {
	   as.a_PQ1();
	   trpf.clear1(); }
	   //DriverFactory.refresh(); }

	@Then("user sends valid python code in try editor from sheet {string} and {int}")
	public void user_sends_valid_python_code_in_try_editor_from_sheet_and(String SheetName, Integer int1) throws  IOException, InvalidFormatException, InterruptedException {
		Thread.sleep(500);
		trpf.clear1();
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData(excelpath, SheetName);
		String pycode = testdata.get(int1).get("testData");
		System.out.println(pycode);
		as.ar_input(pycode); }  
	
	@Then("user clicks on submit button and capture the output in console")
	public void user_clicks_on_submit_button_and_capture_the_output_in_console() throws InterruptedException {
	   as.submit();
	   Thread.sleep(500); 
	   as.ar_output();	
	   DriverFactory.refresh(); }
	  // trpf.clear1(); }
	
	@Given("user clicks on max consecutive ones and clear the try editor")
	public void user_clicks_on_max_consecutive_ones_and_clear_the_try_editor() throws InterruptedException {
	   as.a_PQ2();
	   Thread.sleep(500);
	   trpf.clear1();	}

	@Given("user clicks on Find numbers with even number of digits and clear the try editor")
	public void user_clicks_on_find_numbers_with_even_number_of_digits_and_clear_the_try_editor() throws InterruptedException {
		as.a_PQ3();
		 Thread.sleep(500);
		trpf.clear1();	}

	@Given("user clicks on the squares of sorted array and clear the try editor")
	public void user_clicks_on_the_squares_of_sorted_array_and_clear_the_try_editor() throws InterruptedException {
	   as.a_PQ4();
	   Thread.sleep(500);
	   trpf.clear1();	}
}
	
	/*@Given("user clicks on the dropdown in array module")
	public void user_clicks_on_the_dropdown_in_array_module() throws InterruptedException {
	  as.dropdown();
	  as.array();	}

	@When("user clicks on array in python submodule and user clicks on tryhere button")
	public void user_clicks_on_array_in_python_submodule_and_user_clicks_on_tryhere_button() {
	  as.Ain_pyth();
	  trpf.th();	}

	@Then("user sends valid python code in try editor from excel sheet {string} and {int}")
	public void user_sends_valid_python_code_in_try_editor_from_excel_sheet_and(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData(excelpath, "Sheet1");
		String pycode = testdata.get(int1).get("pythoncode");
		String output= testdata.get(int1).get("output");
		//System.out.println(pycode);
		as.ar_input(pycode,output);	}

	@Then("user clicks on run button")
	public void user_clicks_on_run_button() {
	  trpf.run();	}

	@Then("user get the output from the console")
	public void user_get_the_output_from_the_console() {
	   as.ar_output();	
	   DriverFactory.refresh();
	   trpf.clear1();}

	@Given("user sends invalid syntax in try editor from excel sheet {string} and {int}")
	public void user_sends_invalid_syntax_in_try_editor_from_excel_sheet_and(String string, Integer int1) throws InvalidFormatException, IOException, InterruptedException {
		DriverFactory.refresh();
		Thread.sleep(3000);
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData(excelpath, "Sheet1");
		String pycode = testdata.get(int1).get("pythoncode");
		String output= testdata.get(int1).get("output");
		//System.out.println(pycode);
		as.ar_input(pycode,output);	}

	//@When("user clicks on run button")
	//public void user_clicks_on_run_button() {	}

	@Then("user gets the alert message and navigates back")
	public void user_gets_the_alert_message_and_navigates_back() throws InterruptedException {
	   DriverFactory.alert();
	   DriverFactory.navigateback();
	   Thread.sleep(2000);}

	@Given("user clicks on array using list submodule and user clicks on tryhere button")
	public void user_clicks_on_array_using_list_submodule_and_user_clicks_on_tryhere_button() {
	    as.ar_list();
	    trpf.th();	}

	//@When("user sends valid python code in try editor from sheet {string} and {int}")
	//public void user_sends_valid_python_code_in_try_editor_from_sheet_and(String string, Integer int1) {}

	@Then("user clicks on run button and capture the output in console")
	public void user_clicks_on_run_button_and_capture_the_output_in_console() throws InterruptedException {
	  trpf.run();
	  as.ar_output();
	  Thread.sleep(3000);}

	@Given("user clicks on Basic operations in list and user clicks on tryhere button")
	public void user_clicks_on_basic_operations_in_list_and_user_clicks_on_tryhere_button() {
	  as.ar_oper();
	  trpf.th();	}

	@Given("user clicks on Application of array and user clicks on tryhere button")
	public void user_clicks_on_application_of_array_and_user_clicks_on_tryhere_button() {
	    as.app_ar();
	    trpf.th();	}

	@Given("user clicks on Practice Question")
	public void user_clicks_on_practice_question() {
	    as.a_PQ();	}

	@When("user clicks on search the array and clear the try editor")
	public void user_clicks_on_search_the_array_and_clear_the_try_editor() {
	    as.a_PQ1();
	    trpf.clear1();	}

	@Then("user sends valid python code in try editor from sheet {string} and {int}")
	public void user_sends_valid_python_code_in_try_editor_from_sheet_and(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData(excelpath, "Sheet1");
		String pycode = testdata.get(int1).get("pythoncode");
		String output= testdata.get(int1).get("output");
		//System.out.println(pycode);
		as.ar_input(pycode,output);
	}

	@Then("user clicks on submit button and capture the output in console")
	public void user_clicks_on_submit_button_and_capture_the_output_in_console() throws InterruptedException {
		as.submit();
		as.ar_output();
		Thread.sleep(2000);
		trpf.clear1();}
		//DriverFactory.navigateback();}

	@Given("user clicks on max consecutive ones and clear the try editor")
	public void user_clicks_on_max_consecutive_ones_and_clear_the_try_editor() {
	    as.a_PQ2();
	    trpf.clear1();	}

	@Given("user clicks on Find numbers with even number of digits and clear the try editor")
	public void user_clicks_on_find_numbers_with_even_number_of_digits_and_clear_the_try_editor() {
	    as.a_PQ3();
	    trpf.clear1();
	}

	@Given("user clicks on the squares of sorted array and clear the try editor")
	public void user_clicks_on_the_squares_of_sorted_array_and_clear_the_try_editor() {
	    as.a_PQ4();
	    trpf.clear1();
	}

	
	/*@When("The user enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String string, Integer int1) throws InvalidFormatException, IOException {
		
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData(excelpath, "sheet1");
		String pycode = testdata.get(int1).get("pythoncode");
		String output= testdata.get(int1).get("output");
		System.out.println(pycode);
		as.ar_input(pycode,output);*/
		
	
	/*@Given("user clicks on the dropdown in array module")
	public void user_clicks_on_the_dropdown_in_array_module() throws InterruptedException {
	  as.dropdown();
	  as.array(); }

	@When("user clicks on array in python submodule and user clicks on tryhere button")
	public void user_clicks_on_array_in_python_submodule_and_user_clicks_on_tryhere_button() {
	   as.Ain_pyth();
	   trpf.th();	}

	@Then("user sends valid python code and clicks on run button and capture the output in console")
	public void user_sends_valid_python_code_and_clicks_on_run_button_and_capture_the_output_in_console() {
	   
		trpf.run();
	   as.ar_output();	}

	@Then("user refresh and send invalid syntax and accept the alert message and navigate back")
	public void user_refresh_and_send_invalid_syntax_and_accept_the_alert_message_and_navigate_back() {
	   
		DriverFactory.refresh();
		trpf.run();
		DriverFactory.alert();	}

	@Given("user clicks on array using list submodule and user clicks on tryhere button")
	public void user_clicks_on_array_using_list_submodule_and_user_clicks_on_tryhere_button() {
	   as.ar_list();
	   trpf.th();	}

	@When("user sends valid python code1 and clicks on run button and capture the output in console")
	public void user_sends_valid_python_code1_and_clicks_on_run_button_and_capture_the_output_in_console() {
		trpf.run();
		as.ar_output();	
		DriverFactory.navigateback(); }

	@Given("user clicks on Basic operations in list and user clicks on tryhere button")
	public void user_clicks_on_basic_operations_in_list_and_user_clicks_on_tryhere_button() {
	    as.ar_oper();
	    trpf.th();	}

	@Given("user clicks on Application of array and user clicks on tryhere button")
	public void user_clicks_on_application_of_array_and_user_clicks_on_tryhere_button() {
	    as.app_ar();
	    trpf.th();
	}

	@Given("user clicks on Practice Question")
	public void user_clicks_on_practice_question() {
	    as.a_PQ();
	}

	@When("user clicks on search the array")
	public void user_clicks_on_search_the_array() {
	    as.a_PQ1();
	}

	@Then("user clear the try editor and send the valid python code and click on run button and capture the output in console")
	public void user_clear_the_try_editor_and_send_the_valid_python_code_and_click_on_run_button_and_capture_the_output_in_console() {
	    trpf.clear1();
		as.ar_output();
	}

	@Then("user refresh and send the invalid syntax and accept the alert message and navigates back")
	public void user_refresh_and_send_the_invalid_syntax_and_accept_the_alert_message_and_navigates_back() {
	    DriverFactory.refresh();
	    DriverFactory.alert();
	}

	@Given("user clicks on max consecutive ones")
	public void user_clicks_on_max_consecutive_ones() {
	    as.a_PQ2();
	}

	@When("user clear the try editor1 and send the valid python code and click on run button and capture the output in console")
	public void user_clear_the_try_editor1_and_send_the_valid_python_code_and_click_on_run_button_and_capture_the_output_in_console() {
		trpf.clear1();
		as.ar_output();
	}

	@Given("user clicks on Find numbers with even number of digits")
	public void user_clicks_on_find_numbers_with_even_number_of_digits() {
	    as.a_PQ3();
	}

	@Given("user clicks on the squares of sorted array")
	public void user_clicks_on_the_squares_of_sorted_array() {
	    as.a_PQ4();
	}
}*/
