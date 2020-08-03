package rest;

import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;

//import junit.framework.Assert;

public class GoogleMap {


//	public static void main(String[] args) throws XmlException, IOException, SoapUIException{
		// TODO Auto-generated method stub
@Test
	public void GoogleMap_REST() throws XmlException, IOException, SoapUIException {
	
		WsdlProject MyProject = new WsdlProject("D:\\oneDrive\\Test\\soapUI\\GoogleMap.xml");

		for (int j = 0; j < MyProject.getTestSuiteCount(); j++)
		{
			WsdlTestSuite MyTestSuite = MyProject.getTestSuiteAt(j);
			
			for (int i = 0; i < MyTestSuite.getTestCaseCount(); i++) 
			{
				WsdlTestCase MyTestCase = MyTestSuite.getTestCaseAt(i);
				WsdlTestCaseRunner runner = MyTestCase.run(new PropertiesMap(), false);
				
				AssertJUnit.assertEquals(Status.FINISHED, runner.getStatus());
			}
		}
	}
}
