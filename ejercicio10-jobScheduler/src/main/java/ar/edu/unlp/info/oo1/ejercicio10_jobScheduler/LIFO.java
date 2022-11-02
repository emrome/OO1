package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class LIFO extends JobScheduler{
	
	public JobDescription obtenerNext() {
    	return this.getJobs().get(this.getJobs().size()-1);
	}

	
}
