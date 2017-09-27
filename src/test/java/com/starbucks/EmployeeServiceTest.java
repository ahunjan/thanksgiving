package com.starbucks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import org.junit.Test;

public class EmployeeServiceTest {
	
	@Test
	public void testRegisterEmployee() {
		Employee employee = new Employee("123-49-3944", "Sam", "Samuels");

		//Collaborator
		EmployeeDAO mock = createMock(EmployeeDAO.class);

		//Rehearse
		expect(mock.contains(employee)).andReturn(false);
		expect(mock.insertEmployee(employee)).andReturn(400L);

		//Replay
		replay(mock);
		
		//Subject under test
		EmployeeService employeeService = new EmployeeService(mock);

		//I will be invoking
		Long id = employeeService.register(employee);
		assertThat(id).isEqualTo(400L);
		
		//Verify
		verify(mock);
	}

}
