package org.example.dummy;

import org.example.ifaces.ProfessorRepository;

public class DummyProfessorRepository implements ProfessorRepository {
	
	public String getQualification() {
		
		throw new AssertionError("not yet implemented");
	}
}
